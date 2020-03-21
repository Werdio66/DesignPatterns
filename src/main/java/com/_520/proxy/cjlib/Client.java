package com._520.proxy.cjlib;

/**
 *  cjlib 动态代理
 *  不需要代理类实现接口
 *  继承代理类
 */
public class Client {

    public static void main(String[] args) {
        UserServiceProxy userServiceProxy = new UserServiceProxy(new UserServiceImpl());

        UserServiceImpl userService = userServiceProxy.getInstance();
//        System.out.println(userService.getClass());
        System.out.println("================================");
        System.out.println(userService);
        System.out.println("================================");
//        userService.update();
        System.out.println("================================");
        System.out.println(userService.equals(""));

    }
}
