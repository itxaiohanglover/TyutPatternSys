package director;

import builder.ComputerBuilder;
import product.Computer;

/**
 * @author xh
 * @Date 2023/3/21
 */
public class ComputerAssembleDirector {

    private ComputerBuilder computerBuilder;


    public ComputerAssembleDirector(ComputerBuilder computerBuilder) {

        this.computerBuilder = computerBuilder;

    }


    public Computer construct() {

        computerBuilder.buildCPUs();

        computerBuilder.buildmonitor();

        computerBuilder.buildhardwareEquipment();

        return computerBuilder.getComputer();

    }
}
