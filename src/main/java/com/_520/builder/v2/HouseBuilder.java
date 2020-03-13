package com._520.builder.v2;

/**
 *  抽象的建造者
 */
public abstract class HouseBuilder {

    /**
     *  将产品组合到抽象类中，如何处理产品由子类去实现
     */
    protected House house = new House();

    /**
     *  具体怎么建房子由子类去实现
     */
    protected abstract void creatWall();

    /**
     *  具体怎么建房子由子类去实现
     */
    protected abstract void creatHouse();

    /**
     *  构建房子，将建房子的具体流程交给
     */
    public House buildHouse() {
        return house;
    }
}
