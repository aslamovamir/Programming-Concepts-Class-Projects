//Name: Amir Aslamov
//Unumber: U32653320
/*Description of Program: This program calculates for the values of x and y in a 2x2 system of
                          linear eqautions using Cramer's rule, for the given input values for
                          the variable 'a', 'b', 'c', 'd', 'e', 'f'*/
                          
import java.util.Scanner;
import java.text.DecimalFormat;

public class XandY
   {
      public static void main (String [] args)
         {
            int a, b, c, d, e, f;
            double x, y;
            DecimalFormat df = new DecimalFormat("#.#");
            Scanner scnr = new Scanner(System.in);
            
            //introduction for the user
            System.out.println("Hello,\nThis program displays a 2x2 system of linear equations with variables enterred" +
                               ", and, using Cramer's rule, \ncomputes the values for x and y, given that the enterred" +
                               " variables do not result in the \ndevision by 0.");
            //getting the variable vavlues from the user
            
            //prompt
            System.out.println("Please, enter integer values for a, b, c, d, e, f, seperated by a space: ");
            a = scnr.nextInt();
            b = scnr.nextInt();
            c = scnr.nextInt();
            d = scnr.nextInt();
            e = scnr.nextInt();
            f = scnr.nextInt();
            //the general equation
            /*ax + by = e
              cx + dy = f*/
              
            //ensuring the correct format of the equations with negative input values
            int b1 = Math.abs(b); //an absolute value of the variable b in case it is negative
            int d1 = Math.abs(d); //an absolute value of the variable d in case it is negative
            if (b < 0 && d < 0)   
               {
                  System.out.println("The system of equations is:\n" + a+"x " + "- " + b1+"y = " + e+"\n" + 
                                                                 c+"x " + "- " + d1+"y = " + f+"\n");
               }                                                  
            else if (b < 0)
               {
                  System.out.println("The system of equations is:\n" + a+"x " + "- " + b1+"y = " + e+"\n" + 
                                                                 c+"x " + "+ " + d+"y = " + f+"\n");                                                     
               }
            else if (d < 0)
               {
                  System.out.println("The system of equations is:\n" + a+"x " + "+ " + b+"y = " + e+"\n" + 
                                                                 c+"x " + "- " + d1+"y = " + f+"\n");
               }
            else
               {
                  System.out.println("The system of equations is:\n" + a+"x " + "+ " + b+"y = " + e+"\n" + 
                                                                 c+"x " + "+ " + d+"y = " + f+"\n"); 
               }  
             //general equations for x and y
             /*x = (ed - bf)/(ad - bc)
               y = (af - ec)/(ad - bc)
             */  
            //calculation of x and y while ensuring no devision by 0
           
            if ((((double)a * d) - ((double)b * c)) == 0)
               {
                  System.out.println("No solution for these equations");
               }
            else
                  {
                     x = ((((double)e * d) - ((double)b * f)) / (((double)a * d) - ((double)b * c)));
                     y = ((((double)a * f) - ((double)e * c)) / (((double)a * d) - ((double)b * c)));
                     System.out.println("The respective values for x and y are: " + df.format(x) + " and " + df.format(y)); 
                  }                                                                                            
         }
   }   
