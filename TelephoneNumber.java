//Name: Amir Aslamov
/*Description of Program: This program is designed to output a randomly generated set of numbers
                          with specific restrictions as set and, thus in accordance with, the Modern
                          Plan for a North American phone number*/
                          
import java.util.Random;

public class TelephoneNumber
   {
      public static void main (String [] args)
         {
            //introduction for the user
            System.out.println("Hello,\nThis program generates a North American phone number " + 
                               "as established by the Modern Plan\n");
            //the general structure of the Modern Plan phone number: NPA-NXX-XXXX
            //NPA rules: 1st: 2-9(cannot be 1 or 0), 2nd and 3rd: 0-9
            //NXX rules: 1st: 2-9(cannot be 1 or 0), 2nd and 3rd: 0-9, but if 2nd=1 then 3rd cannot be 1
            //XXXX rules: 1st, 2nd, 3rd, 4th: 0-9
            
            //assuming the form on the sample above: N1X1X2-N2X*X**-X3X4X5X6
            //N1 and N2 = (2-9), X1 to X6 = (0-9), X_ = (0-9), X__ = (0-9, but not 1 if X_ = 1)
            
            int N1, N2, X1, X2, X3, X4, X5, X6, X_, X__;
            //random object
            Random digit = new Random();
            //setting the range for N1 and N2
            N2 = (digit.nextInt(8) + 2);
            N1 = (digit.nextInt(8) + 2);
            //setting the range for X1, X2, X3, X4, X5, X6
            X1 = (digit.nextInt(10));
            X2 = (digit.nextInt(10));
            X3 = (digit.nextInt(10));
            X4 = (digit.nextInt(10));
            X5 = (digit.nextInt(10));
            X6 = (digit.nextInt(10));
            //setting the range for X_
            X_ = (digit.nextInt(10));
            //setting the range for X__
            if (X_ == 1)
               {  
                   X__ = (digit.nextInt(10));
                   while (X__ == 1)
                   X__ = (digit.nextInt(10));   
               }
            else
                {
                  X__ = (digit.nextInt(10));
                } 
            
            //ouput of the results
            System.out.println("A randomly generated North American phone number which satisfies the" +
                               " Modern Plan is: " + N1 + X1 + X2 + "-" + N2 + X_ + X__ + "-" + X3 + X4 + X5 + X6);
         }
   }  
