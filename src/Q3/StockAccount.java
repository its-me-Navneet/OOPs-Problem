package Q3;

import java.util.ArrayList;

public class StockAccount implements StockInterface {

    public ArrayList<Stock> list = new ArrayList<>();

    private Stock checkAvailable(int noOfShare, String name) {

        for (Stock stock : Main.companyStocks) {
            if (stock.getName() == name && stock.getNoOfShare() >= noOfShare)
                return stock;
        }
        return null;
    }

    @Override
    public void buy(int noOfShare, String name) {
        Stock stock = checkAvailable(noOfShare, name);
        if (stock != null) {

            int available = stock.getNoOfShare();
            stock.setNoOfShare(available - noOfShare);
            Stock alreadyBuy = findStock(name);
            if (alreadyBuy == null) {
                list.add(new Stock(name, noOfShare, stock.getSharePrice()));
            }
            System.out.println("Succesfully stock added to your account ");

        } else {
            System.out.println("Not available to buy");
        }

    }

    @Override
    public void sell(int noOfShare, String name) {

        Stock bought = getStock(noOfShare, name);
        if (bought == null) {
            System.out.println("Sorry , you dont bought such stock ");
            return;
        }

        int remaining = bought.getNoOfShare() - noOfShare;

        if (remaining > 0) {
            bought.setNoOfShare(remaining);
        } else {
            list.remove(bought);
        }

    }

    @Override
    public void printReport() {

        for (Stock st : list) {
            System.out.println(st);
        }
    }

    @Override
    public int totalValue() {

        int totalAmount = 0;

        for (Stock st : list) {
            totalAmount += st.getTotalValue();
        }

        return totalAmount;
    }

    private Stock findStock(String name) {

        for (Stock st : list) {
            if (st.getName() == name)
                return st;
        }

        return null;

    }

    private Stock getStock(int noOfShare, String name) {

        for (Stock st : list) {
            if (st.getName() == name && st.getNoOfShare() >= noOfShare)
                return st;
        }

        return null;
    }

}
