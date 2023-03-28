import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author xh
 * @Date 2023/3/21
 */
public class Multiton {

    private static final int MAX_NUM_MULTITON = 2;

    private static ArrayList<Multiton> multitonList = new ArrayList<>(MAX_NUM_MULTITON);

    static {
        for(int i = 0; i < MAX_NUM_MULTITON; ++ i) {
            multitonList.add(new Multiton());
        }
    }

    private Multiton() {
    }

    public static Multiton getInstance() {

        return multitonList.get(random());

    }

    public static synchronized int random() {
        Random random = new Random();
        return random.nextInt(MAX_NUM_MULTITON);
    }
}
