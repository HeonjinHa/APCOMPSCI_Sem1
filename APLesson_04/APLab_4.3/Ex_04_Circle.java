import java.util.Scanner;
public class Ex_04_Circle
{
	
	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);
		
		
		System.out.println("Imagine a circle. \nwhat is your imaginary circle's radius?");
		double r = kb.nextDouble();

		 Print(calcArea(r));
	}
	
	public static double calcArea(double r)
	{
		  return (3.14 * r * r);
		
	}
	 
	
	public static void Print(double area)
	{
        System.out.printf ("Your area of circle is... %7.5f", area);
		
	}
}