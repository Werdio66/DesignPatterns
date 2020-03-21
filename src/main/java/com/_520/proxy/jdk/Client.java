package com._520.proxy.jdk;

/**
 *  jdk 动态代理
 *  需要代理类实现接口
 *  生成的代理也实现接口
 */
public class Client {

    public static void main(String[] args) {
        UserServiceProxy userServiceProxy = new UserServiceProxy(new UserServiceImpl());

        UserService userService = userServiceProxy.getInstance();
//        System.out.println(userService.getClass());
//        System.out.println(userService);
        userService.update();
    }
}
