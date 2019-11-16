package com._520.singleton;

import java.util.concurrent.TimeUnit;

/**
 * 懒汉式
 * 虽然达到了按需初始化的目的，但却带来线程不安全的问题
 * 可以通过synchronized解决，但也带来效率下降
 */
public class LazySingleton2 {

    private static LazySingleton2 INSTENCE = null;

    private LazySingleton2(){}

    private synchronized static LazySingleton2 getInstence(){

        if (INSTENCE == null){

            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTENCE = new LazySingleton2();
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
