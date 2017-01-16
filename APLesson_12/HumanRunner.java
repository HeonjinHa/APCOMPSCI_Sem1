/**
 * Created by ¡ÿ«• on 2015-10-06.
 */
import java.util.Scanner;

public class HumanRunner
{
    public static void main (String []args)
    {
        Scanner keyboard = new Scanner (System.in);

        System.out.println("Please enter your eye color: ");
        String eyeColor = keyboard.nextLine();

        System.out.println("Please enter your hair color: ");
        String hairColor = keyboard.nextLine();

        System.out.println("Please enter your hair type: ");
        String hairType = keyboard.nextLine();

        System.out.println("Please enter your skin color: ");
        String skinColor = keyboard.nextLine();

        System.out.println("Please enter your height in inch: ");
        int height = keyboard.nextInt();

        System.out.println("Please enter your weight in pound: ");
        int weight = keyboard.nextInt();

        Human roger = new Human (eyeColor, hairColor, skinColor,hairType,height,weight);

        System.out.println("\n\nRoger's hair color: " + roger.getHairColor());
        System.out.println("Roger's eye color: " + roger.getEyeColor());
        System.out.println("Roger's hair type: " + roger.getHairType());
        System.out.println("Roger's skin color: " + roger.getSkinColor());
        System.out.println("Roger's height: " + roger.getHeight() + " inches");
        System.out.println("Roger's weight: " + roger.getWeight() + " lbs");



    }
}
