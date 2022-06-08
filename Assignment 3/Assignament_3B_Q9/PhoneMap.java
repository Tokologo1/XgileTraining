import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneMap {

    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<String, String>();
        phoneBook.put("John", "12345");
        phoneBook.put("Mary", "23456");
        phoneBook.put("Bob", "34567");

        // if number is found, print the name and number
        Scanner tc = new Scanner(System.in);
        System.out.println("Enter a Name: ");
        String number = tc.nextLine();

        
        if (phoneBook.containsKey(number)) {
        // print name and number is found
           
            System.out.println(number + " = " + phoneBook.get(number));
        }

        else {
            //Print not Found - if name is not found
            System.out.println("Not found");
        }
        
    }
}