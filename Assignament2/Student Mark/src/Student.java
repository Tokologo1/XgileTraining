public class Student {

    private String name;
    private int age;
    private double totlamark;
    private double firstsubject;
    private double secondsubject;
    private double thirdsubject;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getTotlamark() {
        return totlamark;
    }

    public void setTotlamark(double totlamark) {
        this.totlamark = totlamark;
    }
  

    public double getFirstsubject() {
        return firstsubject;
    }

    public void setFirstsubject(double firstsubject) {
        this.firstsubject = firstsubject;
    }

    public double getSecondsubject() {
        return secondsubject;
    }

    public void setSecondsubject(double secondsubject) {
        this.secondsubject = secondsubject;
    }

    public double getThirdsubject() {
        return thirdsubject;
    }

    public void setThirdsubject(double thirdsubject) {
        this.thirdsubject = thirdsubject;
    }

   
    
    public Student()
    {
        
    }

    public Student(String name, int age, double mark, double firstsubject, double secondsubject, double thirdsubject) {
        this.name = name;
        this.age = age;
        this.totlamark = mark;
        this.firstsubject = firstsubject;
        this.secondsubject = secondsubject;
        this.thirdsubject = thirdsubject;
    }
   

    



    
}
