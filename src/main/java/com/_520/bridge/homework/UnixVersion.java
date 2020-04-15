package com._520.bridge.homework;

/**
 *  Unix 操作系统
 */
public class UnixVersion extends OsVersion {

    public UnixVersion(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    protected void play(String fileName) {
        videoFile.decode("Unix", fileName);
    }
}
