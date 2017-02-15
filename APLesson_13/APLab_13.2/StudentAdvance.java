public class StudentAdvance extends Advance
{	
	public StudentAdvance(int p)
	{
		super(p);
	}
	
	public int getPrice()
	{
		return (super.getPrice()/2);
	}	
	
	public String toString()
	{
		return super.toString()+ "\n <STUDENT ID REQUIRED> ";
	}
}