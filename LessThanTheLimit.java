//Name: Amir Aslamov
/*Desription of Program: This program is designed to input a list of 10 integers from the user, and to output those 
                         input integers that are less than a particular integer enterred by the user*/
                        
import java.util.Scanner;

public class LessThanTheLimit
   {
      public static void main(String [] args)
         {
            Scanner scnr = new Scanner(System.in);
            final int SIZE = 10;
            int [] input = new int [SIZE];
            int limit;
            int i;
            
            //introduction
            System.out.println("This program accepts 10 integers and outputs those" + 
                               " integers that are less than a particular integer in value.");
                               
            //prompt for the 10 integers
            System.out.println("Please, enter your 10 integers: ");
            
            //a loop to input each enterred integer into the array input
            for (i = 0; i < input.length; i++)
               {
                  input [i] = scnr.nextInt();
               }
               
            //input confirmation
            System.out.print("You have enterred integers: ");
            for (int rv: input)
               {
                  System.out.print(rv + " ");
               }
            System.out.println();
            
            //prompt for the limit value that identifies values to be output 
            System.out.println("Now, please enter an integer integers less than which are to be output: ");
            limit = scnr.nextInt();
            
            //call a method to output results
            LimitDefinedVals(input, limit);
         }
         
         //method that determines integers which are less than a given integer in value
         public static void LimitDefinedVals(int [] referance, int critical_int)
            {
               for (int i = 0; i < referance.length; ++i)
                  {
                     if (referance [i] < critical_int)
                        {
                           System.out.print(referance [i] + " ");
                        }
                  }
                System.out.println(" are less than the limit " + critical_int);
            }
   }
