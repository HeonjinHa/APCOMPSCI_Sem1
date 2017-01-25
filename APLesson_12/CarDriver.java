import java.util.Scanner;
public class CarDriver
{
	
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the paint color of your car:");
        String P = kb.nextLine();

        System.out.println("Enter the interior type of your car:");
        String I = kb.nextLine();

        System.out.println("Enter the engine type of your car:");
        String E = kb.nextLine();
		
        System.out.println("Enter the tires of your car:");
        String T = kb.nextLine();

        Car object = new Car(P, I, E, T);

        System.out.println("\n\nYour vehicle is ready......\n" +
                "Paint: \t\t\t  " + object.getPaint() + "\n" +
                "Interior: \t\t  " + object.getInterior() + "\n" +
                "Engine: \t\t  " + object.getEngine() + "\n" +
                "Tires: \t\t\t  " + object.getTires());
    }
}