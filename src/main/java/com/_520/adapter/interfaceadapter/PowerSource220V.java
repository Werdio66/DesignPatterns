package com._520.adapter.interfaceadapter;

/**
 * 插座电压 220 V
 */
public class PowerSource220V {

    public int output220V(){
        int power = 220;
        System.out.println("电源电压为 " + power + " V");
        return power;
    }
}
