package com._520.decorator;

/**
 *  巧克力调味品
 */
public class Chocolate extends Decorator {
    public Chocolate(Drick drick) {
        super(drick);
        setDes("巧克力调味品");
        setPrice(1.5f);
    }

    @Override
    public float getCoust() {
        return super.getCoust();
    }
}
