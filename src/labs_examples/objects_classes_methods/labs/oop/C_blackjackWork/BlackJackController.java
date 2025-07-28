package labs_examples.objects_classes_methods.labs.oop.C_blackjackWork;

import java.util.ArrayList;
import java.util.Scanner;

public class BlackJackController {
    public static void main(String[] args) {
        playBlackjack();
    }

    public static void playBlackjack() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total number of players");
        int numberOfPlayers = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Player> players = new ArrayList<>();
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Pot value: ");
            int potValue = scanner.nextInt();
            scanner.nextLine();

            Player player = new Player(name, potValue);
            player.setWinCount(0);
            players.add(player);

        }
        int totalPotValue = 1;
        int gamesPlayed=0;
        Dealer dealer = new Dealer();
        dealer.setPotValue(50000);
        System.out.println("The dealer starts with a pot value of "+dealer.getPotValue());
        while (totalPotValue > 0) {
            System.out.println("Place your bets ");

            for (Player player : players) {
                System.out.println(player.getName() + "...");
                int bet = scanner.nextInt();
                player.betMoney(bet);

            }
            dealer.dealerBet();

            Deck deck = new Deck();
            for (Player player : players) {
                Hand hand = new Hand(deck);
                System.out.println(player.getName() + "...");
                hand.deal2Cards();
                player.setHand(hand);
            }
            System.out.println();
            //Dealer dealer = new Dealer();
            Hand dealerHand = new Hand(deck);
            System.out.println("Dealer: ");
            dealerHand.deal2CardsDealer();
            dealer.setHand(dealerHand);
            if (dealerHand.getHandValue() == 21) {
                System.out.println("The dealer has a blackjack! ");
                dealer.setWin(true);

                for (Player player : players) {
                    int handValue = player.hand.getHandValue();
                    if (handValue == 21) {
                        System.out.println();
                        System.out.println(player.getName() + " also has a blackjack! " + player.getName() + " ties the dealer!");
                        player.setPotValue(player.tieRound());
                        player.setWin(true);
                        dealer.setPotValue(dealer.tieRound());
                    }
                    else {
                        System.out.println(player.getName() + " does not have a blackjack! " + player.getName() + " loses to the dealer! Pot value is now "+player.getPotValue());
                        player.setPotValue(player.loseRound());
                        player.setWin(false);
                        dealer.setWin(true);
                        dealer.setPotValue(dealer.winRound());
                    }
                }
            }
            for (Player player : players) {
                boolean keepPlaying = true;
                if (dealer.isWin()) {
                    keepPlaying = false;
                }
                while (keepPlaying) {
                    ArrayList<Card> hands = player.hand.getCards();
                    System.out.println();
                    if (player.hand.getHandValue() > 21) {
                        System.out.println("You are over 21!");
                        keepPlaying = false;
                    } else {
                        if (player.hand.getHandValue() == 21) {
                            System.out.println("You have exactly 21!");
                            keepPlaying = false;
                        } else {
                            System.out.println(player.getName() + ", Hit or stay?");
                            Scanner scanner1 = new Scanner(System.in);
                            String answer = scanner1.nextLine();
                            if (answer.equalsIgnoreCase("Hit")) {
                                player.hand.hitMe();
                            } else {
                                System.out.println("You stay with a hand value of " + player.hand.getHandValue());
                                keepPlaying = false;
                            }
                        }
                    }
                }
            }
                if (dealer.isWin()) {
                    System.out.println();
                    dealer.setWinCount(dealer.getWinCount()+1);
                } else {
                    System.out.println();
                    System.out.println("Dealer's turn...");
                }
                boolean dealerKeepPlaying = true;
                if (dealer.isWin()) {
                    dealerKeepPlaying = false;
                }
                while (dealerKeepPlaying) {
                    int z = dealerHand.getHandValue();
                    if (z >= 16) {
                        if (z > 21) {
                            System.out.println("The dealer busted.");
                            dealerKeepPlaying = false;
                            dealer.setWin(false);
                            dealer.setPotValue(dealer.loseRound());
                        } else {
                            System.out.println("The dealer stays with a hand value of " + z);
                            dealerKeepPlaying = false;
                        }
                    } else {
                        dealerHand.hitMe();
                    }
                }
                if (dealer.isWin()) {
                } else {
                    for (Player player : players) {
                        if (player.hand.getHandValue() > 21) {
                            player.setPotValue(player.loseRound());
                            System.out.println(player.getName() + " busted and lost! Their pot value is now " + player.getPotValue());
                            player.setWin(false);
                        }
                        if (player.hand.getHandValue() <= 21) {
                            if (dealer.hand.getHandValue() > 21) {
                                player.setPotValue(player.winRound());
                                System.out.println(player.getName() + " beat the dealer, the dealer busted! Their pot value is now " + player.getPotValue());
                                player.setWin(true);
                                dealer.setWin(false);
                            }
                            if (player.hand.getHandValue() > dealer.hand.getHandValue()) {
                                player.setPotValue(player.winRound());
                                System.out.println(player.getName() + " beat the dealer with a higher card value! Their pot value is now " + player.getPotValue());
                                player.setWin(true);
                                dealer.setWin(false);
                                dealer.setPotValue(dealer.loseRound());
                            }
                            if (player.hand.getHandValue() == dealer.hand.getHandValue()) {
                                player.setPotValue(player.tieRound());
                                System.out.println(player.getName() + " tied the dealer! Their pot value is now " + player.getPotValue());
                                player.setWin(false);
                                dealer.setWin(false);
                                dealer.setPotValue(dealer.tieRound());
                            }
                            if (player.hand.getHandValue() < dealer.hand.getHandValue() && dealer.hand.getHandValue() <= 21) {
                                player.setPotValue(player.loseRound());
                                System.out.println(player.getName() + " lost to the dealer! Their pot value is now " + player.getPotValue());
                                player.setWin(false);
                                dealer.setWin(true);
                                dealer.setPotValue(dealer.winRound());
                            }
                        }
                    }

                }
                System.out.println("Dealer pot value: "+dealer.getPotValue());
                totalPotValue=0;
                for (Player player : players) {
                    totalPotValue = totalPotValue + player.getPotValue();
                    int w = player.getWinCount();
                    if (player.isWin()) {
                        player.setWinCount(w + 1);
                    }
                    System.out.println(player.getName()+" total number of wins: "+player.getWinCount());
                }
                int z= dealer.getWinCount();
                if (dealer.isWin()) {
                dealer.setWinCount(z+1);
                    System.out.println("Dealer total number of wins: "+dealer.getWinCount());
            }
                else{
                    System.out.println("Dealer total number of wins: "+dealer.getWinCount());
                }
                gamesPlayed=gamesPlayed+1;
                System.out.println();
                System.out.println(gamesPlayed+" games of blackjack have been played ");
                System.out.println();
            }
        }
    }


