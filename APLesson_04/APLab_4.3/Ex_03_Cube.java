import java.util.Scanner;
public class Ex_03_Cube
{
	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);
		
		
		System.out.println("Please tell me the measurement of the one of your cube side ");
		double side  = kb.nextDouble();

		 Print(calcSurf(side));
	}
	
	public static double calcSurf(double side)
	{
		return (6 * side * side); 
		
	}
	 
	
	public static void Print(double surface)

	{
    
		System.out.printf ("The surface area of cube with %7.5f", side);
		System.out.printf (" sides is... %7.5f", surface);
	}
}