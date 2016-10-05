import java.util.Random;
public class Ex_01 
{
	public static void main(String[]args)
	{
		Random rand = new Random(); 
	int P = rand.nextInt(7);
    int C = rand.nextInt(7); 
	
	System.out.println("You rolled a " + P );
	System.out.println("Computer roleld a " + C);
    
	boolean compare = P > C; 
	
	if (compare)
	System.out.println("Winner is you! ");
    if (!compare) 		
	System.out.println("Winner is computer!");
	}
}