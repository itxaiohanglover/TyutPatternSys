package api;

/**
 * @author xh
 * @Date 2023/4/11
 */
public class RealPlayerList implements PlayerList {

    private RealPlayerAPI realplayerAPI;

    public RealPlayerList() {

        realplayerAPI = new RealPlayerAPI();

    }

    @Override
    public void player() {

        System.out.println("RealPlayerList");

    }
}
