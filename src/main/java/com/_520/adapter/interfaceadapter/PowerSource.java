package com._520.adapter.interfaceadapter;

/**
 *  电源适配器：可以将电源转换为多种
 */
public interface PowerSource {

    public int output5V();
    public int output25V();
    public int output45V();
    public int output55V();
    public int output65V();
}
