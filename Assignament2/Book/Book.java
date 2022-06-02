
public class Book {

    private String Author[] =new String[]{"Tokologo","Kamogelo","Fikile"};
    private String title[] = new String[]{"C#","Java","Python"};
    private String Publisher[] = new String[]{"Dr Chabalala","Dr Chabalala","Dr Chabalala"};
    private double cost[] = new double[]{150,200,300};
    private int Stock_Pos[] = new int[]{8,10,12};

    Book()
    {

    }

    public Book(String[] Author, String[] title, String[] Publisher, double[] cost, int []Stock_Pos) {
        this.Author = Author;
        this.title = title;
        this.Publisher = Publisher;
        this.cost = cost;
        this.Stock_Pos = Stock_Pos;

    }

    public String[] getAuthor() {
        return Author;
    }

    public String []getTitle() {
        return title;
    }

    public String[] getPublisher() {
        return Publisher;
    }

    public double[] getCost() {
        return cost;
    }

    public int[] getStock_Pos() {
        return Stock_Pos;
    }

    public void setAuthor(String[] author) {
        Author = author;
    }

    public void setCost(double[] cost) {
        this.cost = cost;
    }

    public void setPublisher(String[] publisher) {
        Publisher = publisher;
    }

    public void setStock_Pos(int[] stock_Pos) {
        Stock_Pos = stock_Pos;
    }

    public void setTitle(String[] title) {
        this.title = title;
    }



    
    public String SearchBook(String Ttitle) {

        String message = "";
        int count = 0;

        for (int i = 0; i < count; i++) {

            if (Ttitle != title[i]) {
            message = "Book titled :" + title[i] + " is available "+"\npublisher: " + Publisher [i]+ "\nAuthor :" + Author[i];
            
        } else {
          message = "Book is not available";
        }
        count++;
    }
         return message;
    }

    public String CostOfBook(int stock_Pos) {
        double Tot_Cost=0;
        String Message = "";
       
       

        for (int i = 0; i < getAuthor().length; i++) {

            if (stock_Pos == Stock_Pos[i]) {
                Tot_Cost = Tot_Cost + cost[i];
            }
        }

        Message = "The total cost of the book is: " + Tot_Cost;
       
        return  Message;

    }
}