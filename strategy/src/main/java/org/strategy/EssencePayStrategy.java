package org.strategy;

public class EssencePayStrategy implements IPayStrategy {
    @Override
    public void pay() {
        System.out.println("支付了5500的蓝色精粹");
    }
}
