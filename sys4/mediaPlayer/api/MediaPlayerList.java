package api;

/**
 * @author xh
 * @Date 2023/4/11
 */
public class MediaPlayerList implements PlayerList {

    public MediaPlayerAPI mediaplayerAPI;

    public MediaPlayerList() {

        mediaplayerAPI = new MediaPlayerAPI();

    }


    @Override
    public void player() {

        System.out.println("MediaPlayerList");

    }
}
