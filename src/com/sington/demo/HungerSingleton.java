package com.sington.demo;

import java.util.Date;

/**
 * @author: 孟祥洪
 * @Date: 2020/06/08
 * @Description:饿汉式单例模式(线程安全)
 *
 */
public class HungerSingleton {

    private static HungerSingleton instance = new HungerSingleton();

    private HungerSingleton(){
        System.out.println("--执行构造方法------");
    }

    public static HungerSingleton getInstance(){
        System.out.println("----获取实例方法----");
        return instance;
    }

    public static void main(String[] args) {
        HungerSingleton instance_1 = HungerSingleton.getInstance();
        HungerSingleton instance_2 = HungerSingleton.getInstance();
        System.out.println(instance_1.equals(instance_2));
        HungerSingleton.getInstance();
        HungerSingleton.getInstance();
    }
}
