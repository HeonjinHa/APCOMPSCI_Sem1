import java.util.Scanner;
public class Ex_05_Adventure_Game
{
	static String First;
	static String Second;
	static String Third;
	static String Fourth;
	static String Fifth;
	static String Sixth;
	static String Seventh;

	
    public static void main(String[]args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.println("When you opened your eyes, a humoungous dragon is sleeping front of you. \nAre you going to attack? \nPlease enter \'y\' as an yes or \'n\' as a no");
        First = kb.next();
        if (First.equalsIgnoreCase("y")) 
        {
            System.out.println("You were so powerless that dragon didn't wake up. \nWould you attack the dragon once again with sword this time?");
            Second = kb.next();
            if (Second.equalsIgnoreCase("y"))
            {
                System.out.println("The dragon finally woke up, but he can't see you because you are so small! \nMaybe attack once again?");
                Third = kb.next();
                if (Third.equalsIgnoreCase("y"))
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
                System.out.println("hmm.. you walk the other way and finds another dragon sleeping but this time smaller than previous, maybe attack?  "); 
				Fourth = kb.next();
				if (Fourth.equalsIgnoreCase("y"))
				{
					System.out.println ("The dragon wakes up fires a blast at you. Now you melted to death");
				}
				else 
				{
					System.out.println ("You try to go to the other direction and gets lost. \nYou have know idea where you are without food and water. Then you die in hunger and thirst");
				}
					
			}
		}
		else 
		{
			System.out.println("You walk down to the village but it is little strange. It is too quite... \n !!! A zombie appears out of no where. attack..?");
			Fifth = kb.next(); 
			if (Fifth.equalsIgnoreCase("y"))
			{
				System.out.println ("a");
				Sixth = kb.next();
				if (Sixth.equalsIgnoreCase("y")) 
				{
					System.out.println("Y OR N") ;
				}
				else 
				{
					System.out.println ("Y OR N");
				}
			}
			else
			{
				System.out.println("Y OR N");
				Seventh = kb.next();
				if (Seventh.equalsIgnoreCase("y"))
				{
					System.out.println ("Y OR N");
				}
				else 
				{
					System.out.println ("Y OR N");
				}
			}
		}
	}
}	