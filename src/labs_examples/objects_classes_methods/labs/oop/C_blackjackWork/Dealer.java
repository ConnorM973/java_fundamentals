package labs_examples.objects_classes_methods.labs.oop.C_blackjackWork;

import java.util.ArrayList;
import java.util.Random;

public class Dealer {
    private static String name = "Dealer";
    Hand hand;
    private boolean win;
    private static int winCount;
    private int potValue;
    private int betAmount;

    public int getPotValue() {
        return potValue;
    }

    public void setPotValue(int potValue) {
        this.potValue = potValue;
    }

    public void dealerBet() {
        Random random = new Random();
        betAmount = random.nextInt((Integer) potValue / 2);
        potValue = potValue - betAmount;
        System.out.println("The dealer bets " + betAmount);
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public boolean isWin() {
        return win;
    }

    public int getWinCount() {
        return winCount;
    }

    public void setWinCount(int winCount) {
        this.winCount = winCount;
    }

    public int getBetAmount() {
        return betAmount;
    }

    public int tieRound() {
        potValue = potValue + betAmount;
        return potValue;

    }

    public int loseRound() {
        return potValue;

    }

    public int winRound() {
        potValue = potValue + (betAmount * 2);
        return potValue;
    }
}




