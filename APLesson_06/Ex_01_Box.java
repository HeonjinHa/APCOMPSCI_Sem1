import java.util.Scanner;
public class Ex_01_Box
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your word:");
		String ex = kb.next ();
		
		for(int i = 0 ; i < ex.length(); i++) 
		{
			System.out.println(ex);
		}
		
	}
}