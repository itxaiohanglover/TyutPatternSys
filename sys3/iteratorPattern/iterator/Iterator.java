package iterator;

/**
 * @author xh
 * @Date 2023/3/31
 */
public interface Iterator {
    void setChannel(int i);

    void next();

    void previous();

    boolean isLast();

    Object currentChannel();

    boolean isFirst();
}
