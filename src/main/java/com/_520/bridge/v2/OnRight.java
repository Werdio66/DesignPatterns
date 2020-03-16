package com._520.bridge.v2;

/**
 *  折叠型
 *  具体的手机类型
 */
public class OnRight extends Phone {

    public OnRight(Brand brand) {
        super(brand);
    }

    @Override
    protected String getPhoneName() {
        return "折叠手机";
    }
}
