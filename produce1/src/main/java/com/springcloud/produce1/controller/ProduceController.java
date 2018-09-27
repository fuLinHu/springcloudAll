package com.springcloud.produce1.controller;


import com.springcloud.produce1.entity.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProduceController {

   /* @RequestMapping("/{id}")
    public String findById(@PathVariable Long id){
        return "这是生产方的方法8882 "+id;

    }*/

    @RequestMapping(value = "/produceUser",method= RequestMethod.GET)
    public User getUser(User user){
        user.setUserName(user.getUserName()+"  produceUserName");
        return user;
    }

}
