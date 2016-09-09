import java.util.Scanner; //import Statement

public class RudeAI
{
	public static void main(String[]args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hi, my name is RudeAI \n I'd like to ask you a few questions.");
		System.out.println("What is your name");
	
     	String name = keyboard.next(); 
		System.out.println("Wow,"+ name + ". that is fun name to make fun of" );
		System.out.println("How old are you " + name + "?");
		int num = keyboard.nextInt();
		
		
		System.out.println("Oh my god! " + num + "?!  are you serious? because your age and your appearance seems very unbalanced...  " );
		System.out.println("What do you do for fun?");
		
		String hobby = keyboard.next();
		
		System.out.println("I thought only nerds like to " + hobby + ", " + name + "?");
		System.out.println("What kind of music do you like?");
		
		String music = keyboard.next();
		System.out.println("OK, really?!" + music + "? man,, you like kinds of musics that just fits your age... \n keep in touch with new world!");
		System.out.println("How many siblings do you have?");
		
		String siblings = keyboard.next();
		System.out.println( siblings + "? Wow, I hope the rest of your family is better looking.");
		System.out.println("What do you want to be when you grow up?");
		
		String grow = keyboard.next();
		System.out.println("oh.. intresting... but I think you should study harder to becoming a " + grow );
		System.out.println("So.." + name + " you're " + num + ".. \n You like to " + hobby); 
		System.out.println("Also good luck becoming a " + grow + "\n I was only kiddin' " + name);
	}
}