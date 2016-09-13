import java.util.Scanner; //import Statement

public class Calculator
{
	public static void main(String[]args)

	{
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Hello sir, I am Calculator. Imagine a triangle \nwhat is height of your triangle?");
		double height = kb.nextDouble();
		System.out.println("one more. How long is your triangle base?");
		double base = kb.nextDouble(); 
		
		double result = height * base / 2; 
		System.out.println ("Your Triangle's area is..." + result);
		
		
		
	}
}