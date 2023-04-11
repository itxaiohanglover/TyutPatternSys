package window;

import api.RealPlayerAPI;

/**
 * @author xh
 * @Date 2023/4/11
 */
public class RealPlayerWindow implements MainWindow {

    private RealPlayerAPI realplayerAPI = new RealPlayerAPI();


    @Override
    public void window() {

        System.out.println("RealPlayerWindow");

    }
}
