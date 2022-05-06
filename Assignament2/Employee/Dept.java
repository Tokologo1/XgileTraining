import java.util.ArrayList;

public class Dept {

    private String dept_name;
    private String location;
    private double budget;
    private int manager_id;
    private Employee employee = new Employee();
    private ArrayList<Employee> num_of_employees;

   
    public Dept() {
    }
    

    public Dept(String dept_name, String location, double budget, int manager_id, ArrayList<Employee> num_of_employees) {
        
        this.dept_name = dept_name;
        this.location = location;
        this.budget = budget;
        this.manager_id = manager_id;
        this.num_of_employees = num_of_employees;
    }

    public ArrayList<Employee> getEmployees() {
        this.employee=new Employee();
        return num_of_employees;
    }

    public void setEmployees(ArrayList<Employee> num_of_employees) {
        this.num_of_employees = num_of_employees;
    }

    public void addEmployee(Employee employee) {
            this.employee = employee;

        num_of_employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        this.employee = employee;
        num_of_employees.remove(employee);
    }

    public double deptExpenditure(double budget,double furniture,double books,double other) {
        
        double deptExpenditure = (budget - furniture - books - other * 12);
       
       return deptExpenditure;
    }

    public String toString()
    {
        return "Department: " + dept_name + " Location: " + location + " Budget: " + budget + " Manager ID: " + manager_id + " Number of Employees: " + num_of_employees;
    }


    
}
