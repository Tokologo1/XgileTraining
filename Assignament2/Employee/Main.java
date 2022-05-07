import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        
        ArrayList<Object> depts = new ArrayList<Object>();
        Dept deptObject = new Dept();

        //Make Employee data-type Objects
        Employee emp1 = new Employee("John", 1, "Pretoria", 100000);
        Employee emp2 = new Employee("Jane", 2, "Jozi", 100000);
        Employee emp3 = new Employee("Jack", 3, "Port Elizabeth", 100000);
        Employee emp4 = new Employee("Jill", 4, "Bangalo", 100000);
        Employee emp5 = new Employee("Jim", 5, "Durban", 100000);
        
        // Create an ArrayList object
        //(Declaring List of Person type)
        ArrayList<Employee> emps = new ArrayList<Employee>();

        // Adding Empobjects to the ArrayList

        emps.add(emp1);
        emps.add(emp2);
        emps.add(emp3);
        emps.add(emp4);
        emps.add(emp5);


        depts.add( new Dept("Information Technology", "Pretoria", 100000, 1, emps.size()) );
               
       
        double totalprice = 0;
        for (Object dept : depts) {
            
            System.out.println(dept.toString());
            deptObject.toString();
                      

        totalprice =   deptObject.deptExpenditure(100000, 5000, 10000, 5000, 1300, 30, 10000, 10500, 20000, 25000, 50000, 15000, 50000);               
            
        }

        System.out.println("The Total Expenditure of the Department is: " + totalprice +"\n"+ deptObject.onBudget(totalprice));       

     }
    }

    

    

