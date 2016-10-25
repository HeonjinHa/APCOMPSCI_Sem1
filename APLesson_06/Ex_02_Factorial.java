import java.util.Scanner;
public class Ex_02_Factorial
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your number:");
		int num = kb.nextInt();
		int fact = 1;
		for(int i = 1 ; i <= num; i++) 
		{
			fact = i * fact;
		}
		System.out.println(fact);
	}
}