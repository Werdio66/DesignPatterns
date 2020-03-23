package com._520.command;

/**
 * 命令，中间传递者
 *  接收发送来的命令，调用执行者的方法去处理
 */
public interface Command {

    void execute();
    void undo();
}
