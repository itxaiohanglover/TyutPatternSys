package concreteAggregate;

import aggregate.Television;
import concreteIterator.TVIterator;

/**
 * @author xh
 * @Date 2023/3/31
 */
public class SkyTV extends TVIterator implements Television {


    public Object[] obj = {"CCTV1","CCTV2","CCTV3","CCTV4"};



    @Override
    public TVIterator createIterator(){

        return this;

    }



    public SkyTV() {

        super.obj = obj;

    }
}
