public class ExaminationMark extends Student {
   
    Student std = new Student();
       
    
    public ExaminationMark(String name, int age, double mark, double firstsubject, double secondsubject, double thirdsubject) {
        super(name, age, mark, thirdsubject, thirdsubject, thirdsubject);
       
    }
    
    public double getEverage() {

        double totalmark = (std.getFirstsubject() + std.getSecondsubject() + std.getThirdsubject()) / 3;

        return totalmark;
    }
    
    public String getTotalmark() {
        
        if(getEverage() >= 80) {
            return "A";
        }
        else if(getEverage() >= 70) {
            return "B";
        }
        else if(getEverage() >= 60) {
            return "C";
        }
        else if(getEverage() >= 50) {
            return "D";
        }
        else {
            return "F";
        }
        
    }
    public String toString()
    {
        
        return super.toString() + "\n" +
         "Name : " +std.getName() + "\nStudent Age : " +std.getAge() + "\n" + "First Subject: " + std.getFirstsubject() + "\n" + "Second Subject: " + std.getSecondsubject() + "\n" + "Third Subject: " + std.getThirdsubject() + "\n" + "Total Mark: " + getTotalmark();
    }
}
