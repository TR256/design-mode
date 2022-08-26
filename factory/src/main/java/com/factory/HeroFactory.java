package com.factory;

public class HeroFactory {

    public static Hero create(Class<?> clazz){
        try {
            return (Hero) clazz.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
