import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class PairSet
{
    public static void main(String[]args)
    {
        HashMap<String,String> haset = new HashMap<String,String>();
        
        Scanner sc = new Scanner(System.in);

      
        //Adding Values to HashMap
        for(int i=0;i<5;i++ )
        {
            System.out.println("Person "+ (i+1));
            System.out.println("Enter the name");
            String n = sc.next();
            System.out.println("Enter the Surname");
            String t = sc.next();
            
            haset.put(n,t);            
        }
        
        //Sort hashmap by key same name
       

        //Displaying the HashMap value
        System.out.println(haset);

               

    }
}