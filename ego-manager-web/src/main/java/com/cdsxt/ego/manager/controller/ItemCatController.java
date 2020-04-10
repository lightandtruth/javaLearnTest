package com.cdsxt.ego.manager.controller;

import com.cdsxt.ego.beans.TreeNode;
import com.cdsxt.ego.manager.service.ManagerItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ItemCatController {
    //注入service对象
    @Autowired
    private ManagerItemCatService managerItemCatService;
    /**
     * 实现内容树展示
     * @param id
     * @return
     * required：是否默认参数为必须的， true：是  false：否  默认为true(是否每次都从0开始展示)
     */
    @RequestMapping(value="/item/cat/list",produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8")
    @ResponseBody
    public List<TreeNode> itemCatList(@RequestParam(defaultValue="0",required=false)Long id){
        return managerItemCatService.getItemCatList(id);

    }
}
