import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        
           Book bk = new Book();
        try{
            bk.setAuthor(new String[]{"Author1","Author2","Author3"});
            bk.setCost(new double[]{1.0,2.0,3.0});
            bk.setPublisher(new String[]{"Publisher1","Publisher2","Publisher3"});
            bk.setStock_Pos(new int[]{1,2,3});
            bk.setTitle(new String[]{"Title1","Title2","Title3"});
        }
        catch(Exception e){
            System.out.println("Error");
        }
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name of the title of the book you searching for?");
            
            String Ttitle = sc.nextLine();
            System.out.println(bk.SearchBook(Ttitle));

                 
            System.out.println("Enter the number of copies required?");
            int stock_Pos = sc.nextInt(); 
              
            System.out.print(bk.CostOfBook(stock_Pos));

    }
}
