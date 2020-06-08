package com.sington.demo;

/**
 * @author: 孟祥洪
 * @Date: 2020/06/08
 * @Description: 懒汉式单例模式(线程安全)
 */
public class LazySingleton2 {

    private static LazySingleton2 instance;

    private LazySingleton2(){
        System.out.println("-----执行构造方法------");
    }

    public static synchronized LazySingleton2 getInstance(){
        System.out.println("----获取实例方法----");
        if (instance == null){
            instance = new LazySingleton2();
        }
        return instance;
    }

    public static void main(String[] args) {
        LazySingleton2 instance_1 = LazySingleton2.getInstance();
        LazySingleton2 instance_2 = LazySingleton2.getInstance();
        System.out.println(instance_1.equals(instance_2));
        LazySingleton2.getInstance();
        LazySingleton2.getInstance();
    }
}
