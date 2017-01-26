import java.util.Scanner;
public class Ex_07_FindTheZs
{
	public static String[]words;
	public static void main (String[]args) 
	{
		words = new String [5];
	
		fillArray(); 
		
		System.out.println("For the words");
		printArray();
		System.out.println("Only " + hasZs() + " contain the letter z");  
	}

	public static void fillArray()
	{
		Scanner kb = new Scanner(System.in); 
		System.out.println("Please enter in 5 words: ");
		
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next(); 
		}	

	}
	public static String printArray()
	{
		String array = " ";
		for (String word : words) 
		{
			array += (words + " ");
		}
		return array;
	}
	public static String hasZs()
	{
		String zs = ""; 
		for (String word: words)
		{
			if (word.indexOf("z") >=0 )
			{
					zs = zs + word + ",";
			}
		}
		return zs;
	}
}