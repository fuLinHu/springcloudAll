package com.springcloud.custom.controller;

import com.springcloud.custom.Factory.AbsFactory;
import com.springcloud.custom.Factory.ColorFactory;

public class NewFactory {
    public AbsFactory getFactory(String factory){
        if("color".equals(factory)){
            return new ColorFactory();
        }else if("shap".equals(factory)){
            return null;
        }
        return null;
    }
}
