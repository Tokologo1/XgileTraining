import java.util.ArrayList;

public class TabulationSheet extends Student {

    private double marks[] = new double[4];

    public TabulationSheet(String stdName, int roll_num, String[] subjects, double[] marks) {
        super(stdName, roll_num, subjects);
        this.marks = marks;
    }

    public double[] getMarks() {
        return marks;
    }

    public void setMarks(double[] marks) {
        this.marks = marks;
    }

    public String toString() {
        return super.toString() + "\nMarks: " + marks;
    }

    public void AddstudentMarks(int roll_num, String[] subjects, double[] marks,Student student) {
        
        ArrayList<Student> students = new ArrayList<Student>();
       
        for (int i = 0; i < students.size(); i++) {
            
            if (students.get(i).getRoll_num() == roll_num) {

                students.get(i).setSubjects(subjects);
                students.get(i).setMarks(marks);
            
            }
        }

        students.add(student);
    
    }

    

    

   


    
    
}
