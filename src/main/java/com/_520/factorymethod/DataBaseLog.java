package com._520.factorymethod;

/**
 *  具体被创建的对象：数据库日志
 */
public class DataBaseLog implements Log {

    @Override
    public void writeLog() {
        System.out.println("数据库日志");
    }
}
