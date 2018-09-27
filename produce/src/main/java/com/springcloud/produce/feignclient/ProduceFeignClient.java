package com.springcloud.produce.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="produceProject")
public interface ProduceFeignClient {
    @RequestMapping(value="/project/{id}")
    public String getParamFromProduceProject(@PathVariable("id") Long id);
}
