import java.util.Scanner;
public class Ex_01_Reverse_Word
{

	public static void main (String[]args) 
	{
		String [] words = new String [5];
		Scanner kb = new Scanner(System.in); 
		System.out.println("Please enter in 5 words: ");
		
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next(); 
		}
		
		System.out.println("In order...");
		for(String word: words)
		{
			System.out.println (word);
		}
		System.out.println("\nReversed...");
		Reversed(words);	
	}
	
	public static void Reversed(String[] W)
	{
		for(int i = W.length; i > 0; i--)
		{
			System.out.println(W[i-1]);
		}
	}
	
}