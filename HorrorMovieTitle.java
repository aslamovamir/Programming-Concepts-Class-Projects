/*
Name: Amir Aslamov
Description of Program: This program generates a specific title for a horror movie given the specific
month of birth of a user, as well as his or her first initial and last names
*/
                         
import java.util.Scanner;

public class HorrorMovieTitleAssignment4 {
   public static void main (String [] args)  {
      
      Scanner scnr = new Scanner(System.in);
    
      //to get a word based on the birthmonth
      
      String birth_month = "Neutral";
      int user_input_month;
      System.out.println("Enter the month of your birth in numbers(0 to 12): ");
      user_input_month = scnr.nextInt();
      
      //input validation
     
      while (!(user_input_month > 1 || user_input_month < 12))   
      {
         System.out.println("Invalid entry, please re-enter the month of your birth in numbers: ");
         user_input_month = scnr.nextInt();
      }
      if(user_input_month > 1 || user_input_month < 12)
      {
         switch (user_input_month)  
         {
            case 1:
               birth_month = "Whispering";
               break;
            case 2:
               birth_month = "Screaming";
               break;
            case 3: 
               birth_month = "Killing";
               break;
            case 4:
               birth_month = "Murder";
               break;
            case 5:
               birth_month = "Sacrifice";
               break;
            case 6:
               birth_month = "Abduction";
               break;
            case 7: 
               birth_month = "Disappearance";
               break;
            case 8:
               birth_month = "Creeping";
               break;
            case 9: 
               birth_month = "Devouring";
               break;
            case 10:
               birth_month = "Haunting";
               break;
            case 11:
               birth_month = "Burning";
               break;
            case 12: 
               birth_month = "Exorcism";
               break;
            default: 
               System.out.println("Invalid entry");
               break;
         }
      }
   
   
      //to get a word based on the first initial
      
      char letter1;
      String first_initial = "Neutral";
         
      System.out.println("Enter your first initial beginning with a capital letter: ");
      letter1 = scnr.next().charAt(0);
      
      //input validation
      
      while ((letter1 < 65  || letter1 > 90))
      {
         System.out.println("Invalid entry, please enter your first initial beginning with a captial letter: ");
         letter1 = scnr.next().charAt(0); 
      }  
      if (letter1 > 65 || letter1 < 90)   {
              
         switch (letter1)
         {
            case 'A':
               first_initial = "Occult";
               break;
            case 'B':
               first_initial = "Mysterious";
               break;
            case 'C':
               first_initial = "Ominous";
               break;
            case 'D':
               first_initial = "Dark";
               break;
            case 'E':
               first_initial = "Black";
               break;
            case 'F':
               first_initial = "White";
               break;
            case 'G':
               first_initial = "Red";
               break;
            case 'H':
               first_initial = "Bleeding";
               break;
            case 'I':
               first_initial = "Stolen";
               break;
            case 'J':
               first_initial = "Dead";
               break;
            case 'K':
               first_initial = "Possessed";
               break;
            case 'L':
               first_initial = "Eerie";
               break;
            case 'M':
               first_initial = "Luminous";
               break;
            case 'N':
               first_initial = "Grotesque";
               break;
            case 'O':
               first_initial = "Eldritch";
               break;
            case 'P':
               first_initial = "Sinister";
               break;
            case 'Q':
               first_initial = "Macabre";
               break;
            case 'R':
               first_initial = "Twilight";
               break;
            case 'S':
               first_initial = "Pagan";
               break;
            case 'T':
               first_initial = "Funeral";
               break;
            case 'U':
               first_initial = "Moonlight";
               break;
            case 'V':
               first_initial = "Evil";
               break;
            case 'W':
               first_initial = "Dreaded";
               break;
            case 'X':
               first_initial = "Fearful";
               break;
            case 'Y':
               first_initial = "Ghostly";
               break;
            case 'Z':
               first_initial = "Lugubrious";
               break;
         }         
      }
               
               
      //to get a ward based on the last initial
           
      char letter_last;
      String last_name;
      String last_last = "Neutral";
           
      System.out.println("Enter your last name: ");
      last_name = scnr.next();
      System.out.println("The name you have entered is " + last_name);
      letter_last = last_name.charAt(last_name.length() - 1);
      System.out.println("The last letter is " + letter_last);
      
      //input validation
      
      while ((letter_last >= 65  && letter_last <= 90))
      {
         System.out.println("Please, enter your name ending with a lower case letter: ");
         last_name = scnr.next();
         letter_last = last_name.charAt(last_name.length() - 1);
      }
            
      while ((letter_last < 97 || letter_last > 122))
      {
         System.out.println("Invalid entry, please enter your last name ending with a letter: ");
         last_name = scnr.next();
         letter_last = last_name.charAt(last_name.length() - 1);
      }
            
      if (letter_last >= 97 || letter_last <= 122)   
      {
                  
         switch (letter_last)
         {
            case 'a':
               last_last = "Child";
               break;
            case 'b':
               last_last = "Woman";
               break;
            case 'c':
               last_last = "Ghoul";
               break;
            case 'd':
               last_last = "Castle";
               break;
            case 'e':
               last_last = "Demon";
               break;
            case 'f':
               last_last = "Witch";
               break;
            case 'g':
               last_last = "Heart";
               break;
            case 'h':
               last_last = "Creature";
               break;
            case 'i':
               last_last = "Night";
               break;
            case 'j':
               last_last = "Moon";
               break;
            case 'k':
               last_last = "Vampire";
               break;
            case 'l':
               last_last = "Phantom";
               break;
            case 'm':
               last_last = "Ghost";
               break;
            case 'n':
               last_last = "Raven";
               break;
            case 'o':
               last_last = "Skull";
               break;
            case 'p':
               last_last = "Bones";
               break;
            case 'q':
               last_last = "Vault";
               break;
            case 'r':
               last_last = "Werewolf";
               break;
            case 's':
               last_last = "Mind";
               break;
            case 't':
               last_last = "Tomb";
               break;
            case 'u':
               last_last = "Doll";
               break;
            case 'v':
               last_last = "Forest";
               break;
            case 'w':
               last_last = "Necremicon";
               break;
            case 'x':
               last_last = "Man";
               break;
            case 'y':
               last_last = "Shadow";
               break;
            case 'z':
               last_last = "Tree";
               break;
         }       
      }
  
      //output of the final results
      
      System.out.println("\"The " + birth_month + " of The " + first_initial + " " + last_last + "\"");
   
   }              
}                   
