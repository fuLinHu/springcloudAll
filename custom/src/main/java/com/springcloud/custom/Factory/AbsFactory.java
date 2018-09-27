package com.springcloud.custom.Factory;

import com.springcloud.custom.entity.Color;
import com.springcloud.custom.entity.Shap;


public abstract class AbsFactory {
    public abstract Shap getShap(String shap);
    public abstract Color getColor(String color);
}
