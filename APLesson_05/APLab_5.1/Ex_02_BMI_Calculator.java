import java.util.Scanner;
public class Ex_02_BMI_Calculator 
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("I am a BMI Calculator \nWhat is your height in inch?");
		double height = kb.nextDouble();
		System.out.println("And your weight in pound?");
		double weight = kb.nextDouble(); 
		
 
		double BMI = 703 * (weight/(height * height));
		String value = calcBMI(BMI);
		
		System.out.println("Your BMI rate is... " + BMI);
		System.out.println("Your " + value);
		
	}
	
	public static String calcBMI(double value)
	{
		if (value > 39.9)
			{return "condition is Morbidly Obese";}
		else if (value >=35)
			{return "condition is Very Obese";}
		else if (value >=30)
			{return "condition is Obese";}
		else if (value >= 25)
			{return "condition is Overweight";}
		else if (value >=18.5 )
			{return "condition is  Normal" ;}
		else 
			{return "condition is Underweight";}
	}
}
		