/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 /* rajan jitendrasinh chauhan
 student id =991704597
 */
import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            Random number = new Random();
            
            c.setValue(number.nextInt(13) + 1);
            
            c.setSuit(Card.SUITS[number.nextInt(4)]);
            
            magicHand[i] = c;
        }
            Card luckyCard = new Card();
        
            luckyCard.setValue(7); // Choose any card number
        
            luckyCard.setSuit(Card.SUITS[2]); // Choose any suit number
        
        magicHand[magicHand.length - 1] = luckyCard;
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
           Scanner a = new Scanner(System.in);
           System.out.print("Enter the digit of your card from 1 to 13: ");
           int userValue = a.nextInt();
           System.out.print("Enter the number of suit from 0 to 3: ");
           int userSuit = a.nextInt();

           Card yourcard = new Card();
           yourcard.setValue(userValue);
           yourcard.setSuit(Card.SUITS[userSuit]);

           boolean found = false;
           for (int i = 0; i < magicHand.length; i++) {
            if (yourcard.equals(magicHand[i])) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Congratulations! Your card matches a card in the magic hand!");
        } else {
            System.out.println("Sorry! Your card does not matches in the magic hand.");
        }
    }
    
}
