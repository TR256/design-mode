package org.strategy;

public class PayStrategyExecutor {

    private IPayStrategy payStrategy;

    public PayStrategyExecutor(Class<? extends IPayStrategy> payStrategy) {
        try {
            this.payStrategy = payStrategy.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public void executeStrategy(){
        payStrategy.pay();
    }

}
