package com.builder;

/**
 * @author:tr256
 * @date:2022/8/26
 */
public class HeroDirector {
    private HeroBuilder heroBuilder;

    public HeroDirector(HeroBuilder heroBuilder) {
        this.heroBuilder = heroBuilder;
    }

    public Hero getHero(){
        heroBuilder.setQ();
        heroBuilder.setW();
        heroBuilder.setE();
        heroBuilder.setR();
        heroBuilder.setA();
        return heroBuilder.getHero();
    }
}
