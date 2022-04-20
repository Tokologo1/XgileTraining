package Assignment;
public class LargestNumberArray {
    
        public static void main(String[] args) {
            
            int[] arr = {1,2,30,4,20,6,70,8,9,50};
            int max = arr[0];
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]>max)
                {
                    max = arr[i];
                }
            }
            System.out.println("Largest number is: "+max);
        }
    
    
}
