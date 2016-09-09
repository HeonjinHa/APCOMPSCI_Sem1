import java.util.Scanner; //import Statement

public class BMI_Calculator
{
	public static void main(String[]args)

	{
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Hello sir, this is new technology of BMI Calculator \nWhat is your height in m^2 ?");
		double height = kb.nextDouble();
		System.out.println("And your weight in kg?");
		double weight = kb.nextDouble(); 
		
	   double result = weight / height;
	    System.out.println ("Your BMI result is..." + result);
		
		
	}
}
	
	