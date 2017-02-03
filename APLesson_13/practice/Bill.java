public class Bill extends Money
{
	//private String name; 
	private String face; 
	//private double value; 
	
	public Bill() 
	{
		super();
		face = ""; 
		//name = ""; 
		//value = 0;
	}
	
	public Bill(String n, String f, double v) 
	{  
		super(n,v);
		//name = n; 
		face = f;
		//value = v; 
	}
	
	public String toString() 
	{
		return  "Face:" + face + "\n" + 
				super.toString(); 
	}
}