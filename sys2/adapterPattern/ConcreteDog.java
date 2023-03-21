/**
 * @author xh
 * @Date 2023/3/21
 */
public class ConcreteDog implements Dog {

    @Override
    public void wang() {
        System.out.println("小狗叫！");
    }

    @Override
    public void action() {
        System.out.println("小狗动！");
    }
}
