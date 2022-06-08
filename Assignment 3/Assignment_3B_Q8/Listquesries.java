import java.util.ArrayList;
import java.util.List;

public class Listquesries{

    public static void main(String[]args)
    {

        //[12, 0, 1, 78, 12]
        List<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(0);
        list.add(1);
        list.add(78);
        list.add(12);
        //Inserting a new element at the end of the list
        list.add(5, 23);
        System.out.println(list);

        //Removing an element from the list
        list.remove(0);
        
        //Display new List of elements
        System.out.println(list);
    }
}