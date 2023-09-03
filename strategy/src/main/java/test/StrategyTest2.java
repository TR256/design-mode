package test;


import strategy2.AbstractPayStrategyExecutor;
import strategy2.CouponPayStrategy;
import strategy2.EssencePayStrategy;

public class StrategyTest2 {

    public static void main(String[] args) {
        AbstractPayStrategyExecutor.PayStrategyExecutor(EssencePayStrategy.class);
        AbstractPayStrategyExecutor.PayStrategyExecutor(CouponPayStrategy.class);
    }
}
