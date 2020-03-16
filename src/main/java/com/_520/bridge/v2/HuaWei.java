package com._520.bridge.v2;

public class HuaWei implements Brand {
    @Override
    public void call(String phoneType) {
        System.out.println("华为" + phoneType + "打电话");
    }

    @Override
    public void open(String phoneType) {
        System.out.println("华为" + phoneType + "开机");
    }
}
