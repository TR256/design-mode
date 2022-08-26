package org.singleton;

/**
 * @author:tr256
 * @date:2022/6/26
 * 使用内部类，线程安全
 */
public class FifthGameMap {
   private static class GameMapWrapper {
      private static final FifthGameMap gameMap = new FifthGameMap();
   }
   private FifthGameMap(){}

   public static FifthGameMap getInstance(){
      return GameMapWrapper.gameMap;
   }

}
