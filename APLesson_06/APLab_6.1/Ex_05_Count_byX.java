import java.util.Scanner;
public class Ex_05_Count_byX
{
	public static void main (String[]args) 
	{
		Scanner kb = new Scanner(System.in); 
		System.out.println("Enter in the limit of the number"); 
		int num1 = kb.nextInt();
		System.out.println("Enter in the number that will add up by ");
		int num2 = kb.nextInt(); 
		for (int i = 0 ; i <= num1 ;i+= num2)
		{
			System.out.print(i + "\t"); 
		}
	}
}