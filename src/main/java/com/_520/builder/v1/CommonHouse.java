package com._520.builder.v1;

public class CommonHouse extends HouseBuilder {
    @Override
    protected void creatWall() {
        System.out.println("普通砌墙");
    }

    @Override
    protected void creatHouse() {
        System.out.println("普通房子");
    }
}
