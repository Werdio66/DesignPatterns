package com._520.decorator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Drick {

    private String des;

    private float price;

    protected abstract float getCoust();
}
