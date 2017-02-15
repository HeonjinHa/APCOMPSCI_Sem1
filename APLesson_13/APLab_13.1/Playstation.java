public class Playstation extends Console
{	
	public Playstation()
	{
		super();
	}
	
	public Playstation(String p)
	{
		super(p);
	}
	
	public String getController()
	{
		return "PS Dualshock 3";
	}
	
	public String getPlatform()
	{
		return "Playstation";
	}
}