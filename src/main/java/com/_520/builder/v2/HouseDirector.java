package com._520.builder.v2;

/**
 *  指挥者，负责处理具体的构建流程
 */
public class HouseDirector {

    /**
     *  将建造者聚合到指挥者中，指挥者去控制构建的流程
     */
    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House creatHouse(){
        houseBuilder.creatWall();
        houseBuilder.creatHouse();
        return houseBuilder.buildHouse();
    }
}
