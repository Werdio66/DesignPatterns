package com._520.observer;

/**
 *  天气预报的接收方
 */

public abstract class Observer {

    // 温度
    protected int temperature;
    // 气压
    protected int pressure;
    // 湿度
    protected int humidity;

    // 更新天气信息
    public void update(int temperature, int pressure, int humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    // 具体的接收方，比如 qq，百度等
    public abstract void display();
}
