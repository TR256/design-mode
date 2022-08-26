package org.singleton;

/**
 * @author:tr256
 * @date:2022/6/26
 * 懒汉式：线程不安全
 */
public class SecondGameMap {

    private static SecondGameMap gameMap;

    private SecondGameMap() {
    }

    public static SecondGameMap getInstance() {
        if (gameMap == null){
            gameMap = new SecondGameMap();
        }
        return gameMap;
    }

}
