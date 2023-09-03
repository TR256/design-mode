package com.builder;

/**
 * @author:tr256
 * @date:2022/8/26
 * 德莱文
 */
public class DelevanBuilder extends HeroBuilder{

    @Override
    public void setA() {
        hero.setA("德莱文联盟");
    }

    @Override
    public void setQ() {

        hero.setQ("德莱文的Q");
    }

    @Override
    public void setW() {
        hero.setW("德莱文的W");
    }

    @Override
    public void setE() {
        hero.setE("德莱文的E");
    }

    @Override
    public void setR() {
        hero.setR("德莱文的R");
    }

    @Override
    public Hero getHero() {
        return hero;
    }
}
