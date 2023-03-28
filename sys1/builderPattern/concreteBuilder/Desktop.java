package concreteBuilder;

import builder.ComputerBuilder;

/**
 * @author xh
 * @Date 2023/3/21
 */
public class Desktop extends ComputerBuilder {

    @Override
    public void buildCPUs(){

        computer.setCPUs("CPU 内存 硬盘 主机 ");

    }

    @Override
    public void buildmonitor(){

        computer.setMonitor("显示器 ");

    }

    @Override
    public void buildhardwareEquipment(){

        computer.setHardwareEquipment(null);

    }
}
