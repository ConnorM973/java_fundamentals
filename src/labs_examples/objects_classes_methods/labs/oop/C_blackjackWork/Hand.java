package labs_examples.objects_classes_methods.labs.oop.C_blackjackWork;

import java.util.ArrayList;
import java.util.Random;

public class Hand {
    Deck deck;
    private ArrayList<Card> cards= new ArrayList<Card>();
    private static ArrayList<Card> usedCards= new ArrayList<Card>();
    private int handValue;


    public Hand(Deck deck){
        this.deck=deck;
       // this.deal2Cards();


    }
    public Hand(ArrayList<Card> cards){
        this.cards=cards;
    }
    public void deal2Cards(){
        ArrayList<Card>totalCards= new ArrayList<Card>();
        ArrayList<Card> cards= new ArrayList<Card>();
        totalCards=deck.getCards();
        int i = 0;
        handValue=0;
        while (i<2){
            Random random = new Random();
            int randomIndex= random.nextInt(52);
            Card card1= totalCards.get(randomIndex);
            if(usedCards.contains(card1)){
                continue;
            }
            cards.add(card1);
            usedCards.add(card1);
            System.out.println("a "+card1.getCardName()+" is dealt");
            handValue=handValue+card1.getCardValue();
            if (card1.getCardValue()==1){
                if(handValue<=11){
                    handValue=handValue+10;
                }
            }
            i++;
        }
        System.out.println("Current hand value is "+handValue);
        this.cards=cards;
    }
    public void deal2CardsDealer(){
        ArrayList<Card>totalCards= new ArrayList<Card>();
        ArrayList<Card> cards= new ArrayList<Card>();
        totalCards=deck.getCards();
        int i = 0;
        handValue=0;
        while (i<2){
            Random random = new Random();
            int randomIndex= random.nextInt(52);
            Card card1= totalCards.get(randomIndex);
            if(usedCards.contains(card1)){
                continue;
            }
            cards.add(card1);
            usedCards.add(card1);
            if(i==0){
            System.out.println("a face down card is dealt");
            handValue=handValue+card1.getCardValue();
                if (card1.getCardValue()==1){
                    if(handValue<=11){
                        handValue=handValue+10;
                    }
                }
            i++;
            }
            else{
                System.out.println("a "+card1.getCardName()+" is dealt");
                handValue=handValue+card1.getCardValue();
            i++;}
        }
        this.cards=cards;
    }
    public void hitMe(){
        ArrayList<Card>totalCards= new ArrayList<Card>();
        totalCards=deck.getCards();
        int i=0;
        while (i<1){
            Random random = new Random();
            int randomIndex= random.nextInt(52);
            Card card1= totalCards.get(randomIndex);
            if(usedCards.contains(card1)){
                continue;
            }
            cards.add(card1);
            usedCards.add(card1);
            System.out.println("a "+card1.getCardName()+" is dealt");
            handValue=handValue+card1.getCardValue();
            System.out.println("Total value of cards is now "+getHandValue());
            i++;
        }
        int x=getHandValue();
        if (x>=22){
            System.out.println("Oh no, that's a bust!");
        }

    }

    public int getHandValue() {
        handValue=0;
        int aceCount=0;
        for(Card card: cards){
            int cardValue= card.getCardValue();
            if (cardValue==1){
                aceCount++;
                cardValue=11;
            }
            handValue += cardValue;
        }
        while (handValue > 21 && aceCount >0){
            handValue -= 10;
            aceCount--;
        }
        return handValue;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

}


