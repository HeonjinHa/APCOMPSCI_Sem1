import java.util.Random;
public class Inventory
{
	private String manufacturer,name,category;
	private int UPC;
	private double price;
	
	public Inventory()
	{
		manufacturer = "";
		name = "";
		category = "";
		price = 0.00;
		UPC = (int)(Math.random() * 1000000000 + 1);
	}
	
	public Inventory(String m, String n)
	{
		manufacturer = m;
		name = n;
		category = ""; 
		price = 0.00; 
		UPC = (int)(Math.random() * 1000000000 + 1);
	}
	
	public Inventory(String m, String n, String c, double p)
	{
		manufacturer = m;
		name = n;
		category = c;
		price = p;
		UPC = (int)(Math.random() * 1000000000 + 1);
	}
	
	public String toString()
	{
		return "Item Info...\nName: " + name + "\nManufacturer: " + manufacturer + "\nCategory: " + category +"\nPrice: $" + price + "\nUPC:" + UPC;
	}
}