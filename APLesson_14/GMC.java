public class GMC implements Location
{
	private double xx,yy;
	public GMC()
	{
		xx = 0;
		yy = 0;
		
	}
	
	public GMC(double x, double y)
	{
		xx = x;
		yy = y;
	}
	
		
	public int getID()
	{
		return (int)(Math.random() * 999999) + 1;
	}
	
	public void move(double x,double y)
	{
		xx = x;
		yy = y;
	}
	
	public double[] getLoc()
	{
		double location[]= new double[2];
		location[0] = xx;
		location[1] = yy;
		return location;
	}
}