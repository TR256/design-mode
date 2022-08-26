package org.strategy.staticproxy;


/**
 * 代理类和被代理类一样实现同一个接口
 */
public class SelfPlayGame implements IPlayGame {
    @Override
    public void play() {
        System.out.println("打游戏");
    }
}
