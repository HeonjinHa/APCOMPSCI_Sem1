import java.util.Scanner;

public class Ex_04
{
	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter in your height of Subwoofer Box in inch");
        double n1 = kb.nextDouble();
		System.out.println("Please enter in your length of Subwoofer Box in inch ");
		double n2 = kb.nextDouble();
		System.out.println("Please enter in your width of of Subwoofer Box in inch");
		double n3 = kb.nextDouble();		
	
		
		Ex_04 average = new Ex_04();
		double volume = average.calcVol( n1,  n2,  n3); 
		System.out.printf("Your volume of Subwoofer Box is...%10.2f\n",  volume );

	}
	public double calcVol(double n1, double n2, double n3) 
	{
	      return ((n1*n2*n3) * 0.00057870 );
		  
	}
}