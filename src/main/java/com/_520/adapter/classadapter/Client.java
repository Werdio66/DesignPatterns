package com._520.adapter.classadapter;

public class Client {

    public static void main(String[] args) {
        System.out.println("==============类适配器==================");
        Phone phone = new Phone();
        phone.charge(new PowerSourceAdapter());
    }
}
