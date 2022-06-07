import java.util.InputMismatchException;
import java.util.Scanner;

public class MyException
{
    public static void main(String[] args)
    {
        try
        {
            Scanner tc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num = tc.nextInt();
            System.out.println("Enter a number: " );
            int num1 = tc.nextInt();

            //Diving two intergers
            int c = num/num1;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division by zero is not allowed");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Please enter two arguments");
        }
        catch(NumberFormatException e)
        {
            System.out.println("Please enter two integers");
        }
        catch(InputMismatchException e)
        {
            System.out.println("An integer is required to perform this operation");
        }
        
        finally
        {
            System.out.println("This is finally block");
        }
    }
}