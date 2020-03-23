package com._520.command;

/**
 *  命令模式：将发送方和接收方解耦
 *
 *  发送方 -> Command -> 接收方
 */
public class Client {

    public static void main(String[] args) {
        // 发送者
        RemoteController controller = new RemoteController();
        // 操作的对象
        Light light = new Light();
        TV tv = new TV();
        // 加入开灯，开电视操作
        controller.addOnCommand(new LinghtOnCommand(light)).
                    addOnCommand(new TVOnCommand(tv));
        // 加入关灯操作
        controller.addOffCommand(new LinghtOffCommand(light)).addOffCommand(new TVOffCommand(tv));
        // 执行打开第一个命令
        controller.executeOnCommand(0);
        controller.executeOnCommand(1);
//        controller.executeOffCommand(0);
        // 执行撤销操作
        controller.undoCommand();
        controller.undoCommand();
    }
}
