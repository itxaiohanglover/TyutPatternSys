package concreteStrategy;

import strategy.TravelStrategy;

/**
 * @author xh
 * @Date 2023/3/31
 */
public class TrainStrategy implements TravelStrategy {

    @Override
    public void travel(){

        System.out.println("坐火车旅游！");

    }
}
