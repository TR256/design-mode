package test.test;

import com.factory.Delevan;
import com.factory.HeroFactory;
import com.factory.Jax;

public class FactoryTest {

    public static void main(String[] args) {
        Jax jax = (Jax) HeroFactory.create(Jax.class);
        jax.A();
        Delevan b = (Delevan) HeroFactory.create(Delevan.class);
        b.A();
    }
}
