package com._520.adapter.objectadapter;

/**
 *  适配器类：将电压由 220 V 转换为 5 V
 */
public class PowerSourceAdapter implements PowerSource5V {

    // 将目标类聚合到适配器类中
    private PowerSource220V powerSource220V;

    public PowerSourceAdapter(PowerSource220V powerSource220V) {
        this.powerSource220V = powerSource220V;
    }

    // 转换电压
    @Override
    public int output5V() {
        int src = powerSource220V.output220V();
        int desc = src / 44;
        return desc;
    }
}
