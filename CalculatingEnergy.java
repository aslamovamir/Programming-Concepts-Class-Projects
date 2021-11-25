//Name: Amir Aslamov
/*Description of Program: This program is designed calculate the amount of energy in Joules needed
                          to heat water from its particular initial temperature to its final temperature
                          in Celsius, given its mass in kilograms.*/
                          
import java.util.Scanner;
     public class CalculatingEnergy
     {
      public static void main(String [] args)
      {
      //variables input by the user
      double amount_water;                          //the amount of water in kilograms to be heated
      double temp_initial;                          //the initial temperature of the water in degrees Celsius
      double temp_final;                            //the final temperatue of the water in degrees Celsius
      //constanct value
      final double specific_heat_water = 4179.6;    /*the specific heat capacity of water in the units J/kg/K 
                                                      (for this calculation purpose,it is assumed that the value for 
                                                      the temperature change is the same, regardless of whether
                                                      it is in Kelvin or Celsius scale*/
      //values to be calculated
      double temp_change;                           //change in tenperature
      double energy;                                //the amount of energy in Joules required to heat the water with specific parameters
      
      //introduction for the user
      System.out.println("This program calculates the energy in Joules required to heat given amount of water,"
                          + " \nwith given values for its initial and final temperatures in degrees Celsius.");
                   
      //getting the input values from the user with prompts
      Scanner scnr = new Scanner(System.in);
      
      System.out.println("Please enter the amount of the water in kilograms: ");
      amount_water = scnr.nextDouble();
      System.out.println("The amount you have enterred in kilograms is: " + amount_water);
      
      System.out.println("Please enter the initial temperature of the water in degrees Celsius: ");
      temp_initial = scnr.nextDouble();
      System.out.println("The temperature you have enterred in degrees Celsius is: " + temp_initial);
      
      System.out.println("Please enter the final temperature of the water in degrees Celsius: ");
      temp_final = scnr.nextDouble();
      System.out.println("The temperature you have enterred in degrees Celsius is: " + temp_final);
      
      //calculations
      temp_change = temp_final - temp_initial;                    
      energy = amount_water * temp_change * specific_heat_water; 
     
      //output of the results
      System.out.print("\nThe amount of energy required to heat " + amount_water +
                       "kg of water, with the initial temperature of " + temp_initial
                       + " \ndegrees Celsius and the final temperature of " + temp_final
                       + " degrees Celsius, is ");
      System.out.printf("%.4e", energy);
      System.out.println("J");
      }
     }
