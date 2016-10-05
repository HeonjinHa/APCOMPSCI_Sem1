import java.util.Scanner;
public class Ex_02_Average
{
	
	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);
		
		
		System.out.println("what is your first number");
		double num1 = kb.nextDouble();
		System.out.println("what is your second number");
		double num2 = kb.nextDouble(); 
		System.out.println("what is your third number");
		double num3 = kb.nextDouble();
		
		 Print(num1, num2, num3, calcAvg(num1, num2, num3));
	}
	public static double calcAvg(double num1, double num2, double num3)
	{
		  return (num1 + num2 + num3)/ 3 ;
	}
	
	 
	
	public static void Print(double num1, double num2, double num3, double average)
	{
      
		System.out.printf ("The average of %-7.5f,%-7.5f, and %-7.5f is %-7.5f", num1,num2,num3,average);
	}
	
}