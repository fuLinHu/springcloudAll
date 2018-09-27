package com.springcloud.zuul.zuulfilter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


import javax.servlet.http.HttpServletRequest;


public class MyZuulFilter extends ZuulFilter {

    private static final Log log = LogFactory.getLog(MyZuulFilter.class);
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext cx = RequestContext.getCurrentContext();
        HttpServletRequest request = cx.getRequest();
        System.out.println("------------过滤器--------------------");
        return request;
    }
}
