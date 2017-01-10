public class Ex_06_GameHealth
{
    static String[]health;
    static int HEALTHLOAD = 6;
    static int healthCount;
	
    public static void main(String[]args) 
    {
        health = new String [HEALTHLOAD];
        healthCount = HEALTHLOAD;
        resetHealth();
    }
	
    public static void resetHealth()
    {
        for (int i=0; i < HEALTHLOAD; i++)
        {
            health [i] = "@";
        }
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
            return "Powering up " + amt + "!";
        }
    }

   
    public static int getHealthCount()
    {
        return healthCount;
    }


   
    public String toString()
    {
        String output = "Health:    ";
        for (int i=0; i < HEALTHLOAD; i++)
        {
            if (i < healthCount)
            {
                health[i] = "@  ";
                output += health[i];
            }
            else
            {
                health[i] = "[]  ";
                output += health[i];
            }
        }
        return output;
    }
}
