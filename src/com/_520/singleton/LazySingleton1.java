package com._520.singleton;

import java.util.concurrent.TimeUnit;

/**
 * 懒汉式
 * 虽然达到了按需初始化的目的，但却带来线程不安全的问题
 */
public class LazySingleton1 {

    private static LazySingleton1 INSTENCE = null;

    private LazySingleton1(){}

    private static LazySingleton1 getInstence(){

        if (INSTENCE == null){

            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTENCE = new LazySingleton1();
        }

        return INSTENCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(getInstence());
            }).start();
        }

    }
}
