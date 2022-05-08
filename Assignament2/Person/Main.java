

import java.util.Date;

public class Main {
    
    public static void main(String[] args) {
        
        
        Employee employee = new Employee("Kamogelo", 30, 80, 180, "01/01/2000", 100000, new Date(), 10);
        Technician technician = new Technician("Letlotlo", 34, 80, 140, "01/01/2000", 105000, new Date(), 10);
      //  Professor professor = new Professor("Kabelo", 30, 80, 180, "01/01/2000", 100000, new Date(), 10, "Java", new ArrayList<Object>());
        

        

       

        
                      
        Student student = new Student("Kamogelo", 30, 80, 180, "01/01/2000",10001, new String[]{"Java","Python","C++","C","JavaScript"}, new int[]{10,10,10,10,10});   

                
        Professor professor = new Professor("Kamogelo", 30, 80, 180, "01/01/2000", 100000, new Date(), 10002,new String[]{"String Array","Integer Array","Double Array","Float Array"}, new String[]{"Take Care","Learn Java","Watch Tutorials","Do Research"});
        Person person = new Person("Kamogelo", 30, 80, 180, "01/01/2000");
      
      
        System.out.println(employee.display());
        System.out.println(technician.display());
        System.out.println(professor.display());
        System.out.println(student.toString());
        System.out.println(person.display());
        


        
    
    }
}
