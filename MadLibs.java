//Name: Amir Aslamov
/*Description of the Program: This program, Mad Libs, is an entertainment, educational program for children that
                              prompts for different parts of speech -  two nouns or an adjective, and a past-tense verb - and incorporates them 
                              into a funny story. This program is designed to help children distinguish between 
                              parts of speech in English language*/
                              
  import java.util.Scanner;
   
      public class MadLibs
      {
          public static void main (String [] args)
          {
           Scanner scnr = new Scanner(System.in);
           
           String Noun1;      //This represents the first noun enterred by the user
           String Noun2;      //This represents the second noun enterred by the user
           String Adjective;  //This represents the adjective enterred by the user
           String Verb;       //This represents the verb enterred by the user
         
          //Introduction for the User
          System.out.println("Hi! It's time to play and learn! Think of two nouns, one adjective and one verb!" +
                              " This game will present a unique story\nusing your nouns, adjective and past-tense verb! Let's go!");
          
          
          System.out.println("Enter your first noun:"); //Prompt for the 1st noun
          Noun1 = scnr.next();
          
          System.out.print("Nice! The first noun you enterred is: " + Noun1 + "\nNow enter your second noun: "); //Prompt for the 2nd noun
          Noun2 = scnr.next();
          
          System.out.println("Awesome! The second noun you enterred is: " + Noun2 + "\nNow enter your adjective: "); //Prompt for the adjective
          Adjective = scnr.next();
          
          System.out.println("Wonderful choice! The adjective you enterred is: " + Adjective + "\nLastly, enter your past-tense verb: "); //Prompt for the verb
          Verb = scnr.next();
          
          System.out.println("Good job! The past-tense verb you enterred is: " + Verb + "\nHere is the story unique to your choice of two nouns, one adjective and one past tense verb:"); //Finalizing the input
          
          //The output of the story with the input string variables
          System.out.println("\nMary had a little " + Noun1 + ",\nIts " + Noun2 + " was bright as snow,\nAnd everwhere that Mary " + Verb +
                              ",\nThe " + Noun1 + " was sure to go.");
       
          
          
       }
          }
