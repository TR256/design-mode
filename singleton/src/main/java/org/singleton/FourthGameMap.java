package org.singleton;

/**
 * @author:tr256
 * @date:2022/6/26
 * 双重锁校验：线程安全
 */
public class FourthGameMap {

    private static FourthGameMap gameMap;

    private FourthGameMap() {
    }

    public static FourthGameMap getInstance() {
        if (gameMap == null){
            synchronized (FifthGameMap.class) {
                if (gameMap == null) {
                    gameMap = new FourthGameMap();
                }
            }
        }
        return gameMap;
    }

}
