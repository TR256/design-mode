package com.sington.demo;

/**
 * @author: 孟祥洪
 * @Date: 2020/06/08
 * @Description:
 */
public class InnerSingleton {

    private InnerSingleton(){
        System.out.println("----执行构造方法-----");
    }
    public static InnerSingleton getInstance(){
        System.out.println("---获取实例方法----");
        return Singleton.instance;
    }

    private static class Singleton{
        private static final InnerSingleton instance = new InnerSingleton();
    }

    public static void main(String[] args) {
        InnerSingleton instance_1 = InnerSingleton.getInstance();
        InnerSingleton instance_2 = InnerSingleton.getInstance();
        System.out.println(instance_1.equals(instance_2));
        InnerSingleton.getInstance();
        InnerSingleton.getInstance();
    }
}
