import java.util.InputMismatchException;
import java.util.Scanner;

public class C{

    public static void main(String[]args)
    {

        try{
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        String s = Integer.toString(n);
        //Read a line and store it in s
        int a = Integer.parseInt(s);
        System.out.println("Enter another number: ");
        //Read a line and store it in s
        int b = sc.nextInt();
        b = a*b;

        System.out.println("Total number is : "+b);

        }catch(NumberFormatException e){
            System.out.println("The Number format is not correct"); 
        }
        catch(InputMismatchException e){
            System.out.println("The input is not correct");
        }
        
        finally{
            System.out.println("The Exception in Handled");
        }
        
        
    }
}