public class  MyException {

    public static void main(String[] args) {
      
      
        //Division by Zero invalid division Exeception
           devisionByZero(10,0);
        //String parsed to a numberic variable invalid conversion Exeception
            parseString("10");
        //Accessing an invalid index in string array Exeception
            invalidStringArrayIndex(2);            
        //Accessing an invalid index in  string 
            inDexString(5);

    }

    private static void invalidStringArrayIndex( int i) {

        //Accessing an invalid index in string array Exeception  
       
        try {
            String[] string = {"Tokologo", "Marothi", "Kamogelo"};
            System.out.println(string[i]);
          } catch (Exception e) {
            System.out.println("Invalid Index");
          } finally {
            System.out.println("Exception Handling Completed.");
          }   


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
            System.out.println("Exception Handling Completed");
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
            System.out.println("Exception Handling Completed");
       }


       
    }

    public static void inDexString(int i)
    {
        try{
            String str="Tokologo";
            System.out.println(str.charAt(i));
            
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("Accessing an invalid index in  string ");
        }
        finally{
            System.out.println("Exception Handling Completed");
        }       
        
    }


    public static void UserdefinedException(String s) throws MyException.ExceptionH{
        
        // if(s.equals("Tokologo")){
        //         throw new ExceptionH("This is My error Message");
        //     }
        //     else{
        //         System.out.println("This is not a Tokologo");
        //     }
    
           
    }
    class ExceptionH extends Exception {


        public ExceptionH()
            {

            }
        
        public ExceptionH(String s) {
            System.out.println("This is My error Message");
        }

      
      
    }

    
}
