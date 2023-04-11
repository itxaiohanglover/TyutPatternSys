package window;

import api.MediaPlayerAPI;

/**
 * @author xh
 * @Date 2023/4/11
 */
public class MediaPlayerWindow implements MainWindow {

    public MediaPlayerAPI mediaplayerAPI;

    public MediaPlayerWindow() {

        mediaplayerAPI = new MediaPlayerAPI();

    }


    @Override
    public void window() {

        System.out.println("MediaPlayerWindow");

    }
}
