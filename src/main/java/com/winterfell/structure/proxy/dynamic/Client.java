package com.winterfell.structure.proxy.dynamic;

/**
 * @author : zhuzhenjie
 **/
public class Client {
    public static void main(String[] args) {
        Action real = new Real();
        MyInvocationHandler<Action> h = new MyInvocationHandler<>(real);
        Action proxy = h.getProxy();
        proxy.action();

    }
}
