package test;

import org.singleton.FirstGameMap;

/**
 * @author:tr256
 * @date:2022/8/26
 */
public class FirstGameMapTest {

    public static void main(String[] args) {
        FirstGameMap gameMap1 = FirstGameMap.getInstance();
        System.out.println("gameMap1:" +gameMap1.hashCode());
        FirstGameMap gameMap2 = FirstGameMap.getInstance();
        System.out.println("gameMap2:" +gameMap2.hashCode());
    }
}
