import java.util.Scanner;



public class payroll
{
   public static void main(String[] args)
   {
	   Scanner scnr = new Scanner (System.in);
      int hours = 40;
      System.out.println("Enter your pay");
      System.out.println("Enter your hours");
      double grossPay, payRate = scnr;

      grossPay = hours * payRate;
      System.out.println( grossPay);      
      
   }
}
