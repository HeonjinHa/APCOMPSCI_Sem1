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

public class MilesPerHour
{
    //instance variables....
    //integers for distance, hours, minutes
    //double for mph
    private int distance, hours, minutes;
    private double mph;

    //default constructor
    public MilesPerHour ()
    {
        //set integers to 0
        //set mph to 0
        distance = 0;
        hours = 0;
        minutes = 0;
        mph = 0;
    }



    //constructor with params
    //Overloading
    public MilesPerHour (int d, int h, int m)
    {
        distance = d;
        hours = h;
        minutes = m;
        mph = 0;
    }

    //modifier
    public void setValues(int d, int h, int m)
    {
        distance = d;
        hours = h;
        minutes = m;
        mph = 0;
    }
        //set distance, hours, and minutes to param values

    //calculate the distance
    public void calcMPH()
    {
        mph = Math.round(distance / (hours + minutes / 60.0));
    }

    //accessor
    public double getMPH()
    {
        return mph;
    }
        //returns the distance value

}
