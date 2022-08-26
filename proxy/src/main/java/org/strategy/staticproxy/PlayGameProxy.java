package org.strategy.staticproxy;


/**
 * 代理类和被代理类一样实现同一个接口
 */
public class PlayGameProxy implements IPlayGame {

    private IPlayGame one;

    public PlayGameProxy(IPlayGame one) {
        this.one = one;
    }


    @Override
    public void play() {
        System.out.println("我请了游戏代练帮我打英雄联盟");
        one.play();
        System.out.println("请了代练后飞速晋级");
    }
}
