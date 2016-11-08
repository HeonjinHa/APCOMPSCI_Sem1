import java.util.Scanner;
public class Ex_02_Center
{
	static String word1;
	static String word2;
	static String word3; 
	
	public static void main (String[]args) 
	{
		Scanner kb = new Scanner(System.in); 
		System.out.println("Please enter a word:");
		word1 = kb.nextLine();
		System.out.println("Please enter another word:");
		word2 = kb.nextLine();
		System.out.println("Please enter last one word:");
		word3 = kb.nextLine();
	}
}