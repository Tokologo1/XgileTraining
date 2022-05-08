
import java.util.Date;


public class Professor extends Employee{
    private String [] Courses;
    private String [] ListOfAdvise;

  
   
    public Professor(String name, int age, int weight, int height, String dateOfBirth, double salary, Date dateofJoining, int yearsOfExperience, String[] Courses, String[] ListOfAdvise) {
   
        super(name, age, weight, height, dateOfBirth, salary, dateofJoining, yearsOfExperience); 
    
        this.Courses = Courses;
        this.ListOfAdvise = ListOfAdvise;
    
    }

    public void setCourses(String[] courses) {
        Courses = courses;
    }

    public String[] ListOfAdvisee() {
        return ListOfAdvise;
    }

    public String[] getCourses() {
        return Courses;
    }

   

    

    public String display() {
      
        String course = "";
        String listadvise = "";
        for (int i = 0; i < listadvise.length(); i++) {
            course += Courses[i] + " ";
            listadvise += ListOfAdvise[i] + " ";
        }


        return "Professor{" +
        "Courses='" + course + '\'' +
        ", ListOfAdvisee=" + listadvise +
        '}';
    }
}