package org.adapter.one;

/**
 * @author:tr256
 * @date:2022/8/22
 * 进行改造
 */
public class WireAdaptor implements MicroUSB {

    private TypeC typeC;

    public WireAdaptor(TypeC typeC) {
        this.typeC = typeC;
    }

    @Override
    public void charge() {
        System.out.println("经过适配调用");
        // 进行改造
        typeC.typeCCharge();
    }
}
