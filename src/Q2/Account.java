package Q2;
public class Account {

      int balance ;

      public Account(){
        balance =0 ;
      }

      void depositbalance(int amount){
        
      balance += amount ;
      System.out.println("Now current balance is "+amount);
      }

      void withdrawbalance(int amount){

         if(amount > balance){
             System.out.println("Debit amount exceeded account balance");
         }
         else
         {
            balance -= amount ;
            System.out.println("Now available balance is "+ balance);
         }
      }
    
    public static void main(String[] args) {
        
        Account ac = new Account() ;
       
        // deposit some amount 
        ac.depositbalance(100); 

        // withdraw more than the balance 
        ac.withdrawbalance(1000);

        // withdrawl successfull 
        ac.withdrawbalance(10);

    }
}
