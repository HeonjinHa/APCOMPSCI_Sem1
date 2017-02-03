//inheritence class, super class money 
public class Coin extends /* // money(Super class) is extended to subclass */ Money 
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