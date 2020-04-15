package com._520.bridge.homework;

/**
 *  Linux 操作系统
 */
public class LinuxVersion extends OsVersion {

    public LinuxVersion(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    protected void play(String fileName) {
        videoFile.decode("Linux", fileName);
    }
}
