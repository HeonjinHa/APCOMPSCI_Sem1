public class Console extends GameSystem 
{
	public Console()
	{
		super();
	}	
	
	public Console (String p) 
	{
		super(p);
	}
	
	public String getController()
	{
		return "";
	}
	
	public String toString() 
	{
		return "Platform: " + this.getplatform()+ 
		"\nSerial #: " + this.getserialNo() + 
		"\nController: " + this.getController();
	}
	
}