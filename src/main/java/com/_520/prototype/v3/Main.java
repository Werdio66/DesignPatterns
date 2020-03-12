package com._520.prototype.v3;

/**
 *  浅拷贝，如果被拷贝的对象中有一个字段是引用类型，
 *  那么拷贝的对象只是将引用指向了原来的对象，其实是一个对象
 *  不会在堆中新建对象
 */
public class Main {

    public static void main(String[] args) {
        Sheep sheep = new Sheep("克隆羊1", 18);
        sheep.friend = new Sheep("tom", 1);

        Sheep sheep1 = (Sheep)sheep.clone();
        Sheep sheep2 = (Sheep)sheep.clone();

        System.out.println(sheep.hashCode());
        System.out.println(sheep1.hashCode());
        System.out.println(sheep2.hashCode());

        System.out.println("============================================");

        // 输出拷贝对象的 hashCode ，判断是不是同一个对象
        System.out.println(sheep.friend.hashCode());
        System.out.println(sheep1.friend.hashCode());
        System.out.println(sheep2.friend.hashCode());
    }
}
