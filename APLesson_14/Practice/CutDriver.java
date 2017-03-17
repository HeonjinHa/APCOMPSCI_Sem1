import java.util.ArrayList; 
public class CutDriver 
{
	public static void main(String[]args)
	{
		ArrayList<Cutshapes> cuts = new ArrayList<>(); 
		cuts.add(new Rectangle(10,12)); 
		cuts.add(new Circle(5));
		
		 
		
		for(CutShapes sh : cuts) 
			System.out.println(sh.getArea());
	}
}