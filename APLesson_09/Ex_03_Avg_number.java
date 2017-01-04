import java.util.Scanner;
public class Ex_03_Avg_number
{
	public static void main (String[]args) 
	{
		int[] numbers = new int[10]; 
		
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) +1; 
		}
		
		for(int num : numbers) 
			System.out.println(num); 
		
		System.out.println();
		System.out.println("The average of the above numbers is... " +  average(numbers));
	}
	
	public static int average(int[]n) 
	{
		int sum = 0;
		for(int num: n )
		{
			sum += num;
		}
		int avg = sum/ 10;
		
		return avg; 
		
	}
}