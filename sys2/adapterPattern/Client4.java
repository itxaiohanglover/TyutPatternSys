/**
 * @author xh
 * @Date 2023/3/21
 */
public class Client4 {
    public static void main(String[] args) {

        System.out.println("班级：软件2029班 学号：2020007694  姓名：刘宇航");

        Cat cat = new Adapter(new ConcreteDog());

        cat.cry();

        cat.catchMouse();


        Dog dog = new Adapter(new ConcreteCat());

        dog.wang();

        dog.action();

    }
}
