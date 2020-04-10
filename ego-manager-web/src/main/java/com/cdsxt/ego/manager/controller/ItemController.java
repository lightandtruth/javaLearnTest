package com.cdsxt.ego.manager.controller;

import com.cdsxt.ego.beans.EgoResult;
import com.cdsxt.ego.beans.PageResult;
import com.cdsxt.ego.manager.service.ManagerItemService;
import com.cdsxt.ego.rpc.pojo.TbItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ItemController {
    @Autowired
    private ManagerItemService managerItemService;
    /**
     * 处理商品信息分页查询的请求
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping(value="item/list",produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8")
    @ResponseBody
    public PageResult<TbItem> itemList(@RequestParam(defaultValue="1")Integer page, @RequestParam(defaultValue="30")Integer rows){

        System.out.println("jlfjdslfshkjfsfjldsjlf");
        return managerItemService.selectItemListService(page, rows);

    }

    /**
     * 处理商品上架的请求
     * @param ids
     * @return
     */
    @RequestMapping(value="item/reshelf",produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8")
    @ResponseBody
    public EgoResult reshelfItem(Long[]ids) {

        return managerItemService.reshelfItem(ids);

    }

    /**
     * 处理商品下架的请求
     * @param ids
     * @return
     */
    @RequestMapping(value="item/instock",produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8")
    @ResponseBody
    public EgoResult instockItem(Long[]ids) {

        return managerItemService.instockItem(ids);

    }

    @RequestMapping(value = "item/delete",produces = MediaType.APPLICATION_JSON_VALUE+";charset=UTF-8")
    public EgoResult deleteItem(Long[] ids){
        return managerItemService.deleteItems(ids);
    }

}
