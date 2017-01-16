/**
 * Created by captainHowdy on 9/29/2015.
 */
import java.util.Scanner;

public class Car
{
    /**
     * Ex_02
     * In this exercise, you will be creating a car class
     * You must choose at least 4 properties to use as parameters
     * for your car objects. Set them as inputs, and print
     * your car's information.
     */
    private String paint,interior,engine,tires;

    public Car()
    {
        paint ="";
        interior = "";
        engine = "";
        tires = "";
    }

    public Car(String P, String I, String E, String T)
    {
        paint = P;
        interior = I;
        engine = E;
        tires = T;
    }
    /**Constructor: with 4 parameters*/

    public void setCar (String P, String I, String E, String T)
    {
        paint = P;
        interior = I;
        engine = E;
        tires = T;
    }
    /**Modifier: parameters to modify objects*/

    public String getPaint()
    {
        return paint;
    }
    public String getInterior()
    {
        return interior;
    }
    public String getEngine()
    {
        return engine;
    }
    public String getTires()
    {
        return tires;
    }
    /**Accessors: return information about your vehicle*/

    /**
     * Main(): take 4 inputs for properties of your car.
     * instantiate a new Car object, put in parameters, and
     * print out the information on your car. You should get
     * similar results to the following....
     *
     * Your vehicle is ready......
     * Paint:		 red w/gold fleck
     * Interior:	 Corinthian leather (Brown)
     * Engine:		 5 litre v8 507hp
     * Tires:		 20" Priellis
     */
}
