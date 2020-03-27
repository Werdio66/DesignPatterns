package com._520.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *  气象站
 */
public class WeatherData implements Subject {

    private int temperature;
    private int pressure;
    private int humidity;
    
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // 当天气更新时执行
    public void setData(int temperature, int pressure, int humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        // 更新完后传递给各个平台（观察者）
//        notifyObservers();
    }
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, pressure, humidity);
        }
    }
}
