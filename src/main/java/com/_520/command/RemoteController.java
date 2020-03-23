package com._520.command;

import lombok.Getter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 命令的发送者
 */
public class RemoteController {

    private List<Command> onList = new ArrayList<>();
    private List<Command> offList = new ArrayList<>();

    // 记录前面执行的操作
    private LinkedList<Command> undoCommand = new LinkedList<>();

    public RemoteController addOnCommand(Command command){
        onList.add(command);
        return this;
    }

    public RemoteController addOffCommand(Command command){
        offList.add(command);
        return this;
    }

    // 执行打开命令
    public void executeOnCommand(int no){
        if (no > onList.size()){
            throw new RuntimeException("没有这个命令");
        }
        undoCommand.addLast(onList.get(no));
        onList.get(no).execute();
    }

    // 执行关闭命令
    public void executeOffCommand(int no){
        if (no > onList.size()){
            throw new RuntimeException("没有这个命令");
        }
        undoCommand.addLast(offList.get(no));
        offList.get(no).execute();
    }

    // 执行撤销操作
    public void undoCommand(){
        if (undoCommand.size() == 0){
            throw new RuntimeException("上一步已经没有操作，不能撤销");
        }
        Command undoCommandLast = undoCommand.removeLast();
        undoCommandLast.undo();
    }
}
