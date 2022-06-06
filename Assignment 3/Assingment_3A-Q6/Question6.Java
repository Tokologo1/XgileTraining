
 public class Question6 {

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        
        for(int i=0; i<arr.length; i++) {
            
            if(arr[i]%2==0) {
                System.out.println(arr[i]);
            }
        }

        String str = Integer.parse("1234");
        System.out.println(str);

        System.out.println(arr[13]);
        
    }
}