package factory;

import api.PlayerList;
import api.RealPlayerList;
import window.MainWindow;
import window.RealPlayerWindow;

/**
 * @author xh
 * @Date 2023/4/11
 */
public class RealPlayerFactory implements PlayerFactory {

    @Override
    public MainWindow createMainWindow() {

        return new RealPlayerWindow();

    }


    @Override
    public PlayerList createPlayerList() {

        return new RealPlayerList();

    }
}
