import java.util.Scanner;


public class TollBooth  {

   protected int id_Booth;
   protected String Booth_Name;
   protected double Amount;
   protected int Car;

   public TollBooth(int id_Booth,String Booth_Name,double Amount,int Car)
   {
       this.id_Booth=id_Booth;
       this.Booth_Name=Booth_Name;
       this.Amount=Amount;
       this.Car=Car;
   }
   public void PayingCar()
   {
      this.Car= Car++;
     this.Amount=  Amount+=0.50;
   }
   public void NonPayingCar()
   {
       this.Car++;
   }
   public void Display() throws Exception
   {
       int total_cars;
       Scanner sc=new Scanner(System.in);
       System.out.println("Total number of cars passed without Payment: " );
       int car_non_payment= sc.nextInt();     
       System.out.println("Total number of cars passed: " );
       Car= sc.nextInt(); 

       if(car_non_payment>Car)
       {
           throw new Exception("Please Enter the correct number of cars");
       }
       else
       {
           total_cars=Car;
       }
       System.out.println("Total amount paid is: R" + (Car - car_non_payment) * 0.50);

   }

}