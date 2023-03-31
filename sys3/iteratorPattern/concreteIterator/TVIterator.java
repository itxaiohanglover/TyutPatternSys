package concreteIterator;

import iterator.Iterator;

/**
 * @author xh
 * @Date 2023/3/31
 */
public class TVIterator implements Iterator {

    public Object[] obj;

    public int currentIndex = 0;


    @Override
    public void setChannel(int i) {
        currentIndex = i;
    }

    @Override
    public void next() {

        if (currentIndex < obj.length) {

            currentIndex++;

        }

    }

    @Override
    public void previous() {
        if (currentIndex > 0) {

            currentIndex--;

        }
    }

    @Override
    public boolean isLast() {
        return currentIndex == obj.length;
    }

    @Override
    public Object currentChannel() {
        return obj[currentIndex];
    }

    @Override
    public boolean isFirst() {
        return currentIndex == 0;
    }
}
