package Q3;

import java.util.ArrayList;

public class Main { 

   static public ArrayList<Stock> companyStocks= new ArrayList<>() ; 
    
    public static void main(String[] args) {
         
        Stock st1 = new Stock("Tata",25,25000) ;
        Stock st2 = new Stock("Tesla", 20  ,50000) ; 
        Stock st3 = new Stock("Jio", 100  ,500) ; 
       
        companyStocks.add(st1) ;
        companyStocks.add(st2) ; 
        companyStocks.add(st3) ; 

        StockAccount navneet = new StockAccount() ; 
        navneet.buy(12,"Tata");  // Buy stock if possible 
        navneet.buy(5,"Tata");  
         navneet.printReport();
        navneet.sell(2, "Tata");   // selling stock if possible 

        navneet.printReport();
  

    }
}
