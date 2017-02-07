//inheritence class, super class money 
public class Money 
{
	private String name; 
	private double value; 
	
	//default constructor 
	public Money ()
	{
		this.name = ""; 
		this.value = 0; 
	}
	
	public Money (String n, double v) 
	{
		this.name = n; 
		this.value = v;
	}
	
	public String toString()
	{
		return "Your " + name + "is worth $" + value + ".\n" ; 
	}
	
}