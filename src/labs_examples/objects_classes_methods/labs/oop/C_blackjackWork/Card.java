package labs_examples.objects_classes_methods.labs.oop.C_blackjackWork;

public class Card {
    public char[] suitList = new char[]{'♠', '♦', '♥', '♣'};
    private int cardValue;
    private char suit;
    private String cardName;
    private char faceCard;


    public Card (int cardValue, char suit) {
        this.cardValue = cardValue;
        this.suit = suit;
        this.cardName=(cardValue+" of "+suit);
        if(cardValue==11){
            this.cardValue=10;
            this.cardName=("J of "+suit);
        }
        if(cardValue==12){
            this.cardValue=10;
            this.cardName=("Q of "+suit);
        }
        if(cardValue==13){
            this.cardValue=10;
            this.cardName=("K of "+suit);
        }
        if(cardValue==1){
            this.cardName=("A of "+suit);
        }
    }
    public char getSuit() {
        return suit;
    }

    public String getCardName() {
        return cardName;
    }

    public int getCardValue() {
        return cardValue;
    }


    @Override
    public String toString() {
        return cardName;
    }
}

