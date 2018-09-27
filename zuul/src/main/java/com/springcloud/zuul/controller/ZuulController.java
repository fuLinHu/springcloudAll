package com.springcloud.zuul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ZuulController {
    @RequestMapping("/")
    public Object gart(){
        return null;
    }

}
