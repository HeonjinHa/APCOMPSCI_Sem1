public class Coin 
{
	private String name; 
	private double weight, value; 
	
	public Coin() 
	{
		name = "";
		weight = value = 0; 
	}
	
	public Coin (String n, double w, double v) 
	{
		name = n; 
		weight = w; 
		value  = v; 
	}
	
	public String toString() 
	{
		return "Weight: " + weight + "g\n" + 
				"Your " + name + "is worth $" + value + ".\n"; 
	}
}