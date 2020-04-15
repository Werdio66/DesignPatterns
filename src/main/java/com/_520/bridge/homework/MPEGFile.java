package com._520.bridge.homework;

/**
 *  MPEG 格式的文件
 */
public class MPEGFile implements VideoFile {

    @Override
    public void decode(String osType, String fileName) {
        System.out.println("在 " + osType + " 操作系统上解码播放 MPEG 格式的 <<" + fileName + ">> 文件");
    }

}
