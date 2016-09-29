import java.util.Scanner;
public class Ex_03_Cube
{
	static double side;
	static double sa;
	
	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);
		
		
		System.out.println("Please tell me the measurement of the one of your cube side ");
		side  = kb.nextDouble();
		 calcSurf();
		 Print();
	}
	
	public static void calcSurf()
	{
		    sa = 6 * side * side;
		
	}
	 
	
	public static void Print()
	{
    
		System.out.printf ("The surface area of cube with %7.5f",side);
		System.out.printf (" sides is... %7.5f", sa);
	}
}