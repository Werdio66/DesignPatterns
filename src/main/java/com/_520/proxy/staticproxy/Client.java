package com._520.proxy.staticproxy;

public class Client {

    public static void main(String[] args) {

        UserService userService = new UserServiceProxy();
        userService.update();
    }
}
