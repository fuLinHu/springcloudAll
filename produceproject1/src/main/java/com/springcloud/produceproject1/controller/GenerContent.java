package com.springcloud.produceproject1.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/project")
@RestController
public class GenerContent {

    @RequestMapping("/{id}")
    public String getProject1Value(@PathVariable("id") Long ids){
        return "这是project的数据:"+ids;
    }
}
