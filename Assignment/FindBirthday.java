package Assignment;

public class FindBirthday {
    
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Please Enter your date of birth: ");
            int day = sc.nextInt();
            int month = sc.nextInt();
            int year = sc.nextInt();
            
            if (day == 1 && month == 1) {
                System.out.println("Happy Birthday");
            } else {
                System.out.println("Not your birthday");
            }
            
        }
    
    
}
