package com._520.factorymethod;

/**
 *  具体被创建的对象：文件日志
 */
public class FileLog implements Log {

    @Override
    public void writeLog() {
        System.out.println("记录文件日志");
    }
}
