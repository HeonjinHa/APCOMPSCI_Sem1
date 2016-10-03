import java.util.Scanner;
public class Ex_01_Rectangle
{
	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);
		
		
		System.out.println("How long is your rectangle?");
		double l = kb.nextDouble();
		System.out.println("How tall is your rectangle");
		double w = kb.nextDouble(); 
		Print(calcPerim(l,w));

	}	
	public static double calcPerim(double l, double w)
	{
		return 2*(l+w);
	}
	 
	
	public static void Print(double perimeter)
	{
    
	 System.out.printf ("The perimeter of your rectangle is...%5.5f", perimeter );
	 System.out.println("ft around");
	}
}