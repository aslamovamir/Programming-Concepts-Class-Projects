//Name: Amir Aslamov
/*Description of the Program: This prgram calculates the number of grapevines that will fit
                              in each row of a vineyard, given a specific length of the row
                              (in feet), the amount of space used by an end post assembly (in feet),
                              and the space between vines (in feet). This is calculated according to
                              a formula*/
                              
  import java.util.Scanner;

     public class GrapevineCalculation
     {
        public static void main(String [] args)
        {
         Scanner scnr = new Scanner(System.in);
         
         int V; //This variable represents the number of vines that will fit in the row
         int R; //This variable represents the length of the row, in feet
         int E; //the amount of space used by an end post assembly, in feet
         int S; //the space between vines, in feet
         
         //Introduction to the user
         System.out.println("Greetings,\nThis is a program designed to compute the total number of vines that can be grown in a\nvineyard," + 
                            " given a particular lenth of the row, particular amount of space used by an end\npost assembley and" + 
                            " particular space between the vines. The units for all the parameters\nare in feet. ");
         
         //All input variables
         //Prompt
         System.out.println("First, please enter the length of the row, in feet: ");  //prompt for the R variable
         R = scnr.nextInt();
         System.out.println("The number you have enterred is: " + R);
         
         System.out.println("\nNow, proceed to enter the amount of space used by an end post assembley, in feet: ");  //prompt for the E variable
         E = scnr.nextInt();
         System.out.println("The number you have enterred is: " + E);
         
         System.out.println("\nLastly, please enter the space between the vines, in feet: ");  //prompt for the S variable
         S = scnr.nextInt();
         System.out.println("Thank you, the number you have enterred is: " + S);
         
              
         //Camputation for the V variable, using the formula
         V = (R - (2 * E)) / S;
         
         //Output of the V variable
         System.out.println("\nGiven the length of the row of " + R + " feet, the space used by an end post assembley of " +
                             E + " feet,\nand the space of " + S + " feet between the vines, the total number of vines that "
                             + "can be grown in\neach row of the vineyard is " + V);
      
       }
    
    }         
