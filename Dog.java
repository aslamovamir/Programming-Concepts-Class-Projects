//Class Dog

import java.text.DecimalFormat;

public class Dog
   {
      //instance variables to represent a dog's name and age
      private String dog_name;
      private double dog_age;
      
      //static variable to keep track of Dog objects
      private static int counter = 0;
      
      //initialized constructor with two parameters
      public Dog(String name_dog, double age_dog)
         {
            dog_name = name_dog;
            dog_age = age_dog;
            ++counter;
         }
         
      //overloaded constructor with no paramters
      public Dog()
         {
            dog_name = "";
            dog_age = 1;
            ++counter;
         }
      
      //accessor method to retrive dog_name
      public String getName()
         {
            return dog_name;
         }
         
      //accessor method to retrieve dog_age
      public double getAge()
         {
            return dog_age;
         }
         
      //mutator method to modify dog_name
      public void setName(String dog_name_choice)
         {
            dog_name = dog_name_choice;
         }
         
      //mutator method to modify dog_age
      public void setAge(double dog_age_choice)
         {
            dog_age = dog_age_choice;
         }
         
      //method that calculates the age of a dog in human years
      public String personYears()
         {
            DecimalFormat df = new DecimalFormat("#.##");
            double dog_human_age;
            dog_human_age = (16 * (Math.log(dog_age)) + 31);
            return df.format(dog_human_age);
         }
         
      //toString method to return a dog's name, age, and age in person years
      public String toString()
         {
            return ("Name: " + String.format("%-15s", dog_name) + "Age: " + String.format("%-10s", dog_age) + 
                   "Person-Years: " + String.format("%-10s", personYears()));
                     }
      public static int getCounter()
         {
            return counter;
         }
   }
