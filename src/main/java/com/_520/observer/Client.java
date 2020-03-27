package com._520.observer;

public class Client {

    public static void main(String[] args) {
        // 气象台对象
        WeatherData weatherData = new WeatherData();
        // 创建接入方
        Observer baidu = new Baidu();
        Observer qq = new QQ();
        // 接入方接收气象台信息
        weatherData.registerObserver(baidu);
        weatherData.registerObserver(qq);
        // 气象台设置最新天气情况
        weatherData.setData(20, 25, 22);
        // 气象台将信息发送给所有的接收方
        weatherData.notifyObservers();
    }
}
