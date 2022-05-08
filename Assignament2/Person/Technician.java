import java.util.Date;

public class Technician extends Employee{

   

    public Technician(String name, int age, int weight, int height, String dateOfBirth, double salary, Date date, int yearsOfExperience) {
        super(name, age, weight, height, dateOfBirth, salary, date, yearsOfExperience);

    }




    public String display() {

        
        return "Technician{" +
                "salary=" + getSalary() +
                ", dateofJoining=" + getDateofJoining() +
                ", yearsOfExperience=" + getYearsOfExperience() +
                '}';
            }

    
}
