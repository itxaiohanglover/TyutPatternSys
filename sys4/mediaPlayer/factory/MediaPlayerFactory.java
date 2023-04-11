package factory;

import api.MediaPlayerList;
import api.PlayerList;
import window.MainWindow;
import window.MediaPlayerWindow;

/**
 * @author xh
 * @Date 2023/4/11
 */
public class MediaPlayerFactory implements PlayerFactory {

    @Override
    public MainWindow createMainWindow() {

        return new MediaPlayerWindow();

    }


    @Override
    public PlayerList createPlayerList() {

        return new MediaPlayerList();

    }
}
