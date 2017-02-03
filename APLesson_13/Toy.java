public class Toy 
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
		name = N; 
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
		name = N;
	}
	public void setCount(int C)
	{
		count = C;
	}
	
	public abstract getType()
	
	
	public String toString()
	{
		return name + count;
	}
	
}