import java.util.Arraylist;
public class ToyStore 
{
	private ArrayList<Toy> toyList = new ArrayList<>();
	
	public ToyStore()
	{
		loadToys()
	}
	public ToyStore(String TT)
	{
		loadToys(TT);
	}
	
	public String loadToys(String ts)
	{
		ArrayList<Toy> toys = new ArrayList<Toy>(); 
		toys = ts.split(", ")
		for(int i = 0; i < toys.size; i++)
		String name = toys[i];
		String type = toys[i+1];
		Toy object = getThatToy(name);
		if(object = null)
		{
			
		}
		else 
		{
			
		}
	}
	
	public String getThatToy(Strubg nm)
	{
		for(Toy object : toyList)
		{
			 if(object.eqauls)
			 {
				 return object
			 }
			 else
			 {
				 return null; 
			 }
		}
			
	}
	public String getMostFrequentToy() 
	public String getMostFrequentType()
	
	
}