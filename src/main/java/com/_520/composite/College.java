package com._520.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *  学院
 */
public class College extends OrgenizitionComponent {

    // 存放的是专业
    private List<OrgenizitionComponent> list = new ArrayList<>();

    public College(String name) {
        super(name);
    }

    @Override
    protected void add(OrgenizitionComponent orgenizitionComponent) {
        list.add(orgenizitionComponent);
    }

    @Override
    protected void remove(OrgenizitionComponent orgenizitionComponent) {
        list.remove(orgenizitionComponent);
    }

    @Override
    protected void print() {
        System.out.println("----" + getName());
        for (OrgenizitionComponent orgenizitionComponent : list) {
            orgenizitionComponent.print();
        }
    }
}
