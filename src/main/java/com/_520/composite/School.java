package com._520.composite;

import java.util.ArrayList;
import java.util.List;

public class School extends OrgenizitionComponent {

    // 存放的是学院
    private List<OrgenizitionComponent> list = new ArrayList<>();

    public School(String name) {
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
        System.out.println("--" + getName());
        for (OrgenizitionComponent orgenizitionComponent : list) {
            orgenizitionComponent.print();
        }
    }
}
