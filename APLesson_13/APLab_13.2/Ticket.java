import java.util.*;
public abstract class Ticket
{
	int serialNo;
	
	public Ticket()
	{
		serialNo = (int)(Math.random()*9999999+1);
	}
	
	public abstract int getPrice();
	
	public int getSerialNo()
	{
		return (int)(Math.random()*9999999+1);
	}
	
	public String toString()
	{
		return "Serial #: "+this.getSerialNo()+
						"\nPrice: " + this.getPrice();
					
	}
}