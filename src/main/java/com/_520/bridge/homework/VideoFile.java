package com._520.bridge.homework;

/**
 * 播放视频文件
 */
public interface VideoFile {

    /**
     *  播放视频
     * @param osType        操作系统类型
     * @param fileName      文件名称
     */
    void decode(String osType, String fileName);
}
