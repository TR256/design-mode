package org.strategy;

public class CouponPayStrategy implements IPayStrategy {
    @Override
    public void pay() {
        System.out.println("支付了550点券");
    }
}
