public class  MyException {

    public static void main(String[] args) {
      
      
         //Division by Zero invalid division Exeception
           devisionByZero(10,0);

         //String parsed to a numberic variable invalid conversion Exeception
            parseString("10");

         //Accessing an invalid index in string array Exeception
            invalidStringArrayIndex(new String[]{"a","b","c"},2);
            
          //Accessing an invalid index in  string 
            inDexString("Tokologo",5);

    }

    private static void invalidStringArrayIndex(String[] strings, int i) {

        //Accessing an invalid index in string array Exeception  
       
        
        


    }   
   

    public static void parseString(String s){
        try{
            int i=Integer.parseInt(s);
            System.out.println(i);
        }
        catch(NumberFormatException e){
            System.out.println("String parsed to a numberic variable invalid conversion Exeception");
        }
        finally{
            System.out.println("String parsed to a numberic variable invalid conversion Exeception");
        }
    }

    public static void devisionByZero(int a,int b){
        int sum=0;  
        try{
            sum=10/b;
           
       }
       catch(ArithmeticException e){
            System.out.println("Division by Zero invalid division Exeception");
       }
       finally{
            System.out.println("Division by Zero invalid division Exeception");
       }


       
    }

    public static void inDexString(String str, int i)
    {
        try{
            str="Tokologo";
            System.out.println(str.charAt(i));
            
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("Accessing an invalid index in  string ");
        }
        finally{
            System.out.println("Accessing an invalid index in  string ");
        }       
        
    }
    
}
