package strategy2;

public class EssencePayStrategy extends AbstractPayStrategy {
    @Override
    public void pay() {
        System.out.println("支付了5500的蓝色精粹");
    }
}
