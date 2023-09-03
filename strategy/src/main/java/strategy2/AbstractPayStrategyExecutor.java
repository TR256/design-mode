package strategy2;

public class AbstractPayStrategyExecutor {
    public static void PayStrategyExecutor(Class<? extends AbstractPayStrategy> payStrategy) {
        try {
            payStrategy.newInstance().pay();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
