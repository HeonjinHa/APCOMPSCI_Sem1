import java.util.Scanner;
public class Inventory_Runner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Manufacturer:");
		String ma = kb.nextLine(); 
		System.out.println("Name:");
		String na = kb.nextLine(); 
		System.out.println("Are you willing to enter category and price information? (y or n)");
		String YN = kb.nextLine();

		
		
		if(YN.equalsIgnoreCase("n"))
		{
			Inventory item1 = new Inventory (ma,na);
			item1 = new Inventory(ma,na); 
			System.out.println(item1);	
			
		}
		else if (YN.equalsIgnoreCase("y"))
		{
			
			System.out.println("Category: ");
			String ca = kb.nextLine();
			System.out.println("Price: ");
			double pa = kb.nextDouble();
			Inventory item2 = new Inventory(ma, na, ca, pa);
			System.out.println(item2);
		}
		else 
		{
			System.out.println("wrong input"); 
		}
			
	}	
}