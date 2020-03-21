package com._520.proxy.staticproxy;

public class UserServiceProxy implements UserService {

    private UserService userService;

    public UserServiceProxy(){
        userService = new UserServiceImpl();
    }

    @Override
    public void update() {
        beforeAdvice();
        userService.update();
        afterAdvice();
    }

    private void beforeAdvice(){
        System.out.println("前置增强");
    }

    private void afterAdvice(){
        System.out.println("后置增强");
    }
}
