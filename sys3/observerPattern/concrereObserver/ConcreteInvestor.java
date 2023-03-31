package concrereObserver;

import observer.Investor;

/**
 * @author xh
 * @Date 2023/3/31
 */
public class ConcreteInvestor implements Investor {

    @Override
    public void upDate(){

        System.out.println("价格变化超过5%！");

    }
}
