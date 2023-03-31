import handler.Person;
import strategy.TravelStrategy;
import utils.XMLUtil4;

/**
 * @author xh
 * @Date 2023/3/31
 */
public class Client9 {
    public static void main(String[] args) {
        System.out.println("详细设计实验报告  2029班刘宇航  2020007694");



        Person person = new Person();



        TravelStrategy strategy ;

        strategy = (TravelStrategy) XMLUtil4.getBean();



        person.setStrategy(strategy);

        strategy.travel();
    }
}
