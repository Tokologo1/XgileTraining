import java.util.*;
public class ArithmaticQR {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter vlues to be Quiciented");
        System.out.println("Please Enter your first number: ");
        int first_num = sc.nextInt();
        System.out.println("Please Enter your second number: ");
        int Second_num = sc.nextInt();
        int sum = first_num/Second_num;
        System.out.println("Total : " +first_num + " / " + Second_num + " = " +sum);

        System.out.println("Enter vlues to get a Remainder");
        System.out.println("Please Enter your first number: ");
        int first_num1 = sc.nextInt();
        System.out.println("Please Enter your second number: ");
        int Second_num1 = sc.nextInt();
        int sum1 = first_num % Second_num;
        System.out.println("Total : " +first_num1 + " % " + Second_num1 + " = " +sum1);

        
    }
    
}
