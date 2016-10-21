import java.util.Scanner;
public class Ex_06_Password
{
	static String U;
	static String P;
	
	public static void main(String[]args)
	{
	Scanner kb = new Scanner(System.in);
	System.out.println("What is your username?");
	U = kb.next();
	System.out.println("What is your password?");
	P = kb.next(); 
	
	passCheck(); 
	
	}
	
	
	
	public static void passCheck()
	{
		if(U.equals("Mikey") && P.equals("haha"))
		{
		System.out.println("You are right! You are granted access!"); 
		}
		else if (!U.equals("Mikey") && U.equals("haha"))
		{
		System.out.println("Your password is right but Your username is incorrect!");
		}	
		else if (!U.equals("haha") && U.equals("Mikey"))
		{
		System.out.println("Your username is right but Your password is incorrect!");
		}
		else
		{	
		System.out.println("Both your username and password is incorrect");	
		}
	}
}
