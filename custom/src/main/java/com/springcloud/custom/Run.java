package com.springcloud.custom;

import com.springcloud.custom.Factory.AbsFactory;
import com.springcloud.custom.controller.NewFactory;
import com.springcloud.custom.entity.Color;

public class Run {
    public static void main(String[] args) {
        NewFactory newFactory = new NewFactory();
        AbsFactory color = newFactory.getFactory("color");
        Color red = color.getColor("red");

    }
}
