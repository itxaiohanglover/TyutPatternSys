package concreteFactory;

import abstractFactory.AbstractFactory;
import abstractProduct.CPU;
import abstractProduct.RAM;
import concreteProduct.PcCPU;
import concreteProduct.PcRAM;

/**
 * @author xh
 * @Date 2023/3/21
 */
public class PcFactory implements AbstractFactory {
    @Override
    public RAM getRAM() {
        return new PcRAM();
    }

    @Override
    public CPU getCPU() {
        return new PcCPU();
    }
}
