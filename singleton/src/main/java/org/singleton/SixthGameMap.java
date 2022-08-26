package org.singleton;

/**
 * @author:tr256
 * @date:2022/6/26
 * 使用枚举
 */
public enum SixthGameMap {
    gameMap;
    public SixthGameMap getInstance(){
        return gameMap;
    }
}
