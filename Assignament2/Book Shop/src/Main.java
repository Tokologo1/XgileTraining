import java.util.ArrayList;

public class Main extends Book{
    public static void main(String[] args) throws Exception {
        
        // TODO code application logic here
       
        ArrayList<Object> objectBooks = new ArrayList<Object>();
       
        objectBooks.add(new Library("Advance Java", new ArrayList<String>(), 100, "Oracle", 110.0f));
        objectBooks.add(new Library("Spring", new ArrayList<String>(), 100, "Oracle", 160.0f));
        objectBooks.add(new Library("Spring Boot", new ArrayList<String>(), 100, "Oracle", 150.0f));
        objectBooks.add(new Library("Spring MVC", new ArrayList<String>(), 100, "Oracle", 150.0f));
        objectBooks.add(new Library("Spring Security", new ArrayList<String>(), 100, "Oracle", 190.0f));

        Library library = new Library();

        

        for(int x=0; x<objectBooks.size(); x++)
        {
            library = (Library)objectBooks.get(x);
            
            
            //  System.out.println(library.toString());                         
           
            library.totalPrice();
        }

        System.out.println("Total Price: R" + library.totalPrice());
        
       
        



    }

   
}
