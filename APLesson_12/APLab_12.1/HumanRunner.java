import java.util.Scanner;
public class HumanRunner
{
    public static void main (String[]args)
    {
        Scanner keyboard = new Scanner (System.in);

        System.out.println("Please enter your eye color: ");
        String e = keyboard.nextLine();

        System.out.println("Please enter your hair color: ");
        String h = keyboard.nextLine();
		
        System.out.println("Please enter your skin color: ");
        String s = keyboard.nextLine();
		
        Human object = new Human (e, h, s);

        System.out.println("your hair color: " + object.getHair());
        System.out.println("your eye color: " + object.getEyes());
        System.out.println("you skin color: " + object.getSkin());
      
	   object.setHES ("Blonde" , "Blue"  , "white "  );
	   System.out.println(" \n Friend's information: \n"+ object.getHair() + "\n" + object.getEyes() + "\n" + object.getSkin() + "\n" + "" );


    }
}
