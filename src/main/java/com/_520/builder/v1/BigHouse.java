package com._520.builder.v1;

public class BigHouse extends HouseBuilder {
    @Override
    protected void creatWall() {
        System.out.println("大房子砌墙");
    }

    @Override
    protected void creatHouse() {
        System.out.println("大房子");
    }
}
