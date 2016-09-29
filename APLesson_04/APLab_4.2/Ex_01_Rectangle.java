import java.util.Scanner;
public class Ex_01_Rectangle
{
	static double l;
	static double w;
	static double p;
	
	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);
		
		
		System.out.println("How long is your rectangle?");
		l = kb.nextDouble();
		System.out.println("How tall is your rectangle");
		w = kb.nextDouble(); 

		calcPerim();
		Print();
		
	}
	
	public static void calcPerim()
	{
		   p = 2* (l+w);
	}
	 
	
	public static void Print()
	{
    
	 System.out.printf ("The perimeter of your rectangle is...%5.5f",p );
	 System.out.println("ft around");
	}
}