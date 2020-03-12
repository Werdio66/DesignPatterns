package com._520.prototype.v4;

import com._520.singleton.EnumSingleton;

/**
 *  深拷贝，拷贝对象的所有数据，
 *  引用类型会在堆中开辟新的空间
 *  俩种方式：
 *      1.重写 clone 方法
 *      2.序列化
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("克隆羊1", 18);
        sheep.friend = new Dog("tom");

        // clone
//        Sheep sheep1 = (Sheep)sheep.clone();
//        Sheep sheep2 = (Sheep)sheep.clone();

        // 序列化
        Sheep sheep1 = (Sheep)sheep.deepClone();
        Sheep sheep2 = (Sheep)sheep.deepClone();

        System.out.println(sheep.hashCode());
        System.out.println(sheep1.hashCode());
        System.out.println(sheep2.hashCode());

        System.out.println(sheep1.equals(sheep2));

        System.out.println("============================================================");

        // 输出拷贝对象的 hashCode ，判断是不是同一个对象
        System.out.println(sheep.friend.hashCode());
        System.out.println(sheep1.friend.hashCode());
        System.out.println(sheep2.friend.hashCode());
    }
}
