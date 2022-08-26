package com.builder;

/**
 * @author:tr256
 * @date:2022/8/26
 * 抽象的建造者
 */
public abstract class HeroBuilder {
    protected Hero hero = new Hero();

    public abstract void setA();
    public abstract void setQ();
    public abstract void setW();
    public abstract void setE();
    public abstract void setR();
    public abstract Hero getHero();
}
