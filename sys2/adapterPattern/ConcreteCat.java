/**
 * @author xh
 * @Date 2023/3/21
 */
public class ConcreteCat implements Cat {

    @Override
    public void cry() {
        System.out.println("小猫叫！");
    }

    @Override
    public void catchMouse() {
        System.out.println("小猫捉老鼠！");
    }
}
