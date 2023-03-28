package product;

import builder.ComputerBuilder;

/**
 * @author xh
 * @Date 2023/3/21
 */
public class Computer {

    private String CPUs;//CPU

    private String monitor;//显示器

    private String hardwareEquipment;//笔记本使用自己独自的一套硬件设备

    public String getCPUs() {
        return CPUs;
    }

    public void setCPUs(String CPUs) {
        this.CPUs = CPUs;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getHardwareEquipment() {
        return hardwareEquipment;
    }

    public void setHardwareEquipment(String hardwareEquipment) {
        this.hardwareEquipment = hardwareEquipment;
    }

    @Override
    public String toString() {
        return "该计算机的组成：{" +
                "CPUs='" + CPUs + '\'' +
                ", monitor='" + monitor + '\'' +
                ", hardwareEquipment='" + hardwareEquipment + '\'' +
                '}';
    }
}
