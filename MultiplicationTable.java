//Name: Amir Aslamov
/*Desciption of Program: This program is designed to output a 2-dimensional multiplication table with 
                         12 rows and user-defined number of columns*/
                         
import java.util.Scanner;

public class MultiplicationTable
   {
      public static void main(String [] args)
         {
            Scanner scnr = new Scanner(System.in);
            final int rows = 12;
            int columns;
            
            //prompt for the number of columns
            System.out.println("Please enter the number of columns: ");
            columns = scnr.nextInt();
            //input validation for columns <= 2
            while (columns <= 2)
               {
                  System.out.println("Sorry, value must be greater than 2." +
                                     "\nPlease, re-enter the number of columns: ");
                  columns = scnr.nextInt();
               } 
            
            int [] [] table = new int [rows] [columns];
            
            //filling of the table
            for (int r = 0; r < table.length; r++)
               {
                  for (int c = 0; c < table[r].length; c++)
                     table [r] [c] = (r + 1) * (c + 1);
               }
            //output of the table
            System.out.println("Here's the table: ");
            for (int r = 0; r < table.length; r++)
               {
                  for (int c = 0; c < table[r].length; c++)
                     {
                        System.out.print(table[r][c] + "\t");
                     }
                      System.out.println();
               }
         }
   }
