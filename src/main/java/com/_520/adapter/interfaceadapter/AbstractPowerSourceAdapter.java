package com._520.adapter.interfaceadapter;

/**
 *  因为电源可以转换为多种，但是可能只用到其中的一个方法，
 *  所以使用抽象类默认去实现接口，在使用到的时候去重写
 */
public class AbstractPowerSourceAdapter implements PowerSource {
    @Override
    public int output5V() {
        return 0;
    }

    @Override
    public int output25V() {
        return 0;
    }

    @Override
    public int output45V() {
        return 0;
    }

    @Override
    public int output55V() {
        return 0;
    }

    @Override
    public int output65V() {
        return 0;
    }
}
