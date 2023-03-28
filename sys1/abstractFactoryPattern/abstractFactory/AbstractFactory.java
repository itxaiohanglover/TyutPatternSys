package abstractFactory;


import abstractProduct.CPU;
import abstractProduct.RAM;

/**
 * @author xh
 * @Date 2023/3/21
 */
public interface AbstractFactory {
    RAM getRAM();

    CPU getCPU();
}
