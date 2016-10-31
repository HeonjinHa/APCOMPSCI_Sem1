import java.util.Scanner;
public class Ex_08_Song
{
	public static void main (String[]args) 
	{
		String Na= "Na"; 
		int num4 = 4;
		String Hey = "Hey";
		int num3 = 3; 
		String Gb = "Goodbye";
		int num1 = 1; 
		
		sing(Na,num4);
		sing(Na,num4);
		sing(Hey,num3);
		sing(Gb,num1);
		
	}
	
	public static void sing(String word, int num) 
	{
		for (int i = 0; i < num ; i++)
		{
			System.out.print(word + " ");
		}
		System.out.println("");
	}
}