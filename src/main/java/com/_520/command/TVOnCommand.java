package com._520.command;

public class TVOnCommand implements Command {

    private TV tv;

    public TVOnCommand(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        System.out.print("撤销操作 - ");
        tv.off();
    }
}
