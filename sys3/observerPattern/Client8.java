import concrereObserver.ConcreteInvestor;
import observer.Investor;

/**
 * @author xh
 * @Date 2023/3/31
 */
public class Client8 {

    public static void main(String[] args) {
        System.out.println("详细设计实验报告  2029班刘宇航  2020007694");

        // 股票：1，2  投资者：1，2
        Stock stock1 = new Stock();

        Stock stock2 = new Stock();

        Investor investor1 = new ConcreteInvestor();

        Investor investor2 = new ConcreteInvestor();

        stock1.attach(investor1);

        stock1.setPrice(49);

        stock1.setStockName("股票1");

        stock1.setPrice(50);

        stock2.attach(investor2);

        stock2.setPrice(49);

        stock2.setStockName("股票2");

        stock2.setPrice(100);


        if ((stock1.getPrice() >= 49 * 1.05 ) || (stock1.getPrice() <= 49 * 0.95) ){

            System.out.print(stock1.getStockName());

            investor1.upDate();

        }


        if ((stock2.getPrice() >= 49 * 1.05 ) || (stock2.getPrice() <= 49 * 0.95) ){

            System.out.print(stock2.getStockName());

            investor2.upDate();

        }

    }
}
