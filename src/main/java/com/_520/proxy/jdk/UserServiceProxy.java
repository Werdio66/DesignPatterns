package com._520.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class UserServiceProxy implements InvocationHandler {

    private Object target;

    public UserServiceProxy(Object obj){
        target = obj;
    }

    public <T>T getInstance(){

        return (T)Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method);
        System.out.println("代理前操作");
        Object obj = method.invoke(target, args);
        System.out.println("后置操作");
        return obj;
    }
}
