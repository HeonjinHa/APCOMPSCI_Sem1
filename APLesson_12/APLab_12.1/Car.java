public class Car
{
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
 

    public void setCustom (String P, String I, String E, String T)
    {
        paint = P;
        interior = I;
        engine = E;
        tires = T;
    }

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
    
}
