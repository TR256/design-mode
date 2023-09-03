package test;

import org.adapter.one.TypeC;
import org.adapter.one.WireAdaptor;

/**
 * @author:tr256
 * @date:2022/8/22
 */
public class AdapterTest {

    public static void main(String[] args) {
        new WireAdaptor(new TypeC()).charge();
    }
}
