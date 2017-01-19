import java.util.Scanner;
public class MPHRunner
{
    public static void main(String []args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the distance:");
        int distance = keyboard.nextInt();
		System.out.println("Enter the hours:");
        int hours = keyboard.nextInt();
		System.out.println("Enter the minutes:");
        int minutes = keyboard.nextInt();

        MilesPerHour object = new MilesPerHour (distance, hours, minutes);

        System.out.println("Your MPH is  " + object.getMPH());

        object.setValues (100,3,5);
        object.getMPH();

        System.out.println("Your M8PH is " + object.getMPH());
    }
}
