package concreteFactory;

import abstractFactory.AbstractFactory;
import abstractProduct.CPU;
import abstractProduct.RAM;
import concreteProduct.MacCPU;
import concreteProduct.MacRAM;

/**
 * @author xh
 * @Date 2023/3/21
 */
public class MacFactory implements AbstractFactory {
    @Override
    public RAM getRAM() {
        return new MacRAM();
    }

    @Override
    public CPU getCPU() {
        return new MacCPU();
    }
}
