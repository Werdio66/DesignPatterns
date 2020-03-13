package com._520.builder.v2;

/**
 *  具体的具体的建造者
 */
public class CommonHouse extends HouseBuilder {

    @Override
    protected void creatWall() {
        house.setWall("普通的墙");
    }

    @Override
    protected void creatHouse() {
        house.setHouseName("普通房子");
    }
}
