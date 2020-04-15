package com._520.bridge.homework;

import lombok.AllArgsConstructor;
import lombok.Setter;

/**
 *  操作系统类型
 */
@AllArgsConstructor
@Setter
public abstract class OsVersion {

    /**
     *  聚合视频文件
     */
    protected VideoFile videoFile;

    protected abstract void play(String fileName);
}
