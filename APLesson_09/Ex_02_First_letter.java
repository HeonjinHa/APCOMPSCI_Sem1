import java.util.Scanner;
public class Ex_02_First_letter
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
		first(words);
	}
	
	public static void first(String[] word)
	{
		for(int i = 0; i < word.length; i++ )
		{
			System.out.println(word[i].charAt(0));
		}
	}
	
}