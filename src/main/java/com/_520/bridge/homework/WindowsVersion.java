package com._520.bridge.homework;

/**
 *  Windows 操作系统
 */
public class WindowsVersion extends OsVersion {

    public WindowsVersion(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    protected void play(String fileName) {
        videoFile.decode("Windows", fileName);
    }
}
