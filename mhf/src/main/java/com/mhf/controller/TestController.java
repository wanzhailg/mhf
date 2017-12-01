package com.mhf.controller;

import com.mhf.common.base.controller.BaseController;
import com.mhf.common.base.entity.JsonContainer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController extends BaseController{

    @RequestMapping("/hello/{name}")
    public JsonContainer hello(@PathVariable String name){
        JsonContainer jsonContainer = getJsonContainer();
        setSuccessMessage(jsonContainer, name);
        return jsonContainer;
    }

    @RequestMapping("/hello1/{name}")
    public String hello1(@PathVariable String name){
        return name;
    }

}