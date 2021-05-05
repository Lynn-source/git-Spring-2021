import java.util.Scanner;
public class Payroll


{
   public static void main(String[] args)
   {
	  Scanner scnr = new Scanner(System.in);
	  System.out.println("Please enter hours worked.");
      int hours = scnr.nextInt();
      System.out.println("Please enter your payrate");
      double grossPay, payRate = scnr.nextDouble();

      double overtime = 0.0;
      double OvertimePay = 0.0;
      if(hours > 40)
      {
    	 overtime = hours - 40;
    	 OvertimePay = (overtime * payRate) * 1.5;
      }
      grossPay = hours * payRate + OvertimePay;
      System.out.println("Your overtime pay is $"+ OvertimePay);
      System.out.println("Your gross pay is $" + grossPay);
   }
}