package com._520.facade;

/**
 *  客户端不需要知道文件加密的具体流程，
 *  只需要了解加密的文件名称和加密后的文件名称
 */
public class Client {

    public static void main(String[] args) {
        EncryptFacade facade = new EncryptFacade();
        // 对文件进行加密
        facade.fileEncrypt("火影忍者", "海贼王");
    }
}
