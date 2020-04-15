package com._520.bridge.homework;

public class Client {
    public static void main(String[] args) {

        // 在 Windows 上播放 AVI 格式的火影忍者
        OsVersion windows = new WindowsVersion(new AVIFile());
        windows.play("火影忍者");

        // 在 Linux 上播放 MPEG 格式的火影忍者
        OsVersion linux = new LinuxVersion(new MPEGFile());
        linux.play("火影忍者");

        // 当需要在新的 unix 操作系统播放 WMV 格式的文件时，
        // 只需要让 Unix 继承 OsVersion，WMVFile 实现 VideoFile 而不需要修改源代码
        // 在 Unix 上播放 WMV 格式的火影忍者
        OsVersion unix = new UnixVersion(new WMVFile());
        unix.play("火影忍者");
    }
}
