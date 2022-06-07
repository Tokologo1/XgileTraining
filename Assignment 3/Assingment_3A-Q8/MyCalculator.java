import java.util.Scanner;

public class MyCalculator{
        public static void main(String[]args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first number");
            int a = sc.nextInt();
            System.out.println("Enter the second number");
            int b = sc.nextInt();
            
            power(a, b);

            System.out.println(" "+power(a, b));
        }

        public static long power(int p, int n)
       {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the operation");
           String op = sc.next();
        
        int result = 0;
        if(op.equals("+"))
        {
            result = p+n;
        }
        else if(op.equals("-"))
        {
            result = p-n;
        }
        else if(op.equals("*"))
        {
            result = p*n;
        }
        else if(op.equals("/"))
        {
            result = p/n;
        }

        //Throwing an exception
              if(n<0 || p<0)
              {
                throw new IllegalArgumentException("n and p should be positive");
              }else if(n==0 || p==0)
              {
                throw new IllegalArgumentException("n and p should not be zero");
              }
              else{
                
              }
            return result;
        }
       }


    

    