package Assignment;
import java.util.Scanner;

public class CheckVowPosition {
    public static void main(String[]args)
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your string: ");
        String str = sc.nextLine();  
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); ++i) {
          char ch = str.charAt(i);
    
          // check if character is any of a, e, i, o, u
          if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Yes "+"(Position "+i+")");

          }                  
        
        }
    
       
      }
    
    
}
