import abstractFactory.AbstractFactory;
import abstractProduct.CPU;
import abstractProduct.RAM;
import utils.XMLUtil1;

/**
 * @author xh
 * @Date 2023/3/21
 */
public class Client1 {
    public static void main(String[] args) {

        try {

            System.out.println("班级：软件2029班 学号：2020007694  姓名：刘宇航");

            AbstractFactory factory;

            CPU cpu;

            RAM ram;

            factory = (AbstractFactory) XMLUtil1.getBean();

            cpu = factory.getCPU();

            ram = factory.getRAM();

            cpu.show();

            ram.show();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }
}
