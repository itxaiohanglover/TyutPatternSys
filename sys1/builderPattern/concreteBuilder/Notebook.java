package concreteBuilder;

import builder.ComputerBuilder;

/**
 * @author xh
 * @Date 2023/3/21
 */
public class Notebook extends ComputerBuilder {
    @Override
    public void buildCPUs() {

        computer.setCPUs(null);

    }

    @Override
    public void buildmonitor() {

        computer.setMonitor(null);

    }

    @Override
    public void buildhardwareEquipment() {

        computer.setHardwareEquipment("独自一套硬件设备");

    }
}
