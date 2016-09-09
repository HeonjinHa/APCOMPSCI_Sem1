import java.util.Scanner; //import Statement

public class EX_01
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("How old are you? ");
		
		//search for the next integer that the user enters
		int num = keyboard.nextInt();
		
		//print the results...
		System.out.println("Wow! " + num + "is perfect. You're pretty handsome." );
		
		
		
	}
}