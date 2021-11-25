//Name: Amir Aslamov
/*Description of Program: This program is designed to simulate a pickup of a card 
                          from a deck of 5 cards and assigns its suit and rank*/
                          
import java.util.Random;

public class PickUpCard
   {
      public static void main (String [] args)
         {
            Random rd = new Random();

            //introduction
            System.out.println("Hi there!\nThis program is designed to test your luck on cards!\n" 
                                + "Let's see what you have got!");
            int card = rd.nextInt(52);
            System.out.println("The card is " + card + "!");
            
            //identification of the suit number and rank number of the card
            int s = card / 10;
            int r = card % 10;
                                
           //output of the results
           System.out.println("Yay! You have got " + Rank(s, r) + " of " + Suit(s, r) + "!");
         }
         
       //method to determine the suit of the card
       public static String Suit(int a, int b)
         {
            String suit_ = "";
            if ((a == 0) || (a == 1 && b <= 2))
            suit_ = "Spades";
            else if ((a == 1 && b >= 3) || (a == 2 && b <= 5))
            suit_ = "Hearts";
            else if ((a == 2 && b >= 6) || (a == 3 && b <= 8))
            suit_ = "Diamonds";
            else if ((a == 3 && b == 9) || (a == 4 && b >=0) || (a == 5 && b <= 1))
            suit_ = "Clubs";
            return suit_;
         }
       //method to determine the rank of the card
       public static String Rank(int a, int b)
         {
            String rank_ = "";
            //all the ranks from 0 to 9, represented by only a single digit r
            if (b == 0)
            rank_ = "Ace";
            else if (b == 1)
            rank_ = "Two";
            else if (b == 2)
            rank_ = "Three";
            else if (b == 3)
            rank_ = "Four";
            else if (b == 4)
            rank_ = "Five";
            else if (b == 5)
            rank_ = "Six";
            else if (b == 6)
            rank_ = "Seven";
            else if (b == 7)
            rank_ = "Eight";
            else if (b == 8)
            rank_ = "Nine";
            else if (b == 9)
            rank_ = "Ten";
            //ranks from 10 to 13, represented by two digits s and r
            else if ((b == 0 && a == 1) || (b == 3 && a == 2) || (b == 6 && a == 3) || (b == 9 && a == 4))
            rank_ = "Jack";
            else if ((b == 1 && a == 1) || (b == 4 && a == 2) || (b == 7 && a == 3) || (b == 0 && a == 5))
            rank_ = "Queen";
            else if ((b == 2 && a == 1) || (b == 5 && a == 2) || (b == 8 && a == 3) || (b == 1 && a == 5))
            rank_ = "King";
            return rank_;
         }   
   }
