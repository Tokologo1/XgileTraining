import java.util.ArrayList;

public class Book {

    private String title;
    private ArrayList<String> author;
    private int page_number;
    private float price;
    private String publisher;

    public Book()
    {
        this.title = "";
        this.author = new ArrayList<String>();
        this.page_number = 0;
        this.price = 0.0f;
        this.publisher = "";
    }

    public Book(String title, ArrayList<String> author, int page_number,String publisher,float price) {
        this.title = title;
        this.author = author;
        this.page_number = page_number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getAuthor() {
        return author;
    }

    public void setAuthor(ArrayList<String> author) {
        this.author = author;
    }

    public int getPage_number() {
        return page_number;
    }

    public void setPage_number(int page_number) {
        this.page_number = page_number;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }



   


    
    
   


    
}
