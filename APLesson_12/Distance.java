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

public class Distance
{

    //declare instance variables...
    //integers xOne, yOne, xTwo, yTwo
    //double distance
    private int xOne, yOne, xTwo, yTwo;
    private double distance;

    //constructor....
    public Distance()
    {
    //set all coordinates to
    // set distance to 0
        xOne = 0;
        yOne = 0;
        xTwo = 0;
        yTwo = 0;
        distance = 0;
    }

    //constructor
    public Distance (int xF, int yF,int xS,int yS)
    {
        //set coordinates to params
        xOne = xF;
        yOne = yF;
        xTwo = xS;
        yTwo = yS;
        //set distance to 0
        distance = 0;
    }

    //Modifier to reset coordinates
    public void setDistance (int x1, int y1, int x2, int y2)
    {
        xOne = x1;
        yOne = y1;
        xTwo = x2;
        yTwo = y2;
        distance = 0;
    }

    //Method to calculate the distance
    public void calcDistance()
    {
        distance = Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
    }

    //Accessor to return distance
    public double getDistance ()
    {
        return distance;
    }
}
