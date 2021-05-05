import java.util.Scanner;

public class Payroll
{
   public static void main(String[] args)
   {
	  Scanner scnr = new Scanner(System.in);
	  System.out.println("Enter your name: ");
	  String name = scnr.nextLine();
	  System.out.println("Enter hours worked: ");
      int hours = scnr.nextInt();
	  System.out.println("Enter pay rate: ");
      double grossPay, payRate = scnr.nextDouble();

      grossPay = hours * payRate;
      System.out.println(name + "'s gross pay is $" + grossPay);
      System.out.println(name + " worked " + hours + " hours with a $" + payRate + " payrate;");
      
      
      
   }
}