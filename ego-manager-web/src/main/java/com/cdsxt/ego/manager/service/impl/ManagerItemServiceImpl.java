package com.cdsxt.ego.manager.service.impl;

import com.cdsxt.ego.beans.EgoResult;
import com.cdsxt.ego.beans.PageResult;
import com.cdsxt.ego.manager.service.ManagerItemService;
import com.cdsxt.ego.rpc.pojo.TbItem;
import org.springframework.beans.factory.annotation.Autowired;
import com.cdsxt.ego.rpc.service.TbItemService;
import org.springframework.stereotype.Service;

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
}
