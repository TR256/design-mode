package org.singleton;

/**
 * @author:tr256
 * @date:2022/6/26
 * 饿汉式：线程安全
 */
public class FirstGameMap {

    private final static FirstGameMap gameMap = new FirstGameMap();
    private FirstGameMap(){}

    public static FirstGameMap getInstance(){
        return gameMap;
    }
}
