package com._520.adapter.interfaceadapter;

public class Client {

    public static void main(String[] args) {
        System.out.println("==============接口适配器==================");
        Phone phone = new Phone();
        phone.charge(new PowerSourceAdapter(new PowerSource220V()));
    }
}
