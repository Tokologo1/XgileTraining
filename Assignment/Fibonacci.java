package Assignment;

import java.util.Scanner;

public class Fibonacci {
    
        public static void main(String[] args) {
            int n = 0;
            int n1 = 1;
            int n2 = 0;
            int sum = 0;
            System.out.println("Please Enter your number: ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                sum = n1 + n2;
                n2 = n1;
                n1 = sum;
                System.out.println(sum);
            }
        }
    
    
}
