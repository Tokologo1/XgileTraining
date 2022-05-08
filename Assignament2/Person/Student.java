
public class Student extends Person{

    private int roll_num;
   

    private String[] subjects;
    private int[] marks;

   

    public Student(String name, int age, int weight, int height, String dateOfBirth, int roll_num, String[] subjects, int[] makrs) {
    
        super(name, age, weight, height, dateOfBirth);
        this.roll_num = roll_num;
        this.subjects = subjects;
        this.marks = makrs;

    }

    public String calculateGrade(){
        int total = 0;
        for(int i = 0; i < marks.length; i++){
            total += marks[i];
        }
        int avg = total/marks.length;
        if(avg >= 90){
            return "A";
        }else if(avg >= 80){
            return "B";
        }else if(avg >= 70){
            return "C";
        }else if(avg >= 60){
            return "D";
        }else{
            return "F";
        }
    
        
    }

    public String toString() {

        String mark = "";
        String subjs = "";
        for (int i = 0; i < marks.length; i++) {
            mark += marks[i] + " ";
            subjs += subjects[i] + " ";
        }


        return "Roll Number: " + getRoll_num() + "\nSubjects: " + subjs+ "\nMarks: " + mark + "\nGrade: " + calculateGrade();
    }

    public int getRoll_num() {
        return roll_num;
    }

    public void setRoll_num(int roll_num) {
        this.roll_num = roll_num;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }
    
}
