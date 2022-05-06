import java.util.ArrayList;

public class Dept {

    private String dept_name;
    private String location;
    private double budget;
    private int manager_id;
    private ArrayList<Employee> employee = new ArrayList<Employee>();
    private int num_of_employees;

   
    public Dept() {
    }


    public Dept(String dept_name, String location, double budget, int manager_id, int num_of_employees) {
        
        this.dept_name = dept_name;
        this.location = location;
        this.budget = budget;
        this.manager_id = manager_id;
        this.num_of_employees = num_of_employees;
    }

    

    public void setEmployees(ArrayList<Employee> employee) {
        this.employee = employee;
    }

    public void addEmployee(ArrayList<Employee> employee) {
            this.employee = employee;

        employee.addAll(employee);
    }

    public void removeEmployee(ArrayList<Employee> employee, int id) {
        this.employee = employee;
        employee.remove(id);
    }

    public double deptExpenditure(double budget,double month1,double month2,double month3,double month4,double month5,double month6,double month7,double month8,double month9,double month10,double month11,double month12) {
        
        budget = (month1 + month2 + month3 + month4 + month5 + month6 + month7 + month8 + month9 + month10 + month11 + month12);
        
        
       return budget;
    }

    public String toString()
    {
        return "Department: " + dept_name + "\n"+"Location: " + location +"\n"+ "Budget: " + budget +"\n"+ "Manager ID: " + manager_id +"\n"+ "Number of Employees: " + num_of_employees;
    }

    public String onBudget(double budget)
    {
        if (budget < this.budget)
        {
            return "The Department is on Budget";
        }
        else
        {
            return "The Department is not on Budget";
        }
    }

    
}
