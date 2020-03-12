package com._520.singleton;

import java.util.concurrent.TimeUnit;

/**
 * 懒汉式
 * 双重检查，线程安全
 */
public class LazySingleton4 {

    private static LazySingleton4 INSTENCE = null;

    private LazySingleton4(){}

    private static LazySingleton4 getInstence(){

        if (INSTENCE == null){

            // 减少同步代码块
            synchronized (LazySingleton4.class){
                try {
                    TimeUnit.MILLISECONDS.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (INSTENCE == null)   // 双重检查
                INSTENCE = new LazySingleton4();
            }

        }

        return INSTENCE;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                LazySingleton4 instence = getInstence();
                System.out.println(instence.hashCode());
            }).start();
        }

    }
}
