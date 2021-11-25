//Name: Amir Aslamov
//Description of Program: This program is designed to sum all the digits in a random integer in the range of 0 to 1,000, exclusively*/

import java.util.Scanner;

public class SumOfDigits
  {
   public static void main (String [] args)
   {
    Scanner scan = new Scanner(System.in);
    int user_input;     //an integer input by the user in the required range
    int sum_digits;     //the sum of the digits in the input value
    
    /*the following variables are assumed to exist in an integer input by the user;
      even if not, they sould default to 0, which does not effect the value for the
      sum of all digits in the input integer*/
      
    int units_digit;    //the units digit of the integer input by the user
    int tens_digit;     //the tens digit of the integer input by the user
    int hundreds_digit; //the hundreds digit of the integer input by the user
     
    //introduction for the user
    System.out.println("Hello,\nThis program calculates the sum of all digits in an integer between 0 and 1,000, exclusively."); 
    
    //input of the integer
    System.out.println("\nEnter an integer in the range of 0 to 1,000, exclusively, to calculate the sum of its digits: ");
    user_input = scan.nextInt();
    System.out.println("The integer you have enterred is: " + user_input);
    
    //calculation of the sum of digits of the input value
    
    //getting the units digit of the input value
    units_digit = user_input % 10;
    
    //getting the tens digit of the input value
    tens_digit = user_input % 100;
    tens_digit /= 10;
    
    //getting the hundreds_digit
    hundreds_digit = user_input / 100;
    
    //calculating the sum of the digits in the input value
    sum_digits = units_digit + tens_digit + hundreds_digit;
    
    
    //ouput of the results for the user
    System.out.println("\nThe units, tens and hundreds digits of the integer " + user_input + " you have enterred are "
                        + units_digit + ", " + tens_digit + ", " + hundreds_digit + ", respectively, so the sum of these digits "
                        + "is " + sum_digits);                     
   }
  
  }
