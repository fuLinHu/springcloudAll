package com.springcloud.custom.service.serviceImpl;

import com.springcloud.custom.service.ShapService;

public class ShapServiceImpl implements ShapService {
    @Override
    public String getSJShap(String shap) {
        System.out.println("SJShap-----------------");
        return "SJShap";
    }

    @Override
    public String getZFShap(String shap) {
        System.out.println("ZFShap-----------------");
        return "ZFShap";
    }

    @Override
    public String getPXShap(String shap) {
        System.out.println("PXShap-----------------");
        return "PXShap";
    }
}
