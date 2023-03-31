import observer.Investor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xh
 * @Date 2023/3/31
 */
public class Stock {
    protected List<Investor> observers = new ArrayList<>();

    String stockName;

    int price;


    public void attach(Investor investor) {

        observers.add(investor);

    }


    public void detach(Investor investor) {

        observers.remove(investor);

    }


    public String getStockName() {

        return stockName;

    }


    public void setStockName(String stockName) {

        this.stockName = stockName;

    }


    public int getPrice() {

        return price;

    }


    public void setPrice(int price) {

        this.price = price;

    }


    public void notifyInvestor() {

        System.out.println("通知：价格变化超过5%！");

        System.out.println("----------------");


        for (Object obs : observers) {

            ((Investor) obs).upDate();

        }

    }

}
