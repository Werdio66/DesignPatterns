package com._520.adapter.classadapter;

/**
 *  适配器类：将电压由 220 V 转换为 5 V
 *
 *  优点：可以扩展被适配的类
 *  缺点：使用了继承，调用了被适配类中的方法
 */
public class PowerSourceAdapter extends PowerSource220V implements PowerSource5V {

    // 转换电压
    @Override
    public int output5V() {
        int src = output220V();
        int desc = src / 44;
        return desc;
    }
}
