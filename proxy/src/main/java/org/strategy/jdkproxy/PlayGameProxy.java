package org.strategy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


/**
 * 代理类，实现InvocationHandler接口，重写invoke方法
 */
public class PlayGameProxy implements InvocationHandler {


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我请了一个代练带我打游戏");
        Object object = method.invoke(proxy);
        System.out.println("现在我飞速晋级");
        return object;
    }
}
