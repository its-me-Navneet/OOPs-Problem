package Q4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class DeckOfCards {

    public static ArrayList<String> Clubs = new ArrayList<>(
            Arrays.asList("2", "3", "4", "5", "6", "7", "8","9", "10", "Jack", "Queen", "King", "Ace"));
    public static ArrayList<String> Diamonds = new ArrayList<>(
            Arrays.asList("2", "3", "4", "5", "6", "7", "8","9", "10", "Jack", "Queen", "King", "Ace"));
    public static ArrayList<String> Hearts = new ArrayList<>(
            Arrays.asList("2", "3", "4", "5", "6", "7", "8","9", "10", "Jack", "Queen", "King", "Ace"));
    public static ArrayList<String> Spade = new ArrayList<>(
            Arrays.asList("2", "3", "4", "5", "6", "7", "8","9", "10", "Jack", "Queen", "King", "Ace")); 

    public static ArrayList<String> suits = new ArrayList<>(Arrays.asList("Clubs", "Diamonds", "Hearts", "Spade"));
 
    public static void main(String[] args) {

        ArrayList<ArrayList<Pair>> players = new ArrayList<>();
        // added 4 player
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());

        ArrayList<Pair> totalCards = new ArrayList<>();

        for (String x : Clubs) {
            totalCards.add(new Pair(x, 0));
        }
        for (String x : Diamonds) {
            totalCards.add(new Pair(x, 1));
        }
        for (String x : Hearts) {
            totalCards.add(new Pair(x, 2));
        }
        for (String x : Spade) {
            totalCards.add(new Pair(x, 3));
        }

        Collections.shuffle(totalCards);

        // distributing the shuffle cards
        int k = 0;
        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < players.size(); j++) {
                players.get(j).add(totalCards.get(k++));
            }
        }

        // print the details of card of each player

        System.out.println("Player 1     player 2    player 3   player 4"); 
      
        for(int i=0;i<9;i++){
            for(int j=0;j<players.size();j++){

                Pair x = players.get(j).get(i) ; 
                String card = x.first;
                String suit = suits.get(x.second);
                System.out.print(card + " " + suit+ "   ");
        
            }
            System.out.println();
        }
       
        System.out.println("**********************");

      
    }
}
