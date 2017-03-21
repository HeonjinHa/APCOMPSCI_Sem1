import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Toyota extends Car
{
	private int id;
	private double xpos,ypos;
	public Toyota(String pos)
	{
		super();
		ArrayList<String> position = new ArrayList<>(Arrays.asList(pos.split(", ")));
		double x = Double.parseDouble(position.get(0));
		double y = Double.parseDouble(position.get(1));
		move(x,y);
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
		double [] location = {xpos,ypos};
		return location;
	}
}