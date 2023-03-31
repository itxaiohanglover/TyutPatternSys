package concreteStrategy;

import strategy.TravelStrategy;

/**
 * @author xh
 * @Date 2023/3/31
 */
public class BicycleStrategy implements TravelStrategy {

    @Override
    public void travel(){

        System.out.println("骑自行车旅游！");

    }
}
