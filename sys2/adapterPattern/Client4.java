/**
 * @author xh
 * @Date 2023/3/21
 */
public class Client4 {
    public static void main(String[] args) {
        Cat cat = new Adapter(new ConcreteDog());

        cat.cry();

        cat.catchMouse();


        Dog dog = new Adapter(new ConcreteCat());

        dog.wang();

        dog.action();

    }
}
