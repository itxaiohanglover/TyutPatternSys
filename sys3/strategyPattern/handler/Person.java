package handler;

import strategy.TravelStrategy;

/**
 * @author xh
 * @Date 2023/3/31
 */
public class Person {
    private TravelStrategy strategy;


    public void setStrategy(TravelStrategy strategy) {

        this.strategy = strategy;

    }


    public void travel() {

    }
}
