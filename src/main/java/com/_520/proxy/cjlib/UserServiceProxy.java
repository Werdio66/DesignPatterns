package com._520.proxy.cjlib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;

public class UserServiceProxy implements InvocationHandler {

    private Object target;

    public UserServiceProxy(Object obj){
        target = obj;
    }

    public <T>T getInstance(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return (T) enhancer.create();
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
