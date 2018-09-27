package com.springcloud.produce.controller;


import com.springcloud.produce.entity.User;
import com.springcloud.produce.feignclient.ProduceFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.beans.Transient;

@RestController
public class ProduceController {

    @Autowired(required = false)
    private ProduceFeignClient produceFeignClient;

   /* @RequestMapping("/{id}")
    public String findById(@PathVariable Long id){
        String paramFromProduceProject = produceFeignClient.getParamFromProduceProject(id);
        return "这是生产方的方法8888 "+id+"-------->>>>>>>"+paramFromProduceProject;
    }*/
    @RequestMapping(value= "/produceUser",method= RequestMethod.GET)
    public User getUser(User user){
        user.setUserName(user.getUserName()+"  produceUserName");
        return user;
    }

}
