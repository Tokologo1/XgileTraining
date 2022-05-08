import java.util.Date;

public class Employee extends Person{

 

    private double salary;
    private Date dateofJoining;
    private int yearsOfExperience;

    Employee()
    {
        this.salary = 0;
        this.dateofJoining = new Date();
        this.yearsOfExperience = 0;
    }

    public Employee(String name, int age, int weight, int height, String dateOfBirth, double salary, Date dateofJoining, int yearsOfExperience) {
    
        super(name, age, weight, height, dateOfBirth);
        this.salary = salary;
        this.dateofJoining = dateofJoining;
        this.yearsOfExperience = yearsOfExperience;

    }
    
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDateofJoining() {
        return dateofJoining;
    }

    public void setDateofJoining(Date dateofJoining) {
        this.dateofJoining = dateofJoining;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String display() {
        return "Employee{" +
                "salary=" + salary +
                ", dateofJoining=" + dateofJoining +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }
    
}
