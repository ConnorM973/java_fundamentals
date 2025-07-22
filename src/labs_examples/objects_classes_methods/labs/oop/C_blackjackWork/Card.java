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
    //    public void setAll(Card newCard, int i) {
//        newCard.usedIndicator=false;
//        newCard.setCardValue(i + 1);
//        newCard.setCardName(newCard.getCardValue(), newCard.getSuit());
//        if (i == 0) {
//            newCard.setCardValue(1);
//            newCard.setFaceCard('A');
//            newCard.setCardName(newCard.getFaceCard(), newCard.getSuit());
//        }
//        if (i == 10) {
//            newCard.setCardValue(10);
//            newCard.setFaceCard('J');
//            newCard.setCardName(newCard.getFaceCard(), newCard.getSuit());
//        }
//        if (i == 11) {
//            newCard.setCardValue(10);
//            newCard.setFaceCard('Q');
//            newCard.setCardName(newCard.getFaceCard(), newCard.getSuit());
//        }
//        if (i == 12) {
//            newCard.setCardValue(10);
//            newCard.setFaceCard('K');
//            newCard.setCardName(newCard.getFaceCard(), newCard.getSuit());
//        }
//
//    }

    @Override
    public String toString() {
        return cardName;
    }
}

