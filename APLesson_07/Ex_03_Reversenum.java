import java.util.Scanner;
public class Ex_03_Reversenum
{
	static int number;
	static int rev;
	
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in); 
		System.out.println("Please enter a number: ");
		number = kb.nextInt();
		rev = 0;
		getReverse();
		System.out.println( number + " reversed is " + rev);
	}
	
	public static void getReverse()
	{
		int num = number;
		while(num > 0) 
		{
			rev = rev * 10;
			rev = rev + (num % 10);
			num /= 10;	
		}
		
	}
}