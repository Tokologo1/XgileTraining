public class runStudent {
    public static void main(String[] args) {
        
        Student std = new Student();
        ExaminationMark exm = new ExaminationMark("Raj", 20, 100, 50, 60, 70);
        
        std.setName("Raj");
        std.setAge(20);
        std.setTotlamark(100);
        std.setFirstsubject(80);
        std.setSecondsubject(90);
        std.setThirdsubject(70);
        


        System.out.println(std.toString());
        System.out.println(exm.toString());
    
}
}
