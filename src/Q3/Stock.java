package Q3;

public class Stock {
    
    private String name ;
    private int noOfShare ; 
    private int sharePrice ; 
    private int totalValue ;

    public Stock(){

    }

    public Stock(String name, int noOfShare, int sharePrice) {
        this.name = name;
        this.noOfShare = noOfShare;
        this.sharePrice = sharePrice;
        this.totalValue = noOfShare * sharePrice ;

    }

    public void printStockReport(){ 
        System.out.println("name of stock" + name);
        System.out.println("no of share is"+ noOfShare);
        System.out.println("Each Share price "+ sharePrice);
       System.out.println("Total value"+totalValue);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfShare() {
        return noOfShare;
    }

    public void setNoOfShare(int noOfShare) {
        this.noOfShare = noOfShare;
    }

    public int getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(int sharePrice) {
        this.sharePrice = sharePrice;
    }

    public int getTotalValue() {
        return noOfShare * sharePrice;
    }

    public void setTotalValue() {
        this.totalValue = noOfShare * sharePrice;
    }

    @Override
    public String toString() {
        return "Stock [name=" + name + ", noOfShare=" + noOfShare + ", sharePrice=" + sharePrice + ", totalValue="
                + noOfShare*sharePrice + "]";
    }



    

}
