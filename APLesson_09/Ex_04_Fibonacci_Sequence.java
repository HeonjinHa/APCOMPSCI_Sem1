import java.util.Scanner;
public class Ex_04_Fibonacci_Sequence
{
	static int num;
	static int size; 
	public static void main (String[]args) 
	{
		Scanner kb = new Scanner(System.in); 
		System.out.println("Please enter your starting number:");
		num = kb.nextInt(); 
		System.out.println("Please enter your sequence size:");
		size = kb.nextInt(); 
		
		int[] seq = new int [size]; 
		
		for(int i = 0; i < seq.length; i++)
		{
			if(i ==0 || i==1 )
			{
				seq[i] = num; 
			}
			else
			{
				seq[i] = seq[i-2] + seq[i-1]; 
			}
		System.out.println(seq [i] + " ");	
		}
	}
}