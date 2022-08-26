package test;

import org.strategy.jdkproxy.PlayGame;
import org.strategy.jdkproxy.PlayGameProxy;

public class JdkProxy {

    public static void main(String[] args) throws Throwable {

        PlayGame playGame = new PlayGame();

        PlayGameProxy playGameProxy = new PlayGameProxy();

        playGameProxy.invoke(playGame, playGame.getClass().getMethod("play"), null);
    }
}
