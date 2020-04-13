package com.cdsxt.ego.manager.controller;

import com.cdsxt.ego.beans.PictureResult;
import com.cdsxt.ego.manager.service.ManagerItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class ItemImageController {
    @Autowired
    private ManagerItemService managerItemService;

    public ItemImageController() {
    }

    @ResponseBody
    @RequestMapping(value = {"pic/upload"},produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8" )
    public PictureResult uploadImage(MultipartFile uploadFile) {
        return this.managerItemService.uploadImage(uploadFile);
    }
}
