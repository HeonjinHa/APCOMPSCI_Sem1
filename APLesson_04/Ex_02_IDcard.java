import java.util.Scanner;

public class Ex_02_IDcard
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your first name:");
		String name1 = kb.nextLine();
		System.out.println("Enter your last name:");
		String name2 = kb.nextLine();
		System.out.println("Enter your title:");
		String title = kb.nextLine();
		System.out.println("Enter the school site:");
		String school = kb.nextLine(); 
		System.out.println("Enter the school year:");
		String number = kb.nextLine();
		System.out.println("What is your subject:");
		String subject = kb.nextLine();

        Ex_02_IDcard form = new Ex_02_IDcard();
		System.out.println("************************************" );
		form.format(school, number);
		form.format(name1,name2);
		form.format(title, subject); 
		System.out.println("************************************" );
		
	}
	
	public void format(String word, String number)
	{
		
	    System.out.printf("* %15s %16s *\n", word, number);
	}
}