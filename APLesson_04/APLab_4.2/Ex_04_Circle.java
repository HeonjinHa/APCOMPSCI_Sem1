import java.util.Scanner;
public class Ex_04_Circle
{
	static double r;
	static double area;
	
	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);
		
		
		System.out.println("Imagine a circle. \nwhat is your imaginary circle's radius?");
		r = kb.nextDouble();
		 calcArea();
		 Print();
	}
	
	public static void calcArea()
	{
		    area = (3.14 * r * r);
		
	}
	 
	
	public static void Print()
	{
        System.out.printf ("Your area of circle is... %7.5f", area);
		
	}
}