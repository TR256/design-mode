package test;

import org.strategy.staticproxy.IPlayGame;
import org.strategy.staticproxy.SelfPlayGame;
import org.strategy.staticproxy.PlayGameProxy;

public class StaticProxyTest {

    public static void main(String[] args) {
        IPlayGame selfPlayGame = new SelfPlayGame();

        PlayGameProxy playGameProxy = new PlayGameProxy(selfPlayGame);

        playGameProxy.play();
    }
}
