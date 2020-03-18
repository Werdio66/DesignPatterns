package com._520.decorator;

/**
 *  装饰器 : 调味品
 */
public abstract class Decorator extends Drick {

    private Drick drick;

    public Decorator(Drick drick){
        this.drick = drick;
    }

    @Override
    public float getCoust(){
        // 计算价格  调味品的价格 + 单品的价格
        return getPrice() + drick.getPrice();
    }
}
