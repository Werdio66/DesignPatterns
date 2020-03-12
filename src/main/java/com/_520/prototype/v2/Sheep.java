package com._520.prototype.v2;

import lombok.*;

@AllArgsConstructor
@ToString
@Getter
@Setter
public class Sheep implements Cloneable {

    private String name;
    private Integer age;

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
