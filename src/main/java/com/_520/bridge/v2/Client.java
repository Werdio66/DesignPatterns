package com._520.bridge.v2;

/**
 *  桥接模式
 *
 *  将手机的类型和品牌分离开来，将手机品牌聚合到手机类中，
 *  当新增加手机品牌时，只需要实现 Brand 接口
 *  当新增手机类型时，只需要继承 Phone
 *  相互之间不影响
 *
 *           手机       <--      品牌       将品牌聚合到手机类中
 *        平板 折叠 ...        小米 华为 ..
 *
 */
public class Client {

    public static void main(String[] args) {
        // 小米平板
        Phone phone = new Flat(new XiaoMi());
        phone.open();
        phone.call();

        // 华为折叠手机
        Phone phone1 = new OnRight(new HuaWei());
        phone1.open();
        phone1.call();
    }
}
