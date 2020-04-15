package com._520.bridge.homework;

/**
 * AVI 格式的文件
 */
public class AVIFile implements VideoFile {

    @Override
    public void decode(String osType, String fileName) {
        System.out.println("在 " + osType + " 操作系统上解码播放 AVI 格式的 <<" + fileName + ">> 文件");
    }

}
