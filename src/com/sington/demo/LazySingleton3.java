package com.sington.demo;

/**
 * @author: 孟祥洪
 * @Date: 2020/06/08
 * @Description: 懒汉式单例模式(线程安全)
 */
public class LazySingleton3 {

    private volatile static LazySingleton3 instance;

    private LazySingleton3(){
        System.out.println("-----执行构造方法------");
    }

    /**
     * 双重锁
     * @return
     */
    public static synchronized LazySingleton3 getInstance(){
        System.out.println("----获取实例方法----");
        if (instance == null){
            synchronized ((LazySingleton3.class)){
                if (instance == null){
                    instance = new LazySingleton3();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        LazySingleton3 instance_1 = LazySingleton3.getInstance();
        LazySingleton3 instance_2 = LazySingleton3.getInstance();
        System.out.println(instance_1.equals(instance_2));
        LazySingleton3.getInstance();
        LazySingleton3.getInstance();
    }
}
