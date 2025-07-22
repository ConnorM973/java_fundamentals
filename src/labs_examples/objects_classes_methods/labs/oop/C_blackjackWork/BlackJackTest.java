package labs_examples.objects_classes_methods.labs.oop.C_blackjackWork;

import java.util.ArrayList;

public class BlackJackTest {
    public static void main(String[] args) {
        Card ace= new Card(1,'♠');
        Card ten= new Card(10,'♠');
        ArrayList<Card> cards= new ArrayList<Card>();
        cards.add(ten);
        cards.add(ace);
        Hand hand= new Hand(cards);
        System.out.println(hand.getHandValue());

        Card jack= new Card(11,'♠');
        ArrayList<Card> cards2= new ArrayList<Card>();
        cards2.add(jack);
        cards2.add(ace);
        Hand hand2= new Hand(cards2);
        System.out.println(hand2.getHandValue());

        Card queen= new Card(12,'♠');
        ArrayList<Card> cards3= new ArrayList<Card>();
        cards3.add(queen);
        cards3.add(ace);
        Hand hand3= new Hand(cards3);
        System.out.println(hand3.getHandValue());

        Card king= new Card(13,'♠');
        ArrayList<Card> cards4= new ArrayList<Card>();
        cards4.add(king);
        cards4.add(ace);
        Hand hand4= new Hand(cards4);
        System.out.println(hand4.getHandValue());
    }
}
