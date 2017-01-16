/**
 * Exercise_01
 *
 * In this lab, you will build a program that calculates speed
 * based on the time and distance covered. You will calculate
 * the distance and print out the result.
 */

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class MPHRunner
{
    //main() method
        //create a Scanner object
        //get user inputs for distance, hours, and minutes
    public static void main(String []args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the distance: ");
        int dist = keyboard.nextInt();
        int hrs = keyboard.nextInt();
        int mins = keyboard.nextInt();

        MilesPerHour mph = new MilesPerHour(dist, hrs, mins);

        mph.calcMPH();

        System.out.println("Your current speed: " + mph.getMPH());

        mph.setValues (78,1,20);
        mph.calcMPH();

        System.out.println("Your current cpeed: " + mph.getMPH());
    }


        //run the modifier
            //set distance, hours, and minutes = to user inputs

        //run calcMPH
        //print the results, formatted nicely....
        //EX: 10 miles in 2 hours = 5 mph
}
