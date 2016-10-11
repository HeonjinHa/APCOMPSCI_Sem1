import java.util.Scanner;

public class EX_03
{
	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Hello I will calculate your compound interest!! \nPlease enter in your interest rate");
        double r = kb.nextDouble();
		System.out.println("Please enter in your principal");
		double p = kb.nextDouble();
		kb.nextLine();
		System.out.println("Please enter in your number of Times compounded");
		double n = kb.nextDouble();		
		System.out.println("Lastly please enter in your Life of the Loan");
		double t = kb.nextDouble();
		
		EX_03 average = new EX_03();
		double payment = average.calcPay(r,p,n,t); 
		System.out.printf("Your monthly payment is...%10.2f\n",  payment);

	}
	public double calcPay(double r, double p, double n, double t) 
	{
	      return (p*(Math.pow (1+r/n, n * t))) / (t*12);
	}
}