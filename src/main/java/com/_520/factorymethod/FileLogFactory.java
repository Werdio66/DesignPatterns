package com._520.factorymethod;

/**
 *  创建文件日志的工厂
 */
public class FileLogFactory implements LogFactory {

    @Override
    public Log createLog() {
        return new FileLog();
    }

}
