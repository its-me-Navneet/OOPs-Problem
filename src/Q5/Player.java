package Q5;
import java.util.ArrayList;

import Q4.DeckOfCards;
import Q4.Pair;

public class Player {
     
     static ArrayList<Pair> sortedCard =new ArrayList<>() ; 
    
     public ArrayList<Pair> cards = new ArrayList<>() ; 
     

     public Player(){
       
        for(int i=0;i<13;i++){

         
               sortedCard.add(new Pair(DeckOfCards.Clubs.get(i),0)) ;
               sortedCard.add(new Pair(DeckOfCards.Diamonds.get(i),1)) ;
               sortedCard.add(new Pair(DeckOfCards.Hearts.get(i),2)) ;
               sortedCard.add(new Pair(DeckOfCards.Spade.get(i),3)) ;
         }

     }

     public void addCard(Pair p){
     cards.add(p) ;
     }
 
}
