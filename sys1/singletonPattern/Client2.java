/**
 * @author xh
 * @Date 2023/3/21
 */
public class Client2 {

    public static void main(String[] args) {

        System.out.println("班级：软件2029班 学号：2020007694  姓名：刘宇航");

        Multiton multiton1 = Multiton.getInstance();

        Multiton multiton2 = Multiton.getInstance();

        Multiton multiton3 = Multiton.getInstance();

        System.out.println(multiton1 == multiton2);

        System.out.println(multiton2 == multiton3);

        System.out.println(multiton1 == multiton3);

    }
}
