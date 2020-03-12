package com._520.prototype.v3;

import lombok.*;

@ToString
@Getter
@Setter
public class Sheep implements Cloneable {

    private String name;
    private Integer age;

    public Sheep friend;

    public Sheep(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() {

        Sheep sheep = null;
        try {
            sheep = (Sheep)super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        return sheep;
    }
}
