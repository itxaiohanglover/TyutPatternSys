package concreteProduct;

import abstractProduct.RAM;

/**
 * @author xh
 * @Date 2023/3/21
 */
public class MacRAM implements RAM {
    @Override
    public void show() {
        System.out.println("Mac的RAM");
    }
}
