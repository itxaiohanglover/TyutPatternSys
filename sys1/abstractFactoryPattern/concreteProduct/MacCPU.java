package concreteProduct;

import abstractProduct.CPU;

/**
 * @author xh
 * @Date 2023/3/21
 */
public class MacCPU implements CPU {
    @Override
    public void show() {
        System.out.println("Mac的CPU");
    }
}
