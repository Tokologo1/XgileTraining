import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        
           Book bk = new Book();
        
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name of the title of the book you searching for?");
            String Ttitle = sc.nextLine();
            System.out.println(bk.SearchBook(Ttitle));

                 
            System.out.println("Enter the number of copies required?");
            int stock_Pos = sc.nextInt();   
            System.out.print(bk.CostOfBook(stock_Pos));

    }
}
