import java.util.Scanner;
public class Ex_05_Gamegun
{
	static int bulletCount;
	static int clipsize = 16;
	static int shotCount;
	static String[]clip;

    public static void main (String[]args)	
    {
		int i =0;
		Scanner kb = new Scanner (System.in);
        bulletCount = 96;
        shotCount = 0;
        clip = new String[clipsize];
        resetClip();
		
        while ( bulletCount > 0 || shotCount > 0)
        {
            System.out.println("Action: ");
            String action = kb.next();
            if (action.equalsIgnoreCase("R"))
            {
                reload();
            }
            else if (action.equalsIgnoreCase("S"))
            {
                System.out.println(shoot());
            }
			
            PrintClip();
        }
        System.out.print("Out of bullets!!!");
    }

    public static void resetClip()
    {
        for (int i=0; i < clipsize; i++)
        {
            clip[i] = "[]";
        }
    }

    public static String shoot()
    {
        if (shotCount > 0)
        {
            clip[shotCount - 1] = "[]";
            shotCount = shotCount -1;
            return "Boom!!!";
        }
        else
            return "Reload!!!";
    }

    public static void reload()
    {
	
        if (bulletCount >= clipsize)
        {
            bulletCount = bulletCount - clipsize;
            shotCount = clipsize;
        }
        else
        {
            shotCount = bulletCount;
            bulletCount = 0;
        }
		
        resetClip();
        for (int i=0; i<shotCount; i++)
        {
            clip[i] = " * ";
        }
    }

    public static void PrintClip()
	{
		int i=0;
		System.out.println("Bullets:" + "\t" + bulletCount + "\n" + "Clip: " + "\t" );
	
		String output = " "; 
		for(i=0; i < clipsize; i++)
		{
			output += clip[i];
		}
		
		System.out.print( output + "\n");
	
	}
   
}