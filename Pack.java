//Name: Amir Aslamov
/*Description of Program: This program is designed to input information on a dog and out put this dog's information 
                          including its age in human years. The program utilizes a class as well as a driver class 
                          with the main method in it*/


//A driver class Pack
import java.util.Scanner;

public class Pack
   {
      public static void main(String [] args)
         {
            //Scanner object
            Scanner scnr = new Scanner(System.in);
            
            //local variables
            String name;
            double age;
            
            //Dog objects
            Dog dog1 = new Dog("Halskey", 2.0);
            Dog dog2 = new Dog();
            Dog dog3 = new Dog("Reina", 1.3);
            
            //methods to test toString method to see what the initial values of objects are
            System.out.println("Here's the original pack database with unknown data for one of the dogs:");
            System.out.println(dog1);
            System.out.println(dog2);
            System.out.println(dog3);
            
            //getting values for local variables
            System.out.print("\nYou have identified the data for the unknown dog!\nEnter the name of this dog: ");
            name = scnr.next();
            System.out.print("Now enter the age of this dog(years): ");
            age = scnr.nextDouble();
            //ensuring that the age of the dog is greater than 1
            while (age < 1)
               {
                  System.out.print("Invalid entry for the age of the dog! The age must be greater than " 
                                    + "or equal to 1 year.\nPlease re-enter the age: ");
                  age = scnr.nextDouble();
               }
            
            //testing accessor and mutator methods
            
            //using local variables to update the dog2's object
            dog2.setName(name);
            dog2.setAge(age);
            
            //using toString method to view the update in the original pack
            System.out.println("\nHere is the pack with the unknown memeber dog identified:");
            System.out.println(dog1);
            System.out.println(dog2);
            System.out.println(dog3);
            
            System.out.println("\nThe changes to the pack required an update of the registration database.");
            //retrieving and updating the name data of dog1's object
            System.out.print("However,the regsitration database update erroneously changed " + dog1.getName() + 
                               "'s name to ");
            dog1.setName("Chelskey");
            System.out.println(dog1.getName() + ".");
            
            //retrieving and updating the age data of dog3's object
            System.out.println("The update also erroneosly left the age of the dog " +
                                dog3.getName() + " not updated.\nThe age of this dog should be updated from " 
                                + dog3.getAge() + " to ");
            dog3.setAge(1.4);
            System.out.println(dog3.getAge() + ".");
            
            //testing the personYears method
            System.out.println("The modification of the update correctly changed the person-years age of " + 
                               dog3.getName() + " to " + dog3.personYears());
            
            //using toString method to view modification to the database
            System.out.println("\nHere is the modfied, correct database:");
            System.out.println(dog1);
            System.out.println(dog2);
            System.out.println(dog3);
            
            //testing the static method to view the number of times the Dog class was used
            System.out.println("This code provided info on " + Dog.getCounter() + " dogs.");     
         }
   }
