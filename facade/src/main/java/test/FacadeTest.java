package test;

import com.facade.Facade;

public class FacadeTest {

    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.oneOperate();

        facade.twoOperate();

        facade.threeOperate();
    }
}
