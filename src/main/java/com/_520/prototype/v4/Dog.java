package com._520.prototype.v4;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@ToString
@Getter
@Setter
public class Dog implements Cloneable, Serializable {

    public String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
