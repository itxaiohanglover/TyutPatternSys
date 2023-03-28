package builder;

import product.Computer;

/**
 * @author xh
 * @Date 2023/3/21
 */
public abstract class ComputerBuilder {

    protected Computer computer = new Computer();


    public abstract void buildCPUs();//CPU

    public abstract void buildmonitor();//显示器

    public abstract void buildhardwareEquipment();//笔记本使用自己独自的一套硬件设备


    public Computer getComputer() {

        return computer;

    }

}
