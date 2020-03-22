package com._520.templete;

// 纯豆浆
public class OnlySoyiMilk extends SoyiMilk {
    @Override
    protected void add() {
    }

    // 重写钩子函数
    @Override
    protected boolean isAdd() {
        return false;
    }
}
