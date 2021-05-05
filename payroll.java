import java.util.Scanner;

public class Payroll
{
   public static void main(String[] args)
   {
	   Scanner scnr = new Scanner(System.in);
	   
      int hours = 40;
      double grossPay, payRate = 25.0;

      grossPay = hours * payRate;
      System.out.println("Your gross pay is $" + grossPay);
      
     
      
      
     System.out.println("Enter your hours worked");
      
   }
}
