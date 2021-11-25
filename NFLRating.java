//Name: Amir Aslamov
/*Desription of the Program: This program is designed to calculate the NFL passer rating using a passer rating formula. For this calculation, 
                             several values are to be input by the user*/
                             

import java.util.Scanner;

  public class NFLRating
    {
     public static void main (String [] arsgs)
     {
      //integer variables input by the user
      int num_pass_attempts;             //number of passing attempts
      int num_completions;               //number of completions
      int num_pass_yards;                //number of passing yards
      int num_touchdown_passes;          //number of touchdown passes
      int num_interceptions;             //number of interceptions
      //string variables input by the user
      String quarterback_name;            //name of the quarterback of the user
      //variables to be calculated by the program
      double percent_completion;         //completion percentage
      double yards_per_attempt;          //yards per attempt
      double touchdowns_per_attempt;     //touchdowns per attempt
      double interceptions_per_attempt;  //interceptions per attempt
      double NFL_rating;                 //NFL passer rating value
      
      //introduction for the user
      System.out.println("Greetings,\nThis program is designed to calculate the NFL passer rating for you.");
      
      
      Scanner scan = new Scanner(System.in);
      //prompting the user and getting each required input value
      System.out.println("\nPlease enter the name of the quarterback: ");
      quarterback_name = scan.nextLine();
      System.out.println("The name you have enterred is: " + quarterback_name);
      
      System.out.println("\nPlease enter the number of passing attempts: ");
      num_pass_attempts = scan.nextInt();
      System.out.println("The number you have enterred is: " + num_pass_attempts);
      
      System.out.println("\nNow proceed to enter the number of completions: ");
      num_completions = scan.nextInt();
      System.out.println("The number you have enterred is: " + num_completions);
      
      System.out.println("\nNow enter the number of passing yards: ");
      num_pass_yards = scan.nextInt();
      System.out.println("The number you have enterred is : " + num_pass_yards);      
      System.out.println("\nNow enter the number of touchdown passes: ");
      num_touchdown_passes = scan.nextInt();
      System.out.println("The number you have enterred is: " + num_touchdown_passes);
      
      System.out.println("\nFinally, enter the number of interceptions: ");
      num_interceptions = scan.nextInt();
      System.out.println("The number you have enterred is: " + num_interceptions); 
      
      //calculation of the variables needed; casting is applied to improve accuracy of calculations
      percent_completion = ((((float)num_completions / num_pass_attempts) - 0.3) * 5.0);
      
      yards_per_attempt = ((((float)num_pass_yards / num_pass_attempts) - 3.0) * (0.25));
           
      touchdowns_per_attempt = (((float)num_touchdown_passes / num_pass_attempts) * 20.0);
         
      interceptions_per_attempt = (2.375 - (((float)num_interceptions / num_pass_attempts) * 25.0));
            
      //calculation of the NFL passer rating
      NFL_rating = (((percent_completion +  yards_per_attempt + touchdowns_per_attempt + interceptions_per_attempt) / 6) * 100);
      System.out.print("\nThe NFL passer rating for the quaterback " + quarterback_name + " is: ");
      System.out.printf("%.2f", NFL_rating);
     }
    } 
