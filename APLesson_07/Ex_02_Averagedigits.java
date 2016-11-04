import java.util.Scanner;
public class Ex_02_Averagedigits
{
	static int number;
	static int digits = 0;
	static int average = 0; 
	
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in); 
		System.out.println("Please enter a number: ");
		number = kb.nextInt();
		avDigits();
		System.out.println("The average of digits in " + number + " is " + average);
	}	
	
	public static void avDigits()
	{
		int num = number;
		while(num > 0) 
		{
			digits ++; 
			average = average + (num % 10);
			num /= 10;	
		}
		average = average/ digits;
	}
}	