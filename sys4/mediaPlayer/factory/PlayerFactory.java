package factory;

import api.PlayerList;
import window.MainWindow;

/**
 * @author xh
 * @Date 2023/4/11
 */
public interface PlayerFactory {

    MainWindow createMainWindow();

    PlayerList createPlayerList();

}
