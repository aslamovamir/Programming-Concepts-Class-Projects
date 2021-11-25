//Name: Amir Aslamov
/*Description of Program: This program is designed to simulate the Magic 8 ball fortune game, randomly outputting certain, 
                          standard responses to user-generated questions.*/


import java.util.Random;
import java.util.Scanner;

public class magic8ball
   {
      public static void main(String [] args)
         {
            Random fortune = new Random();
            Scanner scnr = new Scanner(System.in);
            String user_question;   //used to captures user's response
            String answer = "";          //user's answer to "yes or no" question
            //standard responses list
            String [] fortune_responses = {"It is certain.", "It is decidedly so.", "Without a doubt.",
                                           "Yes - definitely.", "You may rely on it.", "As I see it, yes.", "Most likely.", 
                                           "Oytlook good.", "Yes.", "Signs point to yes.", "Reply hazy, try again.", "Ask later again.",
                                           "Better not tell you now.", "Cannot predict now.", "Concentrate and ask again.",
                                           "Don't count on it.", "My reply is no.", "My sources say no.", "Outlook not so good.",
                                           "Very doubtful."};
            //introduction
            System.out.println("Hi,\nThis is magic 8 toy game to test your luck! Ask a question from your life, and get to know"
                               + "fate's response to it!");
            do {
                  System.out.println("Ask your question: ");
                  user_question = scnr.nextLine();
                  System.out.println("Your question is: " + user_question);
                  System.out.println("Fate's response is: " + fortune_responses[fortune.nextInt(20)]);
                  System.out.println("Would you like to answer another question? (Answer yes or no):");
                  answer = scnr.nextLine();
               }  while (answer.equalsIgnoreCase("yes"));
         }
   } 
