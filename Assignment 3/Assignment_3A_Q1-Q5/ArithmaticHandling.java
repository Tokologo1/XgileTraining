


import java.io.File;
import java.io.FileNotFoundException;
import java.rmi.AccessException;
import java.util.Scanner;

public class ArithmaticHandling {

    public static void main (String[]args) throws AccessException, ArithmeticException
    { 
         //Question 1- 5 
         
         Scanner tc = new Scanner(System.in);
         System.out.println("Enter the first number");

         int number = tc.nextInt();
         
         File file = new File("C://Script//testing.txt");
         System.out.println(file.exists());
            try {
                Scanner sc = new Scanner(file);
                while(sc.hasNext())
                {
                    int num = sc.nextInt();
                    System.out.println(num);
                }
            } catch (FileNotFoundException e) {
                System.out.print("File not found \n");
            }         

         checkNumber(number);    //calling the method
       
    }

   

    public static int checkNumber(int number) throws ArithmeticException, AccessException
    {
        if(number >= 0 && number <= 100)
        {
            throw new ArithmeticException("The Number is between 0 and 100");
        }
        else if(number<0)
        {
           throw new  ArithmeticException("Number Should not be negative number");
        }
        else
        {
           throw new IndexOutOfBoundsException("The number is greater than 100");
        }
    }
    
}
