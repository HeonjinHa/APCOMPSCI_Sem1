public abstract class Toy 
{
	private String name; 
	private int count;
	
	public Toy()
	{
		name = ""; 
		count = 1;
	}	
	
	public Toy (String N) 
	{
		this.name = N; 
		count = 1; 
	}
	
	public String getName() 
	{
		return name;
	}
	public int getCount() 
	{
		return count; 
	}
	
	public void setName(String N) 
	{
		this.name = N;
	}
	public void setCount(int C)
	{
		this.	count = C;
	}
	
	public abstract String getType();
	
	
	public String toString()
	{
		return name + count;
	}
}