package com.cdsxt.ego.manager.service.impl;

import com.cdsxt.ego.beans.*;
import com.cdsxt.ego.manager.service.ManagerItemService;
import com.cdsxt.ego.rpc.pojo.TbItem;
import org.springframework.beans.factory.annotation.Autowired;
import com.cdsxt.ego.rpc.service.TbItemService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

@Service("managerItemService")
public class ManagerItemServiceImpl implements ManagerItemService {
    @Autowired
    private TbItemService itemServiceProxy;

    @Override
    public PageResult<TbItem> selectItemListService(Integer page, Integer rows) {
        // TODO Auto-generated method stub
        return itemServiceProxy.selectItemList(page, rows);

    }
    /**
     * 商品的上架
     */
    @Override
    public EgoResult reshelfItem(Long[] ids) {
        // TODO Auto-generated method stub
        //1、将ids数据转化为List集合
        List<Long> itemIds =Arrays.asList(ids);
        String a ="jfdklskjf";
        System.out.println(a);
        //调用远程服务
        return itemServiceProxy.updateItemService(itemIds, true);
    }
    /**
     * 商品的下架
     */
    @Override
    public EgoResult instockItem(Long[] ids) {
        // TODO Auto-generated method stub
        //1、将ids数据转化为List集合
        List<Long> itemIds = Arrays.asList(ids);
        //调用远程服务
        return itemServiceProxy.updateItemService(itemIds, false);
    }

    @Override
    public EgoResult deleteItems(Long[] ids) {
        List<Long> itemIds = Arrays.asList(ids);
        return itemServiceProxy.deleteItemService(itemIds);
    }

    @Value("${FTP_HOST}")
    private String hostname;
    @Value("${FTP_PORT}")
    private Integer port;
    @Value("${FTP_USERNAME}")
    private String username;
    @Value("${FTP_PASSWORD}")
    private String password;
    @Value("${FTP_PATH}")
    private String pathname;
    @Value("${IMAGE_HTTP_PATH}")
    private String remoteURL;
    @Override
    public PictureResult uploadImage(MultipartFile file) {
        boolean result = false;
        PictureResult p = new PictureResult();
        String originalFilename = file.getOriginalFilename();
        String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
        String remote = IDUtil.getImageName() + suffix;
        try {
            InputStream inputStream = file.getInputStream();
            result = FtpUtil.uploadFile(hostname, port, username, password, pathname, inputStream, remote);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(result){
            p.setError(0);
            p.setUrl(remoteURL+"/"+remote);
        }else{
            p.setError(1);
            p.setMessage("失败");
        }
        return p;
    }
}
