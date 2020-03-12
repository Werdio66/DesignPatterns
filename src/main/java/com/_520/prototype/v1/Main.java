package com._520.prototype.v1;

/**
 *  每次克隆羊都需要获取原来的属性值
 */
public class Main {

    public static void main(String[] args) {
        Sheep sheep = new Sheep("克隆羊1", 18);

        Sheep sheep1 = new Sheep(sheep.getName(), sheep.getAge());
        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge());
        Sheep sheep3 = new Sheep(sheep.getName(), sheep.getAge());

        System.out.println(sheep.hashCode());
        System.out.println(sheep1.hashCode());
        System.out.println(sheep2.hashCode());
        System.out.println(sheep3.hashCode());

        System.out.println("============================================");

        System.out.println(sheep == sheep1);
        System.out.println(sheep2 == sheep1);
    }
}
