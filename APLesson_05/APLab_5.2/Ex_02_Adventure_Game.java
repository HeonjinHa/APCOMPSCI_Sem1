import java.util.Scanner;
public class Ex_02_Adventure_Game
{
	static String First;
	static String Second;
	static String Third;
    public static void main(String[]args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("When you opened your eyes, a humoungous dragon is sleeping front of you. \nAre you going to attack? \nPlease enter Y or N");
        First = kb.next();
        if (First.equals("Y")) 
        {
            System.out.println("You were so powerless that dragon didn't wake up. \nWould you attack the dragon once again with sword this time?");
            Second = kb.next();
            if (Second.equals("Y"))
            {
                System.out.println("The dragon finally woke up, but he can't see you because you are so small! \nMaybe attack once again");
                Third = kb.next();
				
                if (Third.equals("Y"))
                {
                    System.out.println("Dragon finally notices you! At the same time, he squishes you down and now you are dead...");
                }
                else
                {
                    System.out.println("You decide to go to the other way. But as soon as you turn around, dragon finds you and eat you! yum yum");
                }
            }

            else
            {
                System.out.println("OK. You decide to leave dragon where he is sleeping. But as soon as you turn around, dragon wakes up and eats you. yum yum \'breakfast\' !");
            }
        }
        else
        System.out.println("You walk the other direction and finds another dragon not sleeping this time! Oh well. you start praying, but dragon eats you anyway ");
    }
}
