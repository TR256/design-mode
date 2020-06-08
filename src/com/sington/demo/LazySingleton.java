package com.sington.demo;

/**
 * @author: 孟祥洪
 * @Date: 2020/06/08
 * @Description: 懒汉式单例模式(线程不安全)
 */
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton(){
        System.out.println("-----执行构造方法------");
    }

    public static LazySingleton getInstance(){
        System.out.println("----获取实例方法----");
        if (instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        LazySingleton instance_1 = LazySingleton.getInstance();
        LazySingleton instance_2 = LazySingleton.getInstance();
        System.out.println(instance_1.equals(instance_2));
        LazySingleton.getInstance();
        LazySingleton.getInstance();
        Long end = System.currentTimeMillis();
    }
}
