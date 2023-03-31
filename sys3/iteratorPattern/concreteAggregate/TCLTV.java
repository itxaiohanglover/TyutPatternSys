package concreteAggregate;

import aggregate.Television;
import concreteIterator.TVIterator;

/**
 * @author xh
 * @Date 2023/3/31
 */
public class TCLTV extends TVIterator implements Television {

    private Object[] obj = {"湖南TV", "北京TV", "上海TV", "山西TV"};


    @Override
    public TVIterator createIterator() {

        return this;

    }


    public TCLTV() {

        super.obj = obj;

    }
}
