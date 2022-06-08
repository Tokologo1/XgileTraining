
public class Student {

    private String FirstName;
    private int di;
    private double CGPA;

    public Student(int di, String FirstName, double d) {
        this.FirstName = FirstName;
        this.di = di;
        this.CGPA = d;
    }
    public String getFirstName() {
              
        return FirstName.toLowerCase();
    }
    public void setFirstName(String firstName) {
        
         
        FirstName = firstName;
    }
    public int getDi() {
    
        
        return di;
    }
    public void setDi(int di) {
        this.di = di;
    }
    public Double getCGPA() {
        //should have two decimal places after the dot
     
        return CGPA;       
    }
    public void setCGPA(double cGPA) {
        CGPA = cGPA;
    }
    

}
