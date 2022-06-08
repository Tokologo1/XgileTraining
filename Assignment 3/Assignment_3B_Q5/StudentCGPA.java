import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentCGPA{
    public static void main(String[] args){

        DecimalFormat df = new DecimalFormat("0.00");
       
        List<Student> students = new ArrayList<Student>();
        students.add(new Student( 1,"Kabelo", 3.11));
        students.add(new Student( 2,"Tokologo", 3.11));
        students.add(new Student( 3,"Kamogelo", 3.11));
        students.add(new Student( 4,"Lesiba", 4.45));
        students.add(new Student( 5,"Thomas", 6.00));
        students.add(new Student( 6,"Russel", 6.56));

      

        //Sort Students in alphabeticall Order
        students.sort(new Comparator<Student>(){
            @Override
            public int compare(Student s1, Student s2){
                return s1.getFirstName().compareTo(s2.getFirstName());
            }
        });

        for(Student s: students){
            //If the student has the same CGPA then order them by id
            if(s.getCGPA() == students.get(0).getCGPA()){

                //order in according to id
                students.sort(new Comparator<Student>(){
                    @Override
                    public int compare(Student s1, Student s2){
                        return s1.getDi() - s2.getDi();
                    }
                });
                System.out.println(s.getFirstName());
            }
            else if(s.getFirstName().equals(students.get(0).getFirstName())){
                    //Sort by firstName
                    // students.sort(new Comparator<Student>(){
                    //     @Override
                    //     public int compare(Student s1, Student s2){
                    //         return s1.getDi() - s2.getDi();
                    //     }
                    // });
                    System.out.println(s.getDi()+" "+s.getFirstName()+" " +df.format(s.getCGPA()));
                   
            }            
            else{
                //Displaying students in alphabetical order
                System.out.println(s.getDi()+" "+s.getFirstName()+" " +df.format(s.getCGPA()));
            }
        }
    }
}