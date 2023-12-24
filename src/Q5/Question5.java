package Q5;
import Q4.DeckOfCards;
import Q4.Pair;

public class Question5 {
      
    public static void main(String[] args) {
     
       
        Player player[] = new Player[4] ;
        player[0] = new Player() ;
        player[1] = new Player() ;
        player[2] = new Player() ;
        player[3] = new Player() ;
        int k = 0;
        for (int i = 0; i < 9; i++) {

            for (int j = 0; j <4 ; j++) {
                player[j].addCard(Player.sortedCard.get(k++));
            }
        }

      // print the details of card of each player

      System.out.println("Player 1     player 2    player 3   player 4"); 
      
      for(int i=0;i<9;i++){
          for(int j=0;j<4;j++){

              Pair x = player[j].cards.get(i) ; 
              String card = x.first;
              String suit = DeckOfCards.suits.get(x.second);
              System.out.print(card + " " + suit+ "   ");
      
          }
          System.out.println();
      }
     
      System.out.println("**********************");

     
    }
     

}
