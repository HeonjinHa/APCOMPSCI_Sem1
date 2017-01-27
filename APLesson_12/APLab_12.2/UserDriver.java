import java.util.*;
public class UserDriver
{ 
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter first name:");
		String f = kb.nextLine();
		System.out.println("Enter last name:");
		String l = kb.nextLine();
		System.out.println("Public avatar? (y or n)");
		String YN = kb.nextLine();
		
		User user1 = new User(f,l);
		
		if (YN.equalsIgnoreCase("n"))
		{
			user1 = new User(f,l);
		}
		
		else if (YN.equalsIgnoreCase("y"))
		{
			System.out.println("Enter name of avatar?");
			String avt = kb.nextLine();
			user1 = new User(f,l,avt);
		}
		else 
		
		{ 
			user1 = new User();
		}
		System.out.println(user1);
	}
} 