package com.factory.demo;

/**
 * @author: 孟祥洪
 * @Date: 2020/06/08
 * @Description:
 */
public class HeroFactory2 {

    public Hero getHero(Class <?extends Hero> clazz){
        Hero hero = null;
        try {
            hero = (Hero) Class.forName(clazz.getName()).newInstance();
        } catch (IllegalAccessException | InstantiationException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return hero;
    }

    public static void main(String[] args) {
        HeroFactory2 factory = new HeroFactory2();
        Hero hero = factory.getHero(Rivan.class);
        if (hero != null){
            hero.A();
        }
    }
}
