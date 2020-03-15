package com._520.adapter.classadapter;

/**
 * 手机充电
 */
public class Phone {

    /**
     *  充电
     * @param powerSource5V     充电的适配器
     */
    public void charge(PowerSource5V powerSource5V){
        if (powerSource5V.output5V() == 5) {
            System.out.println("电压转换为 5 V 可以充电");
        }
    }
}
