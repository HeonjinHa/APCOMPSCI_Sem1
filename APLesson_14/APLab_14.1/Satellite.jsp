import java.util.*;
public class Satellite
{
   public static void main(String[]args)
   {
       ArrayList<Location> locate = new ArrayList<>();
       double[] honLoc = {5, 6};
       locate.add(new Honda(honLoc));
       locate.add(new Toyota("8, 9"));
       locate.add(new GMC(3, 8));

        double[] home = {0, 0};

        String printout = "\n\n" +
               "==========================" + "\nStarting locations...";
		
        for (Location l : locate)
       {
           printout += "\nLocation for " + l.getID() + ": (" + getLocation(l.getLoc()) + ")";
       }

	   
        printout += "\n\n" + "==========================" +
                   "\nDistance from home...";

        for (Location l : locate)
       {
           double z = getDistance(l.getLoc(), home);
		   printout += "\nDistance for " + l.getID() + ": (" + Math.round(z*100.0)/100.0 + ")";
       }
	    printout += "\n\n" + "==========================";
		double x, y;
	   for (Location l : locate)
	   {
		   
		   x = Math.round(((Math.random() * 100) + 1) * 100.0) / 100.0;
		   y = Math.round(((Math.random() * 100) + 1) * 100.0) / 100.0;
		   printout += "\nAfter " + l.getID() + " Moved: (" + x + ", " + y+ ")";
		   l.move(x,y);
		   printout += "\nNew Location: (" + getLocation(l.getLoc()) + ")\n\n";
	   } 
	   printout += "\n\n" + "==========================" +
                   "\nDistance from home...";

        for (Location l : locate)
       {
		   double z = getDistance(l.getLoc(), home);
           printout += "\nDistance for " + l.getID() + ": (" + Math.round(z*100.0)/100.0+ ")";
       }

        System.out.println(printout);
   }

    public static double getDistance(double[] car, double[] home)
   {
       return Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)));
   }

    public static String getLocation(double[] loc)
   {
       return loc[0] + ", " + loc[1];
   }
}