package test;

import com.builder.Hero;
import com.builder.HeroDirector;
import com.builder.JaxBuilder;

/**
 * @author:tr256
 * @date:2022/8/26
 */
public class BuilderTest {

    public static void main(String[] args) {
        JaxBuilder jaxBuilder = new JaxBuilder();
        Hero jax = new HeroDirector(jaxBuilder).getHero();
        System.out.println(jax.getA());
    }
}
