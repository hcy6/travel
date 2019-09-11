package org.lanqiao.travel.controller;

import org.lanqiao.travel.service.sqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class sqController {

    @Autowired
    sqService sqService;

    @RequestMapping("/getA")
    public List getAllArticles(){
        return sqService.getAllArticle();
    }

    @RequestMapping("/getW")
    public  List getAllWork(){
        return sqService.getAllWork();
    }


}
