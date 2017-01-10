import java.util.Scanner;
public class Ex_05_Gamegun
{
	static int bulletCount;
	static int clipsize = 16;
	static int shotCount;
	static String[]clip;

    public void main String[]clip;	
    {
		Scanner kb = new Scanner (System.in);
        bulletCount = 96;
        shotCount = 0;
        clip = new String[clipsize];
        resetClip();
		
        while (runner.getBulletCount() > 0 || runner.getShotCount() > 0)
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
			
            System.out.println(printClip());
        }
        System.out.println("Out of bullets!!!");
    }

    public void resetClip()
    {
        for (int i=0; i < clipsize; i++)
        {
            clip[i] = "[]";
        }
    }

    public String shoot()
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

    public void reload()
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

    public void PrintClip()
	{
		
		System.our.println("Bullets:" + "\t" + bulletCount + "\n" + "Clip: " + "\t" );
		
		String output = " "; 
		for(i=0; i < clipsize; i++)
		{
			clip[i] = output;
		}
		
		System.out.print(output);
	}
	
   
}