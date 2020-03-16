package com._520.bridge.v2;

/**
 *  平板
 */
public class Flat extends Phone {
    public Flat(Brand brand) {
        super(brand);
    }

    @Override
    protected String getPhoneName() {
        return "平板手机";
    }
}
