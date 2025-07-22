package labs_examples.objects_classes_methods.labs.oop.C_blackjackWork;

import java.util.ArrayList;

public class Dealer {
    private static String name = "Dealer";
    Hand hand;
    boolean win;

    public void setWin(boolean win) {
        this.win = win;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }
}




