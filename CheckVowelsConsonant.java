import java.util.*;

public class CheckVowelsConsonant {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your character: ");
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Your character is vowel");
        } else {
            System.out.println("Your character is consonant");
        }
    }
}