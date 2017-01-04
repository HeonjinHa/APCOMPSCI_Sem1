import java.util.Scanner;
public class Ex_06_BiggestNumber
{
	static int[] numbers = new int[10];
	public static void main (String[]args) 
	{
		
		fillArray(); 

		System.out.println("For the following numbers..." + printArray()); 
		System.out.println("Their biggest number is  " + getBiggest() + "!");
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
	
	
	public static int getBiggest() 
	{
		
		int max = 0; 
		for (int num : numbers)
		{
			if (num > max )
			{
				max = num;
			}
		}
		return max;
	}
} 