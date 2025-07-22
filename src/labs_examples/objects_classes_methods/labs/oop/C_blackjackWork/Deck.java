package labs_examples.objects_classes_methods.labs.oop.C_blackjackWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Deck {
    //private final Card[] cards = new Card[52];
    private final ArrayList<Card> cards = new ArrayList<Card>();
    private ArrayList<Card> usedCards;
    private final char[] suitList = new char[]{'♠', '♦', '♥', '♣'};


    public Deck() {
        this.createDeck();

    }

    public void createDeck(){
        for (int j = 0; j < 4; j++) {
            for (int i = 1; i <= 13; i++) {
                Card newCard = new Card(i,suitList[j]);
//                newCard.setCardName(i,suitList[j]);
                this.cards.add(newCard);
            }
        }


    }

//    public void shuffleDeck() {
//        for (int i = 0; i < 52; i++) {
//            Random random = new Random();
//            int swapNumber = random.nextInt(52);
//            Card placeHolderCard = cards[swapNumber];
//            Card placeHolderCard2= cards[i];
//            cards[i] = placeHolderCard;
//            cards[swapNumber] = placeHolderCard2;
//        }
//    }
//    public Card dealCard(){
//            Card card1=new Card();
//        for(int i=0;i<52;i++){
//            card1= cards[i];
//            if(!card1.isUsedIndicator()){
//                card1.setUsedIndicator(true);
//                break;
//            }
//        } return card1;
//    }

    public void getCardsArray() {
        for (Card card:cards){
            System.out.println(card.getCardName());
        }
    }

    public ArrayList<Card> getCards() {
        return cards;
    }
//    @Override
//    public String toString() {
//        return "Deck{" +
//                "card=" + Arrays.toString(cards) +
//                '}';
//    }

}
