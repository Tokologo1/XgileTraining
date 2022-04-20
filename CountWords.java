import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your string: ");
        String str = sc.nextLine();          
        int count = 0;
        for (char c : str.toCharArray()) {
            count++;
        }
        System.out.println("Total number of words in your string is: " + count);        
    }
    
}
