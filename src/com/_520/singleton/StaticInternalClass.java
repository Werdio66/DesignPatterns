package com._520.singleton;

/**
 * 静态内部类
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 */
public class StaticInternalClass {

    private StaticInternalClass(){}

    private static class Internal{
        private static StaticInternalClass INSTENCE = new StaticInternalClass();
    }

    private static StaticInternalClass getInstence(){
        return Internal.INSTENCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(getInstence());
            }).start();
        }
    }
}
