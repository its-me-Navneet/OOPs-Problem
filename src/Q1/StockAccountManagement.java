package Q1;

import java.util.Scanner;

public class StockAccountManagement {
    
    
    public static void main(String[] args) {
        
        Stock st1 = new Stock("Tata",25,25000) ;
        Stock st2 = new Stock("Tesla", 20  ,50000) ;

        Scanner sc = new Scanner(System.in) ;

        Stock st3 = new Stock() ;
       
         System.out.println("Enter details of stock");
        st3.setName(sc.next());
        st3.setNoOfShare(sc.nextInt());
        st3.setSharePrice(sc.nextInt());
        st3.setTotalValue(); 

        System.out.println( "Total value of stock 1 is  " + st1.getTotalValue());  
        System.out.println( "Total value of stock 2 is  " + st2.getTotalValue());  
        System.out.println( "Total value of stock 3 is  " + st3.getTotalValue());  

        // Stock report output 

        int totalValue = st1.getTotalValue() + st2.getTotalValue() + st3.getTotalValue() ; 

        System.out.println("Total value of stock is " +totalValue);
        sc.close();
        
    }

}
