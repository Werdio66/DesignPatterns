package com._520.factorymethod;

/**
 *  创建数据库日志对象的工厂
 */
public class DataBaseLogFactory implements LogFactory {

    @Override
    public Log createLog() {
        return new DataBaseLog();
    }
}
