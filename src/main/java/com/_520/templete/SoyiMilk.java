package com._520.templete;

public abstract class SoyiMilk {

    // 制作模板
    protected void make(){
        select();
        if (isAdd()){
            add();
        }
        soak();
        beat();
    }

    private void select(){
        System.out.println("1、选择材料");
    }

    // 由子类去实现具体加什么配料
    protected abstract void add();

    private void soak(){
        System.out.println("3、浸泡");
    }

    private void beat(){
        System.out.println("4、放入豆浆机");
    }

    // 钩子函数
    protected boolean isAdd(){
        return true;
    }
}
