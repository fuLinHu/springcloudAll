package com.springcloud.custom.feignclient;

import com.springcloud.custom.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(name="produce")
public interface CustomFeignClient {
    @RequestMapping(value="/{id}")
    public String getParamFromProduce(@PathVariable("id") Long id);

    /**
     * @param user
     * @return
     * 当请求的数据为  get时，并且参数较多时   调用方 用@RequestParam Map<String,Object> user
     * 来封装参数  然后提供接口的方法就可以  按照springmvc 的对象模型的方式接受这些参数
     */
    @RequestMapping(value="/produceUser",method = RequestMethod.GET)
    public User getUser(@RequestParam Map<String,Object> user);
}
