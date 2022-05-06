import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Object> depts = new ArrayList<Object>();
        Dept deptObject = new Dept();

       
        depts.add( new Dept("Information Technology", "Pretoria", 100000, 1, new ArrayList<Employee>()) );
               
        ArrayList<Object> emp = new ArrayList<Object>();
        emp.add( new Employee("John", 1, "Pretoria", 100000));
        emp.add( new Employee("Jane", 2, "Jozi", 100000));
        emp.add( new Employee("Jack", 3, "Port Elizabeth", 100000));
        emp.add( new Employee("Jill", 4, "Bangalo", 100000));
        emp.add( new Employee("Jim", 5, "Durban", 100000));
        double totalprice = 0;
        for (Object dept : depts) {
            
            System.out.println(dept.toString());
            deptObject.toString();
                      

        totalprice =   deptObject.deptExpenditure(100000, 5000, 10000, 5000);               
            
        }

        System.out.println("The Total Expensive of the Department is: " + totalprice);



        


        

       

        
    }

    
}
