package com._520.singleton;

/**
 * 枚举单例
 */
public enum  EnumSingleton {

    INSTENCE;

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(EnumSingleton.INSTENCE.hashCode());
            }).start();
        }

    }
}
