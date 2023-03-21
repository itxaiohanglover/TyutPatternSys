package mainFrame;

import function.CPU;
import function.HardDisk;
import function.Memory;
import function.OS;

/**
 * @author xh
 * @Date 2023/3/21
 */
public class Mainframe {
    public Memory memory = new Memory();

    private CPU cpu = new CPU();

    private HardDisk hardDisk = new HardDisk();

    private OS os = new OS();


    public void on() {

        memory.check();

        cpu.run();

        hardDisk.read();

        os.load();

    }

}
