import aggregate.Television;
import iterator.Iterator;
import utils.XMLUtil3;

/**
 * @author xh
 * @Date 2023/3/31
 */
public class Client7 {
    public static void main(String[] args) {

        System.out.println("详细设计实验报告  2029班刘宇航  2020007694");

        Television tv;

        tv = (Television) XMLUtil3.getBean();

        display(tv);

        System.out.println("----------------------------------");

        reverseDisplay(tv);
    }

    public static void display(Television tv) {

        Iterator i = tv.createIterator();

        System.out.println("电视机频道:");

        while (!i.isLast()) {

            System.out.println(i.currentChannel().toString());

            i.next();

        }

    }


    public static void reverseDisplay(Television tv) {

        Iterator i = tv.createIterator();

        i.setChannel(4);

        System.out.println("逆向遍历电视机频道：");

        while (!i.isFirst()) {

            i.previous();

            System.out.println(i.currentChannel().toString());

        }

    }
}
