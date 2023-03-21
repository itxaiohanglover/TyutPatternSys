/**
 * @author xh
 * @Date 2023/3/21
 */
public class Adapter implements Cat, Dog {
    Dog dog;

    Cat cat;

    public Adapter(Dog dog) {

        this.dog = dog;

    }


    public Adapter(Cat cat) {

        this.cat = cat;

    }


    @Override

    public void wang() {

        System.out.println("小狗叫！");

    }


    @Override

    public void action() {

        cat.catchMouse();

    }


    @Override

    public void cry() {

        System.out.println("小猫叫！");

    }


    @Override

    public void catchMouse() {

        dog.action();

    }

}
