package com._520.observer;

/**
 *  具体的观察者，天气预报的接入方
 */
public class Baidu extends Observer {

    @Override
    public void display() {
        System.out.println("=========百度的天气预报==============");
        System.out.println("温度 : " + temperature);
        System.out.println("气压 : " + pressure);
        System.out.println("湿度 : " + humidity);
    }
}
