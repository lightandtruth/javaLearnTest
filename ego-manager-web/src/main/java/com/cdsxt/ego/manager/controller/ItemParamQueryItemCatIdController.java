package com.cdsxt.ego.manager.controller;

import com.cdsxt.ego.beans.EgoResult;
import com.cdsxt.ego.manager.service.ManagerItemParamQueryItemCatIdService;
import org.springframework.beans.Mergeable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.print.attribute.standard.Media;

@Controller
public class ItemParamQueryItemCatIdController {
    @Autowired
    private ManagerItemParamQueryItemCatIdService managerItemParamQueryItemCatIdService;

    public ItemParamQueryItemCatIdController() {
    }

    @RequestMapping(
            value = {"item/param/query/itemcatid/{id}"}, produces = MediaType.APPLICATION_JSON_VALUE +";charset=UTF-8"
    )
    @ResponseBody
    public EgoResult queryByItemCatId(@PathVariable Long id) {
        return this.managerItemParamQueryItemCatIdService.queryByItemCatId(id);
    }
}
