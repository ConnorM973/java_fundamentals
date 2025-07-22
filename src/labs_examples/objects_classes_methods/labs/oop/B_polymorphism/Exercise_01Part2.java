package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

import org.w3c.dom.ls.LSOutput;

public class Exercise_01Part2 {
    public static void main(String[] args) {
        Blackjack blackJackGame = new Blackjack(1039.35, true);
        blackJackGame.shuffleDeck();
        blackJackGame.drawCards();
        blackJackGame.countCards();

        Canasta canastaGame = new Canasta(5, 500);
        canastaGame.shuffleDeck();
        canastaGame.drawCards();
        canastaGame.checkPointsToWin();
    }

    public interface cardGame {
        public void shuffleDeck();

        default public void drawCards() {
            System.out.println("You draw some cards for the card game ");
        }
    }

    static class Blackjack implements cardGame {
        private double bet;
        private boolean countingCards;

        public Blackjack(double bet, boolean countingCards) {
            this.bet = bet;
            this.countingCards = countingCards;
        }

        public void shuffleDeck() {
            System.out.println("You shuffle the deck of cards for a game of BlackJack");
        }

        @Override
        public void drawCards() {
            System.out.println("You are dealt 2 cards for a game of blackjack ");
        }

        public double getBet() {
            return bet;
        }

        public void setBet(double bet) {
            this.bet = bet;
        }

        public boolean isCountingCards() {
            return countingCards;
        }

        public void setCountingCards(boolean countingCards) {
            this.countingCards = countingCards;
        }

        public void countCards() {
            if (countingCards == true) {
                System.out.println("Stop counting cards! They're onto you");
            }
        }
    }

    static class Canasta implements cardGame {
        int numPlayers;
        int pointsToWin;

        public Canasta(int numPlayers, int pointsToWin) {
            this.numPlayers = numPlayers;
            this.pointsToWin = pointsToWin;
        }

        public void shuffleDeck() {
            System.out.println("You shuffle the deck for a game of Canasta");
        }

        @Override
        public void drawCards() {
            if (numPlayers >= 4) {
                System.out.println("You are dealt 13 cards for a game of Canasta");
            } else {
                System.out.println("You are dealt 11 cards for a game of Canasta");
            }
        }

        public void checkPointsToWin() {
            System.out.println("You need " + pointsToWin + " points to win");
        }

        public int getNumPlayers() {
            return numPlayers;
        }

        public void setNumPlayers(int numPlayers) {
            this.numPlayers = numPlayers;
        }

        public int getPointsToWin() {
            return pointsToWin;
        }

        public void setPointsToWin(int pointsToWin) {
            this.pointsToWin = pointsToWin;
        }
    }
}
