//Name: Amir Aslamov
/*Description of Program: This program is designed to creat a bar chart that sorts the names of
                          five basketball players with the number of points they earned each, 
                          represented by asterisks*/

import java.util.Scanner;
                         
public class BasketballBarchart  
   {
      public static void main (String [] args)  
      { 
         Scanner scan = new Scanner (System.in);
         
         //plyers' names
         String name_1;
         String name_2;
         String name_3;
         String name_4;
         String name_5;
         
         //players' scores
         int score_1;
         int score_2;
         int score_3;
         int score_4;
         int score_5;
         
         //name input
         System.out.println("Enter the first names of the five players seperated by a space: ");
         name_1 = scan.next();
         name_2 = scan.next();
         name_3 = scan.next();
         name_4 = scan.next();
         name_5 = scan.next();
        
         //score input
         System.out.println("Enter the scores of the five players, " + name_1 + ", " + name_2 + ", "  + name_3 + ", " 
                              + name_4 + ", " + name_5 + ", in the given order, seperated by a space: ");
         score_1 = scan.nextInt();
         score_2 = scan.nextInt();
         score_3 = scan.nextInt();
         score_4 = scan.nextInt();
         score_5 = scan.nextInt();
         
         //input validation for score
         while (score_1 < 0 || score_2 < 0 || score_3 < 0 || score_4 < 0 || score_5 < 0)
             {
               System.out.println("Invalid input!\nPlease, enter positive integers or zero for the scores of the five players" 
                                   + ", in the order, seperated by a space: ");
               score_1 = scan.nextInt();
               score_2 = scan.nextInt();
               score_3 = scan.nextInt();
               score_4 = scan.nextInt();
               score_5 = scan.nextInt();                     
             }   
             
          //output of the results
          System.out.println("Points for the game:\n");
          
          //right justification with the String format to account for the asterisks
          String s1 = String.format("%-15s", name_1);
          String s2 = String.format("%-15s", name_2);
          String s3 = String.format("%-15s", name_3);
          String s4 = String.format("%-15s", name_4);
          String s5 = String.format("%-15s", name_5);
          
          System.out.print(s1);
          asterisk_distribution(name_1, score_1);
          
          System.out.print(s2);
          asterisk_distribution(name_2, score_2);
          
          System.out.print(s3);
          asterisk_distribution(name_3, score_3);
          
          System.out.print(s4);
          asterisk_distribution(name_4, score_4);
          
          System.out.print(s5);
          asterisk_distribution(name_5, score_5);                
       }
       
       //method to format the barchart
       public static void asterisk_distribution (String name, int score) 
         {
            //to account for the score of 0 (no asterisk)kmd
            while (score == 0)   
               {
                  break;
               }
            
            
                  for (int i = 1; i <= score; ++i) 
                     {
                        System.out.print("*");
                     }
                        System.out.println();
      }
   }
    
