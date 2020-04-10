package com._520.factorymethod;

/**
 * 创建日志对象的接口，具体的创建过程由子类去决定
 */
public interface LogFactory {

    /**
     *  具体创建对象
     * @return      日志对象
     */
    Log createLog();
}
