import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Ex_02_ExpressionSolver
{
	static ArrayList <String> equation;
	
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in); 
		System.out.println("Eqaution: ");
		String Equation = kb.nextLine();
		
		equation = new ArrayList<>(Arrays.asList (Equation.split(" ")));
		System.out.println(doEquation(equation));
	
	}
	
	public static ArrayList<String> doEquation(ArrayList<String> equation)
	{
		int i =0;
		while(i < equation.size())
		{
			if ( equation.get (i). equals ("*") ||equation.get(i).equals ("/"))
			{
				if(equation.get(i). equals("*"))
				{
					equation.set(i, " " + (Integer.parseInt(equation.get(i-1))) * (Integer.parseInt(equation.get(i+1))));
				}
				else
				{
					equation.set(i, " " + (Integer.parseInt(equation.get(i-1))) / (Integer.parseInt(equation.get(i+1))));
				}
				equation.remove(i-1);
				equation.remove(i);
			}
			else
			{
				i++;	
			}
			
		}
		i = 0;
		while(i < equation.size())
		{
			if(equation.get(i).equals("+") || equation.get(i).equals("-"))
			{
				if(equation.get(i).equals("+"))
				{
					equation.set(i, " " + (Integer.parseInt(equation.get(i - 1)) + Integer.parseInt(equation.get(i + 1))));
				}
				else
				{
					equation.set(i, " " + (Integer.parseInt(equation.get(i - 1)) - Integer.parseInt(equation.get(i + 1))));
				}
				equation.remove(i-1);
				equation.remove(i);
			}
			else
			{
				i++;	
			}
			
		}
		return equation;
	}
}