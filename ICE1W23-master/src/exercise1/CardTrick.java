package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Phatchariya Yotha May 30, 2023
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Random random = new Random();


        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
    
            card.setValue(random.nextInt(13) + 1);
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            hand[i] = card;
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int value = scanner.nextInt();
        System.out.print("Enter the suit(Hearts=1, Diamonds=2, Clubs=3, Spades=4): ");
        int suit = scanner.nextInt();
        
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        
        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(Card.SUITS[suit - 1]);
        
        
        // Then loop through the cards in the array to see if there's a match.
        boolean found = false;

        for (Card card : hand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                found = true;
                break;
            }
        }

        if (found) {
            printInfo();
        } else {
            System.out.println("no match found.");
        }
    }
        
        // If the guess is successful, invoke the printInfo() method below.

    /**
     * I'm done!
     * @author Phatchariya Yotha May 2023
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Mint");
        System.out.println();
        
        System.out.println("I'm in Computer Programming:");
        System.out.println("I like badminton:");
        System.out.println("I have 1 dog:");
        System.out.println("I'm from Thailand:");

        



    }

}
