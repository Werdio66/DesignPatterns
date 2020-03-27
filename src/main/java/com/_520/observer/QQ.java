package com._520.observer;

public class QQ extends Observer {
    @Override
    public void display() {
        System.out.println("=========QQ的天气预报==============");
        System.out.println("温度 : " + temperature);
        System.out.println("气压 : " + pressure);
        System.out.println("湿度 : " + humidity);
    }
}
