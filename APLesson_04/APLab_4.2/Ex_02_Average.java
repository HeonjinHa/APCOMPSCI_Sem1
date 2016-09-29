import java.util.Scanner;
public class Ex_02_Average
{
	static double num1;
	static double num2;
	static double num3;
	static double avg;
	
	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);
		
		
		System.out.println("what is your first number");
		num1 = kb.nextDouble();
		System.out.println("what is your second number");
		num2 = kb.nextDouble(); 
		System.out.println("what is your third number");
		num3 = kb.nextDouble();
		
		 average();
		 Print();
	}
	public static void average()
	{
		  avg = (num1+ num2+ num3)/ 3;
	}
	
	 
	
	public static void Print()
	{
      
		System.out.printf ("The average of %-7.5f,%-7.5f, and %-7.5f is %-7.5f", num1,num2,num3,avg);
	}
}