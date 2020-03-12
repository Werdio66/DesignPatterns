package com._520.singleton;

import java.util.concurrent.TimeUnit;

/**
 * 懒汉式
 * 可以按需初始化，但是线程不安全
 * 可以通过synchronized解决，效率下降
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
                LazySingleton2 instence = getInstence();
                System.out.println(instence.hashCode());
            }).start();
        }

    }
}
