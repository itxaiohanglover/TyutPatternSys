/**
 * @author xh
 * @Date 2023/3/21
 */
public class Multiton {

    private static Multiton multiton1 = new Multiton();

    private static Multiton multiton2 = new Multiton();


    private Multiton() {}

    public static Multiton getInstance(int random) {

        if (1 == random) {

            return multiton1;

        } else {

            return multiton2;

        }

    }

    public synchronized void random() {

        int random = (int) (Math.random() * 3 + 1);

    }
}
