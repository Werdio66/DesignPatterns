package com._520.factorymethod;

/**
 *  由工厂去生产日志类
 */
public class Client {

    public static void main(String[] args) {
        // 创建文件日志记录对象
        LogFactory flieLogFactory = new FileLogFactory();
        Log log = flieLogFactory.createLog();
        log.writeLog();
        System.out.println("==============================");
        // 创建数据库日志记录对象
        LogFactory dataBaseLogFactory = new DataBaseLogFactory();
        Log dataBaseLog = dataBaseLogFactory.createLog();
        dataBaseLog.writeLog();
    }
}
