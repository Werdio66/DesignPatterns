package com._520.composite;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class OrgenizitionComponent {

    private String name;

    protected void add(OrgenizitionComponent orgenizitionComponent){
        throw new RuntimeException("不支持操作");
    }

    protected void remove(OrgenizitionComponent orgenizitionComponent){
        throw new RuntimeException("不支持操作");
    }

    protected abstract void print();
}
