package strategy2;

public class CouponPayStrategy extends AbstractPayStrategy {
    @Override
    public void pay() {
        System.out.println("支付了550点券");
    }
}
