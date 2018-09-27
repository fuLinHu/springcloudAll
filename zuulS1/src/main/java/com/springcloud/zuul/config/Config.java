package com.springcloud.zuul.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.springcloud.zuul.zuulfilter.MyZuulFilter;

@Configuration
public class Config {
    @Bean
    public MyZuulFilter myZuulFilter(){
        return new MyZuulFilter();
    }
}
