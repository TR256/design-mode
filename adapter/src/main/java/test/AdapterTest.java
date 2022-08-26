package test;

import org.adapter.MicroUSB;
import org.adapter.TypeC;
import org.adapter.WireAdaptor;

/**
 * @author:tr256
 * @date:2022/8/22
 */
public class AdapterTest {

    public static void main(String[] args) {
        MicroUSB microUSB = new WireAdaptor(new TypeC()).transfer();
    }
}
