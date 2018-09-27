package com.springcloud.custom.controller;

import com.springcloud.custom.entity.User;
import com.springcloud.custom.feignclient.CustomFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/custom")
public class Custom {
    @Value("${server.port}")
    private String key;

    @Autowired(required = false)
    private CustomFeignClient customFeignClient;

    @RequestMapping("hello")
    public String getValue(){
        return key;
    }

    @RequestMapping("/{id}")
    public String getProduce(@PathVariable Long id){
        return customFeignClient.getParamFromProduce(id);
    }
    @RequestMapping("/user")
    public User getProduceUser(User user){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("age",user.getAge());
        map.put("userName",user.getUserName());
        return customFeignClient.getUser(map);
    }
}
