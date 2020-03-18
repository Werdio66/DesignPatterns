package com._520.decorator;

public class Coffee extends Drick {

    @Override
    protected float getCoust() {
        return super.getPrice();
    }
}
