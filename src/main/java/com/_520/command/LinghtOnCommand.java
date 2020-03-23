package com._520.command;

/*
    打开电灯命令
 */
public class LinghtOnCommand implements Command {

    // 聚合电灯对象，执行开关灯操作
    private Light light;

    public LinghtOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        System.out.print("撤销操作 - ");
        light.off();
    }
}
