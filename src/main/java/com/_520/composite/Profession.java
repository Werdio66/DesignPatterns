package com._520.composite;

/**
 *  专业，叶子结点
 */
public class Profession extends OrgenizitionComponent {

    public Profession(String name) {
        super(name);
    }

    @Override
    protected void print() {
        System.out.println("------" + getName());
    }
}
