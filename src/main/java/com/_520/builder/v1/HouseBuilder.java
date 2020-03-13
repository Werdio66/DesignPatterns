package com._520.builder.v1;

public abstract class HouseBuilder {

    protected abstract void creatWall();

    protected abstract void creatHouse();

    public void build() {
        creatWall();
        creatHouse();
    }
}
