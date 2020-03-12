package com._520.prototype.v2;

/**
 *  使用 clone 方法，拷贝对象
 */
public class Main {

    public static void main(String[] args) {
        Sheep sheep = new Sheep("克隆羊1", 18);

        Sheep sheep1 = (Sheep)sheep.clone();
        Sheep sheep2 = (Sheep)sheep.clone();

        System.out.println(sheep.hashCode());
        System.out.println(sheep1.hashCode());
        System.out.println(sheep2.hashCode());

        System.out.println("============================================");

        System.out.println(sheep == sheep1);
        System.out.println(sheep2 == sheep1);
    }
}
