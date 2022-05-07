import java.util.ArrayList;

public class MarkSheet extends Student {

    private int marks[] = new int[5];
    String[] subjects = new String[]{"English", "Maths", "Science","Social","Computer"};
    Student student = new Student();

    public MarkSheet(String stdName, int roll_num, String[] subjects, int[] marks) {
        super(stdName, roll_num, subjects);
        this.marks = marks;
    }


    public int[] getMarks() {
        return marks;
    }

   

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public String toString() {

        String marksheet = "";
        String subjs = "";
        for (int i = 0; i < marks.length; i++) {
            marksheet += marks[i] + " ";
            subjs += this.subjects[i] + " ";
        }


        return "Student Name: " + this.getStdName() + "\nRoll Number: " + this.getRoll_num() + "\nSubjects: " + subjs+ "\nMarks: " + marksheet;
    }

    public void setMarks(double[] marks) {
    

    }

    public void AddAllSubjects(String name, String[] subjects, double[] marks) {
        
       //Add Name and Marks in each Subject      

           
    }
    
}



