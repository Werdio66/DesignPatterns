package com._520.bridge.v2;

/**
 * 把手机抽象
 */
public abstract class Phone {

    /**
     *  将手机品牌聚合到手机类型中
     */
    private Brand brand;

    public Phone(Brand brand){
        this.brand = brand;
    }


    protected String getPhoneName(){
        return "直板";
    }

    /**
     *  实际调用的品牌中的方法
     */
    protected void open(){
        brand.open(getPhoneName());
    }

    protected void call(){
        brand.call(getPhoneName());
    }
}
