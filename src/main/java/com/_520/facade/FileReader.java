package com._520.facade;

/**
 * 读取文件内容
 */
public class FileReader {

    /**
     *  读取源文件内容
     * @param fileNameSrc       读取的文件名称
     * @return                  文件内容
     */
    public String read(String fileNameSrc){
        System.out.println("1、读取 " + fileNameSrc + " 文件");
        return fileNameSrc;
    }
}
