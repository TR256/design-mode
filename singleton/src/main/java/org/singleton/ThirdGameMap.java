package org.singleton;

/**
 * @author:tr256
 * @date:2022/6/26
 * 懒汉式：线程安全
 */
public class ThirdGameMap {

    private static ThirdGameMap gameMap;

    private ThirdGameMap() {
    }

    public static synchronized ThirdGameMap getInstance() {
        if (gameMap == null){
            gameMap = new ThirdGameMap();
        }
        return gameMap;
    }

}
