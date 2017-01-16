/**
 * Exercise_02
 *
 * In this lab, you will write an object-oriented program that
 * calculates the distance between 2 points on a graph. You
 * should be able to input coordinates and output the distance.
 */


import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
    //main() method
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
    // 이거 에러뜨면 x1~y2 이름 바꿔서 다시 돌려보셈

    //new Distance object
    Distance daeseong = new Distance (x1, y1, x2, y2);

    //set coordinates on new object

    //run calcDistance
    daeseong.calcDistance();
    //print the distance with a label and number formatting
    System.out.println("Your distance is "+ daeseong.getDistance());
    //EX: distance = 22.35

    //run the same calculations for 5 different sets of coordinates
}
}
