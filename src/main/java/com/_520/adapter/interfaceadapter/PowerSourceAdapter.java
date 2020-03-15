package com._520.adapter.interfaceadapter;

/**
 *  适配器类：将电压由 220 V 转换为 5 V
 *
 *  因为手机只需要将电源转换为 5 V 即可
 *  所以实现转换为 5 V 的方法
 */
public class PowerSourceAdapter extends AbstractPowerSourceAdapter {

    // 将目标类聚合到适配器类中
    private PowerSource220V powerSource220V;

    public PowerSourceAdapter(PowerSource220V powerSource220V) {
        this.powerSource220V = powerSource220V;
    }

    @Override
    public int output5V() {
        int src = powerSource220V.output220V();
        return src / 44;
    }
}
