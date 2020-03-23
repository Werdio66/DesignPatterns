package com._520.command;

/*
    关闭电灯命令
 */
public class LinghtOffCommand implements Command {

    // 聚合电灯对象，执行开关灯操作
    private Light light;

    public LinghtOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        System.out.print("撤销操作 - ");
        light.on();
    }
}
