package org.adapter;

/**
 * @author:tr256
 * @date:2022/8/22
 */
public class WireAdaptor {

    private TypeC typeC;

    public WireAdaptor(TypeC typeC) {
        this.typeC = typeC;
    }

    public MicroUSB transfer() {
        // 处理
        return new MicroUSB();
    }
}
