package com._520.proxy.staticproxy;

public class UserServiceImpl implements UserService {

    @Override
    public void update() {
        System.out.println("更新数据");
    }
}
