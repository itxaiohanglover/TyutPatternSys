import abstractFactory.AbstractFactory;
import abstractProduct.CPU;
import abstractProduct.RAM;
import utils.XMLUtil;

/**
 * @author xh
 * @Date 2023/3/21
 */
public class Client1 {
    public static void main(String[] args) {

        try {

            AbstractFactory factory;

            CPU cpu;

            RAM ram;

            factory = (AbstractFactory) XMLUtil.getBean();

            cpu = factory.getCPU();

            ram = factory.getRAM();

            cpu.show();

            ram.show();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }
}
