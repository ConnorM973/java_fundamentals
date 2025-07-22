package labs_examples.objects_classes_methods.labs.oop.C_blackjackWork;

import java.util.ArrayList;
import java.util.Scanner;

public class BlackJackController {
    public static void main(String[] args) {
//        Deck deck=new Deck();
//        deck.getCardsArray();
//        Hand hand= new Hand(deck);
//        hand.deal2Cards();
//        hand.hitMe();
//        hand.hitMe();
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
            players.add(player);

        }
        int totalPotValue = 1000;
        while (totalPotValue > 0) {
            System.out.println("Place your bets ");

            for (Player player : players) {
                System.out.println(player.getName() + "...");
                    int bet = scanner.nextInt();
                    player.betMoney(bet);

                }

            Deck deck = new Deck();
            for (Player player : players) {
                Hand hand = new Hand(deck);
                System.out.println(player.getName() + "...");
                hand.deal2Cards();
                player.setHand(hand);
            }
            System.out.println();
            Dealer dealer = new Dealer();
            Hand dealerHand = new Hand(deck);
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
                    }
                }
            }
            for (Player player : players) {
                boolean keepPlaying = true;
                while (keepPlaying == true) {
                    ArrayList<Card> hands = player.hand.getCards();
                    System.out.println();
                    if (player.hand.getHandValue() > 21) {
                        System.out.println("You are over 21!");
                        keepPlaying=false;
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
                System.out.println();
                System.out.println("Dealer's turn...");
                boolean dealerKeepPlaying = true;
                while (dealerKeepPlaying) {
                    int z = dealerHand.getHandValue();
                    if (z >= 16) {
                        if (z > 21) {
                            System.out.println("The dealer busted.");
                            dealerKeepPlaying = false;
                        } else {
                            System.out.println("The dealer stays with a hand value of " + z);
                            dealerKeepPlaying = false;
                        }
                    }
                        else {
                        dealerHand.hitMe();
                    }
                }
                for (Player player : players) {
                    if (player.hand.getHandValue() > 21) {
                        player.setPotValue(player.loseRound());
                        System.out.println(player.getName() + " busted and lost! Their pot value is now " + player.getPotValue());
                    }
                    if (player.hand.getHandValue() <= 21) {
                        if (dealer.hand.getHandValue() > 21) {
                            player.setPotValue(player.winRound());
                            System.out.println(player.getName() + " beat the dealer, the dealer busted! Their pot value is now " + player.getPotValue());
                        }
                        if (player.hand.getHandValue() > dealer.hand.getHandValue()) {
                            player.setPotValue(player.winRound());
                            System.out.println(player.getName() + " beat the dealer with a higher card value! Their pot value is now " + player.getPotValue());
                        }
                        if (player.hand.getHandValue() == dealer.hand.getHandValue()) {
                            player.setPotValue(player.tieRound());
                            System.out.println(player.getName() + " tied the dealer! Their pot value is now " + player.getPotValue());
                        }
                        if (player.hand.getHandValue() < dealer.hand.getHandValue() && dealer.hand.getHandValue()<=21) {
                            player.setPotValue(player.loseRound());
                            System.out.println(player.getName() + " lost to the dealer! Their pot value is now " + player.getPotValue());
                        }
                    }
                }
                for (Player player : players) {
                    totalPotValue = totalPotValue + player.getPotValue();
                }

            }
        }
    }

