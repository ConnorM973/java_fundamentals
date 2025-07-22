package labs_examples.objects_classes_methods.labs.oop.C_blackjackWork;

public class Player {
    private String name;
    private int potValue;
    Hand hand;
    boolean win;
    private static int numPlayers;
    private int bet;

    public Player(String name, int potValue) {
        this.name = name;
        this.potValue = potValue;
    }
    public void betMoney(int bet){
        this.bet=bet;
        potValue=potValue-bet;
    }

    public int getPotValue() {
        return potValue;
    }
    public int winRound(){
        potValue=potValue+bet*2;
        System.out.println("You win!");
        return potValue;
    }
    public int tieRound(){
        potValue=potValue+bet;
        System.out.println("You tied with the dealer!");
        return potValue;
    }
    public int loseRound(){
        return potValue;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public void setPotValue(int potValue) {
        this.potValue = potValue;
    }

}