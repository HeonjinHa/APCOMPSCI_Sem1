import java.util.Scanner;
public class Ex_05_GetOdds
{
	static int[] numbers = new int[10];
	public static void main (String[]args) 
	{
		
		fillArray(); 

		System.out.println("For the following numbers..." + printArray()); 
		System.out.println("The " + getOdds() + "are odd numbers ");
	}
	
	public static void fillArray()
	{
		for(int i = 0; i < numbers.length; i++)
			{
				numbers[i] = (int)(Math.random()*100)+1;
			}	
	 
	}
	public static String printArray()
	{
		String array = " ";
		for (int num : numbers) 
		{
			array += (num + " ");
		}
		return array;
	}
	
	public static String getOdds() 
	{
		String odds = "";
		for (int num : numbers){
			if (num % 2 == 1){
				odds += (num + " ");
			}
		}
		return odds;
	}
}