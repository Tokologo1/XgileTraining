import java.util.Scanner;

class ArithmaticAdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter your first number: ");
        int first_num = sc.nextInt();
        System.out.println("Please Enter your second number: ");
        int Second_num = sc.nextInt();
        

        int sum = first_num + Second_num;
        System.out.println("Total : " +first_num + " + " + Second_num + " = " +sum);

      
    }
}
