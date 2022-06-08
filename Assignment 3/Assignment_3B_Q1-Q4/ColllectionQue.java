import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class ColllectionQue{
    

    public static void main(String[] args) {

        //Program to iterate a linked list in reverse order use Map
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.put(5, "E");
        map.put(6, "F");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
          IterateList(map);

          firstHighetKey(map);

          lastHighetKey(map);

          System.out.println("Testing HashSet Convertion");

          convertHashSetToLinkedList();

          retrieveElementfromArray(3);        
      

        //First(Lowest) key and the last (Highest) key in current queue
    }

    public static void IterateList(Map<Integer,String> map){
        Queue<Integer> queue = new LinkedList<Integer>();
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            queue.add(entry.getKey());
        }
        while(!queue.isEmpty()){
            System.out.println(map.get(queue.poll()));
        }
    }

    public static void firstHighetKey(Map<Integer,String> map){
        Queue<Integer> queue = new LinkedList<Integer>();
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            queue.add(entry.getKey());
        }
        System.out.println(map.get(queue.poll()));
    }

    public static void lastHighetKey(Map<Integer,String> map){
        Queue<Integer> queue = new LinkedList<Integer>();
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            queue.add(entry.getKey());
        }
        System.out.println(map.get(queue.poll()));
    }

    public static void retrieveElementfromArray(int arrY)
    {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Queue<Integer> queue = new LinkedList<Integer>();
       
        queue.add(arr[arrY]);
      
        System.out.println(queue.poll());
       
    }

    //Convert a hashset to a linkedlist
    public static void convertHashSetToLinkedList(){
      
        HashSet<String> hashSet = new HashSet<String>();

        hashSet.add("Steve");
        hashSet.add("Matt");
        hashSet.add("Govinda");
        hashSet.add("John");
        hashSet.add("Tommy");
       // System.out.println("Names " + hashSet);

        List<String> list = new LinkedList<String>(hashSet);
        
        for(String i : hashSet){
            list.add(i);
        }
        System.out.println(list);
    }
}