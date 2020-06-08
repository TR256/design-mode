package com.factory.demo;

/**
 * @author: 孟祥洪
 * @Date: 2020/06/08
 * @Description:
 */
public class HeroFactory1 {

    public Hero getHero(String key){
        Hero hero = null;
        switch (key){
            case "jax":
                hero = new Jax();
                break;
            case "rivan":
                hero = new Rivan();
            case "mordekaiser":
                hero = new Mordekaiser();
            default:
                break;
        }
        return hero;
    }

    public static void main(String[] args) {
        HeroFactory1 factory = new HeroFactory1();
        Hero hero = factory.getHero("jax");
        if (hero != null){
            hero.A();
        }
    }
}
