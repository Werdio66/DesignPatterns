package com._520.singleton;

import java.util.concurrent.TimeUnit;

/**
 * 懒汉式
 * 减少同步代码块，线程不安全
 */
public class LazySingleton3 {

    private static LazySingleton3 INSTENCE = null;

    private LazySingleton3(){}

    private static LazySingleton3 getInstence(){

        if (INSTENCE == null){
            // 可能会有多个线程在这里等着
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 减少同步代码块
            synchronized (LazySingleton3.class){
                INSTENCE = new LazySingleton3();
            }
        }

        return INSTENCE;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                LazySingleton3 instence = getInstence();
                System.out.println(instence.hashCode());
            }).start();
        }

    }
}
