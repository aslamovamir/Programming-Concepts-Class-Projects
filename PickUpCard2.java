//Name: Amir Aslamov
/*Description of Program: This program is designed to simulate a pickup of a card 
                          from a deck of 5 cards and assigns its suit and rank with the help of enum method*/
                          
import java.util.Random;

public class PickUpCardEXTRACREDIT
   {
      //enum method for the suit of the card
            enum suit
            {
               Spades, Hearts, Diamonds, Clubs;
            }
      //enum method for the rank of the card
            enum rank
            {
               Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, King, Queen;               
            }
   
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
       public static suit Suit(int a, int b)
         {
            suit suit_ = suit.Spades;
            if ((a == 0) || (a == 1 && b <= 2))
            suit_ = suit.Spades;
            else if ((a == 1 && b >= 3) || (a == 2 && b <= 5))
            suit_ = suit.Hearts;
            else if ((a == 2 && b >= 6) || (a == 3 && b <= 8))
            suit_ = suit.Diamonds;
            else if ((a == 3 && b == 9) || (a == 4 && b >=0) || (a == 5 && b <= 1))
            suit_ = suit.Clubs;
            return suit_;
         }
       //method to determine the rank of the card
       public static rank Rank(int a, int b)
         {
            rank rank_ = rank.Ace;
            //all the ranks from 0 to 9, represented by only a single digit r
            if (b == 0)
            rank_ = rank.Ace;
            else if (b == 1)
            rank_ = rank.Two;
            else if (b == 2)
            rank_ = rank.Three;
            else if (b == 3)
            rank_ = rank.Four;
            else if (b == 4)
            rank_ = rank.Five;
            else if (b == 5)
            rank_ = rank.Six;
            else if (b == 6)
            rank_ = rank.Seven;
            else if (b == 7)
            rank_ = rank.Eight;
            else if (b == 8)
            rank_ = rank.Nine;
            else if (b == 9)
            rank_ = rank.Ten;
            //ranks from 10 to 13, represented by two digits s and r
            else if ((b == 0 && a == 1) || (b == 3 && a == 2) || (b == 6 && a == 3) || (b == 9 && a == 4))
            rank_ = rank.Jack;
            else if ((b == 1 && a == 1) || (b == 4 && a == 2) || (b == 7 && a == 3) || (b == 0 && a == 5))
            rank_ = rank.Queen;
            else if ((b == 2 && a == 1) || (b == 5 && a == 2) || (b == 8 && a == 3) || (b == 1 && a == 5))
            rank_ = rank.King;
            return rank_;
            
         }
    }
