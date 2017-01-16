import java.util.Scanner;

/**
 * Created by ¡ÿ«• on 2015-10-06.
 */
import java.util.Scanner;

public class CarRunner {
    public String paint, interior, engine, tires;

    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What color do you want your car to be?");
        String paint = keyboard.nextLine();

        System.out.println("What interior do you want to have?");
        String interior = keyboard.nextLine();

        System.out.println("What engine do you want to have?");
        String engine = keyboard.nextLine();

        System.out.println("What tires do you want to have?");
        String tires = keyboard.nextLine();

        Car car = new Car(paint, interior, engine, tires);

        System.out.println("\n\nYour vehicle is ready......\n" +
                "Paint: \t\t\t  " + car.getPaint() + "\n" +
                "Interior: \t\t  " + car.getInterior() + "\n" +
                "Engine: \t\t  " + car.getEngine() + "\n" +
                "Tires: \t\t\t  " + car.getTires());
    }
}
