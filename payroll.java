import java.util.Scanner;
public class Payroll
{
   public static void main(String[] args)
   {
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Please enter the number of hours ");
	   
      int hours = scan.nextInt();
      double grossPay, payRate = 25.0;

      grossPay = hours * payRate;
      System.out.println("Your gross pay is $" + grossPay);
   }
}
