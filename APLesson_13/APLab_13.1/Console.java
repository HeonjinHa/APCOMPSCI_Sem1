public abstract class Console 
{
	public Console()
	{
		super();
	}	
	
	public Console (String p) 
	{
		super(p);
	}
	
	public abstract String getController();
	
	public String toString() 
	{
		return "Platform: " + platform + 
		"\nSerial #: " + serialNo + 
		"\nController: " + controller;
	}
	
}