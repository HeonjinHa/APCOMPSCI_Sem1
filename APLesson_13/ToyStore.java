import java.util.*;
public class ToyStore 
{
	ArrayList<Toy> toyList = new ArrayList<>();
	
	public ToyStore()
	{
		toyList = new ArrayList<>();
	}
	public ToyStore(String TT)
	{
		loadToys(TT);
	}
	
	public void loadToys(String ts)
	{
		toyList = new ArrayList<>();
		ArrayList<String> toys = new ArrayList<>(Arrays.asList(ts.split(", ")));
		for(int i = 0; i < toys.size(); i += 2){
			String name = toys.get(i);
			String type = toys.get(i+1);
			Toy object = this.getThatToy(name);
			if(object == null)
			{
				if(type.equalsIgnoreCase("car"))
				{
					toyList.add(new Car(name));
				}
				else if(type.equalsIgnoreCase("af"))
				{
					toyList.add(new Afigure(name));
				}
			}
			
			else 
			{
				object.setCount(object.getCount() + 1);
			}
		}
	}
	
	public Toy getThatToy(String name)
	{
		for(Toy object: toyList)
		{
			 if(object.getName().equalsIgnoreCase(name))
			 {
				 return object;
			 }
		}
		return null;
	}
	
	public String getMostFrequentToy() 
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for(Toy object: toyList) 
		{
			if(max <object.getCount())
			{
				max = object.getCount();  
				name = object.getName();
			}
		}
		return name; 
	}
	
	public String getMostFrequentType()
	{
		int cars = 0; 
		int figures = 0; 
		for(Toy object: toyList)
		{
			if(object.getType().equalsIgnoreCase("car"))
			{
				cars++; 
			}
			if(object.getType().equalsIgnoreCase("af"))
			{
				figures++;
			}
		}	
		if (cars > figures)
		{
			return "Cars";
		}
		else if (figures > cars) 
		{
			return "Action Figures";
		}
		else
		{
			return "Equal amounts of action figures and cars!";
		}
	}
	public String toString()
	{
		return "" + toyList; 
	}
}