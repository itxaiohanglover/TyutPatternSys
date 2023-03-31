import builder.ComputerBuilder;
import director.ComputerAssembleDirector;
import product.Computer;
import utils.XMLUtil2;

/**
 * @author xh
 * @Date 2023/3/21
 */
public class Client2 {
    public static void main(String[] args) {

        System.out.println("班级：软件2029班 学号：2020007694  姓名：刘宇航");

        ComputerBuilder computerBuilder = (ComputerBuilder) XMLUtil2.getBean();

        ComputerAssembleDirector computerAssembleDirector = new ComputerAssembleDirector(computerBuilder);

        Computer computer = computerAssembleDirector.construct();

        System.out.println(computer.toString());
    }
}
