package com._520.singleton;

/**
 * 枚举单例
 */
public enum  EnumSingleton {
    INSTENCE;

    private EnumSingleton(){}

    private void dowork(){
        System.out.println("-------------------");
    }
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(EnumSingleton.INSTENCE.hashCode());
            }).start();
        }
        INSTENCE.dowork();
    }
}
