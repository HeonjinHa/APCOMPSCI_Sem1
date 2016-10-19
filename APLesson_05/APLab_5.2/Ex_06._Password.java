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
	
	PassCheck(); 
	}
	public static void passCheck();
	{
	if(U.equals("Mikey")) && (P.equals("1234"))
	{
	System.out.println("You are right! You are granted access!"); 
	}
	else if (U.equals("Mikey") || (U.equals("1234") 
	{
		 if (U.equals("Mikey") 
			 System.out.println(Your)

	}
	else 
		System.out.println("Both your username and password is incorrect");
	
	}