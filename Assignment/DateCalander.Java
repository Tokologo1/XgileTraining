public class DateCalander{
    public static void main(String[]rags)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your date: ");
        int date = sc.nextInt();
        System.out.println("Please Enter your month: ");
        int month = sc.nextInt();
        System.out.println("Please Enter your year: ");
        int year = sc.nextInt();
        int day = 0;
        switch(month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                break;
            case 2:
                if(year%4==0)
                {
                    day = 29;
                }
                else
                {
                    day = 28;
                }
                break;
            default:
                System.out.println("Invalid month");
                break;
        }
        System.out.println("Your date is: "+date+"/"+month+"/"+year);
        System.out.println("Your day is: "+day);
    }
}