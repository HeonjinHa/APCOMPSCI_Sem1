import java.util.Scanner;
public class Ex_04_Graph_Table 
{
	public static void main (String[]args) 
	{
		Scanner kb = new Scanner(System.in); 
		System.out.println("User input plz"); 
		int num1 = kb.nextInt(); 
		System.out.println("What is size of your table ");
		int num2 = kb.nextInt(); 
		
		System.out.println("X        	|| Y");
		for (double i = 1; i <= num2; i++)
		{ 
		double value = i* num1 ;
		System.out.printf(" %f || %f \n",i,value);
		
		}
	}
}