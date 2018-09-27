package com.springcloud.custom.service.serviceImpl;

import com.springcloud.custom.service.ColorService;

import java.awt.*;

public class ColorServiceImpl implements ColorService {

    @Override
    public String getRed(String color) {
        System.out.println("red-----------------");
        return "red";
    }

    @Override
    public String getYellow(String color) {
        System.out.println("Yellow-----------------");
        return "Yellow";
    }

    @Override
    public String getGreen(String color) {
        System.out.println("Green-----------------");
        return "Green";
    }
}
