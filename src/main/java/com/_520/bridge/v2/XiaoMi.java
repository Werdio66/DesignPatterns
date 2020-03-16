package com._520.bridge.v2;

public class XiaoMi implements Brand {

    @Override
    public void call(String phoneType) {
        System.out.println("小米" + phoneType + "打电话");
    }

    @Override
    public void open(String phoneType) {
        System.out.println("小米" + phoneType + "开机");
    }
}
