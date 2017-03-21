import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class GMC extends Car
{
	private double xpos,ypos;
	public GMC()
	{
		super();
		xpos = 0;
		ypos = 0;
		
	}
	
	public GMC(double x, double y)
	{
		super();
		xpos = x;
		ypos = y;
	}
	
		
	public int getID()
	{
		return ID;
	}
	
	public void move(double x,double y)
	{
		xpos += x;
		ypos += y;
	}
	
	public double[] getLoc()
	{
		double location[]=new double[2];
		location[0] = xpos;
		location[1] = ypos;
		return location;
	}
}