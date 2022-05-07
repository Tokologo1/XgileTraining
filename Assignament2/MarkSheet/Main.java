import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Adding Student Objects

        ArrayList <Student> students = new ArrayList<Student>();
        Student s1 = new Student("Kamogelo", 1001, new String[]{"English", "Maths", "Science","Social","Computer"});
        Student s2 = new Student("Kabelo", 1002, new String[]{"English", "Maths", "Science","Social","Computer"});
        Student s3 = new Student("Tokologo", 1003, new String[]{"English", "Maths", "Science","Social","Computer"});

        students.add(s1);
        students.add(s2);
        students.add(s3);
        
        // Adding TabulationSheet Objects

        ArrayList <TabulationSheet> tabulationSheets = new ArrayList<TabulationSheet>();
        TabulationSheet t1 = new TabulationSheet("Kamogelo", 1001, new String[]{"English", "Maths", "Science","Social","Computer"}, new double[]{100, 100, 100, 100});
        TabulationSheet t2 = new TabulationSheet("Kabelo", 1002, new String[]{"English", "Maths", "Science","Social","Computer"}, new double[]{100, 100, 100, 100});
        TabulationSheet t3 = new TabulationSheet("Tokologo", 1003, new String[]{"English", "Maths", "Science","Social","Computer"}, new double[]{100, 100, 100, 100});
        TabulationSheet t4 = new TabulationSheet("Letlotlo", 1004, new String[]{"English", "Maths", "Science","Social","Computer"}, new double[]{100, 100, 100, 100});
        TabulationSheet t5 = new TabulationSheet("Fikile", 1005, new String[]{"English", "Maths", "Science","Social","Computer"}, new double[]{100, 100, 100, 100});


        tabulationSheets.add(t1);
        tabulationSheets.add(t2);
        tabulationSheets.add(t3);
        tabulationSheets.add(t4);
        tabulationSheets.add(t5);

        // Adding MarkSheet Objects

        ArrayList <MarkSheet> markSheets = new ArrayList<MarkSheet>();
        MarkSheet m1 = new MarkSheet("Kamogelo", 1001, new String[]{"English", "Maths", "Science","Social","Computer"}, new int[]{100, 100, 100, 100, 100});
        MarkSheet m2 = new MarkSheet("Kabelo", 1002, new String[]{"English", "Maths", "Science","Social"}, new int[]{100, 100, 100, 100, 100});
        MarkSheet m3 = new MarkSheet("Tokologo", 1003, new String[]{"English", "Maths", "Science","Social"}, new int[]{100, 100, 100, 100, 100});


        markSheets.add(m1);
        markSheets.add(m2);
        markSheets.add(m3);

        // Printing MarkSheet Objects


        System.out.println("Printing MarkSheet Objects");
        for (MarkSheet markSheet : markSheets) {
            System.out.println(markSheet);
        }
       
    }
    
}
    

