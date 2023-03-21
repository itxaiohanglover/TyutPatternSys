/**
 * @author xh
 * @Date 2023/3/21
 */
public class Client2 {
    private static Multiton multiton1;

    private static Multiton multiton2;

    private static Multiton multiton3;

    public static void main(String[] args) {

        multiton1 = Multiton.getInstance(1);

        multiton2 = Multiton.getInstance(2);

        multiton3 = Multiton.getInstance(3);

        System.out.println(multiton1 == multiton2);

        System.out.println(multiton2 == multiton3);


    }
}
