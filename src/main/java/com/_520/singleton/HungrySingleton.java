package com._520.singleton;

/**
 *   饿汉式
 *  类加载到内存后，就实例化一个单例
 *  缺点：不管用到与否，类装载时就完成实例化
 */
public class HungrySingleton {
    private static HungrySingleton INSTENCE = new HungrySingleton();

//    static {
//        INSTENCE = new HungrySingleton();
//    }

    private HungrySingleton(){}

    private static HungrySingleton getInstence(){
        return INSTENCE;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                HungrySingleton instence = getInstence();
                System.out.println(instence.hashCode());
            }).start();
        }

    }
}
