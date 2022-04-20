package Assignment;
import java.util.Scanner;

public class LetterToNumbers {

    public static void main(String[]args)
    {
        
        String s = "Tokologo";
        String t = "";
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (!t.isEmpty()) {
                t += " ";
            }
            int n = (int)ch - (int)'a' + 1;
            t += String.valueOf(n);
        }
        System.out.println(t);
    }
    
}
