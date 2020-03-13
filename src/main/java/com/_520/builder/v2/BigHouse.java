package com._520.builder.v2;

/**
 *  具体的建造者
 *  只负责实现具体的创建过程
 */
public class BigHouse extends HouseBuilder {

    @Override
    protected void creatWall() {
        house.setWall("大房子的墙");
    }

    @Override
    protected void creatHouse() {
        house.setHouseName("大房子");
    }
}
