import api.PlayerList;
import factory.PlayerFactory;
import utils.XMLUtil5;
import window.MainWindow;

/**
 * @author xh
 * @Date 2023/4/11
 */
public class ClientClass {
    public static void main(String[] args) {

        System.out.println("软件2029班  刘宇航  2020007694");

        PlayerFactory pfactory;

        MainWindow window;

        PlayerList list;

        pfactory = (PlayerFactory) XMLUtil5.getBean();

        assert pfactory != null;
        window = pfactory.createMainWindow();

        window.window();

        list = pfactory.createPlayerList();

        list.player();
    }
}
