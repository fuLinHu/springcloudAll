package com.springcloud.custom.Factory;

import com.springcloud.custom.entity.*;
import com.springcloud.custom.service.ColorService;
import com.springcloud.custom.service.ShapService;

public class ColorFactory extends AbsFactory{


    @Override
    public Shap getShap(String shap) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if("red".equals(color)){
            return new Red();
        }else if("green".equals(color)){
            return new Green();
        }else if("yellow".equals(color)){
            return new Yellow();
        }
        return null;
    }
}
