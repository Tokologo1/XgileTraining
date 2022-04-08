import java.util.Scanner;

public class largestNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your first number: ");
        int first_num = sc.nextInt();
        System.out.println("Please Enter your second number: ");
        int Second_num = sc.nextInt();
        System.out.println("Please Enter your third number: ");
        int Third_num = sc.nextInt();
       
        
        int[] arr = {first_num, Second_num, Third_num};
        
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The largest number is: " + max);
    }
}