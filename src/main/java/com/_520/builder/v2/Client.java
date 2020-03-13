package com._520.builder.v2;

public class Client {

    public static void main(String[] args) {
        // 客户端只需要将创建房子的类型将给指挥者
        HouseDirector houseDirector = new HouseDirector(new CommonHouse());
        // 指挥者直接创建房子
        House house = houseDirector.creatHouse();
        System.out.println(house);

        // 如果需要别的类型的房子，只需要 set 注入
        houseDirector.setHouseBuilder(new BigHouse());
        House house1 = houseDirector.creatHouse();
        System.out.println(house1);
    }
}
