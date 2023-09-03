package test;

import org.strategy.EssencePayStrategy;
import org.strategy.PayStrategyExecutor;
import org.strategy.CouponPayStrategy;

public class StrategyTest {

    public static void main(String[] args) {
        new PayStrategyExecutor(EssencePayStrategy.class).executeStrategy();
        new PayStrategyExecutor(CouponPayStrategy.class).executeStrategy();

    }
}
