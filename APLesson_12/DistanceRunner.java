import java.util.Scanner;
public class DistanceRunner
{
	public static void main (String []args)
	{
    Scanner keyboard = new Scanner (System.in);

    System.out.println("Enter value for x1: ");
    int x1 = keyboard.nextInt();
    System.out.println("Enter value for y1: ");
    int y1 = keyboard.nextInt();
    System.out.println("Enter value for x2: ");
    int x2 = keyboard.nextInt();
    System.out.println("Enter value for y2: ");
    int y2 = keyboard.nextInt();

    Distance object = new Distance (x1, y1, x2, y2);
    System.out.println("Your distance is "+ object.getDist());
	
	 object.setValues (100,20,20,15);
	
	System.out.println("Your distance is  "+ object.getDist() + "with setvalues" );

	}
}
