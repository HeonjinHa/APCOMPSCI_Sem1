import java.util.Scanner;
public class Ex_03_Lucky7s
{
	static int num;
	
	public static void main (String[]args) 
	{
		Scanner kb = new Scanner(System.in); 
		System.out.println("Please enter a number");  
		System.out.println(lucky(kb.nextInt()));
		
	}
	
	public static int lucky(int num)
	{
		if (num > 0)
		{
			if (num%10 == 7)
			{
				return 1 + lucky(num/10); 
			}
			
			else 
			{
				return 0 + lucky(num/10); 
			}
		}
		else 
		{
			return 0; 
		}
	}
}