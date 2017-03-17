import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Toyota implements Location
{
	private int id;
	private double xpos,ypos;
	public Toyota(String pos)
	{
		ArrayList<String> position = new ArrayList<>(Arrays.asList(pos.split(", ")));
		double x = Double.parseDouble(position.get(0));
		double y = Double.parseDouble(position.get(1));
		move(x,y);
	}
	

	public int getID()
	{
		return (int)(Math.random() * 999999) + 1;
	}
	
	public void move(double x,double y)
	{
		xpos = x;
		ypos = y;
	}
	
	public double[] getLoc()
	{
		double [] location = {xpos,ypos};
		return location;
	}
}