import java.util.Scanner;
public class Ex_06_GameHealth
{
    static String[]health;
    static int HEALTHLOAD = 6;
    static int healthCount;
	
    public static void main(String[]args) 
    {
       	Scanner kb = new Scanner (System.in);
	    String turn = ""; 
		int damage = 0;
		int ammount = 0;
		healthCount = 6;
		health = new String [HEALTHLOAD];
		
		while (turn != "Q" && healthCount > 0 )
		{
			
			System.out.println("Your turn! Hit Enter when ready: "); 
			turn = kb.next();
			damage = (int) (Math.random()* 2 + 1 );
			ammount = (int) (Math.random()* 6 + 1  );
			System.out.println(takeDamage(damage,ammount));
			System.out.println(printClip());
		}
		
		System.out.print("You died!!!");
    }

    
    public static String takeDamage(int dmg, int amt)
    {
        if (dmg == 1)
        {
            healthCount -= amt;
            return "Taking " + amt + " damage.";
        }
        else
        {
            if (healthCount + dmg < HEALTHLOAD)
            {
                healthCount += amt;
            }
            else
            {
                healthCount = HEALTHLOAD;
            }
        }
		return "Powering up " + amt + "!";
    }

	public static String printClip()
    {
        String output = "Health: \t";
		
        for (int i=0; i < HEALTHLOAD; i++)
        {
            if (i < healthCount)
            {
                health[i] = " @ ";
            }
            else
            {
                health[i] = " [] ";
            }
			output += health[i];
        }
        return output;
    }
}
