import java.util.Scanner;
public class Ex_01_GPA_Calculator 
{
	public static void main(String[]args)
	{
		
        Scanner kb = new Scanner(System.in);
		System.out.println("Enter your letter grade of Math class");
        String S1 = kb.next();
		System.out.println("Enter your letter grade of Science class");
        String S2 = kb.next();
		System.out.println("Enter your letter grade of History class");
        String S3 = kb.next();
		System.out.println("Enter your letter grade of Language class");
        String S4 = kb.next();
		System.out.println("Enter your letter grade of Computer Science class");
        String S5 = kb.next();
		System.out.println("Enter your letter grade of Electives");
        String S6 = kb.next();
		System.out.println("Enter your letter grade of English class");
        String S7 = kb.next();
		
		double GPA = (calcPoint(S1) + calcPoint(S2) + calcPoint(S3) + calcPoint(S4) + calcPoint(S5) + calcPoint(S6) + calcPoint(S7))/ 7; 
		System.out.println("Your GPA is... " + GPA);
		
	}
	public static double calcPoint(String grade)
	{
		if (grade.equals("a"))
			{return 4.0 ;}
		if (grade.equals("b"))
			{return 3.0 ;}
		if (grade.equals("c"))
			{return 2.0 ;}
		if (grade.equals("d"))
			{return 1.0 ;}
		if (grade.equals("f"))
			{return 0.0 ;}
		else
			return 0;
	}
	
}
