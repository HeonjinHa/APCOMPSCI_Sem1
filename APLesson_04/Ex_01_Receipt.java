import java.util.Scanner;

public class Ex_01_Receipt
{
	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter item 1:");
        String item1 = kb.nextLine();
		System.out.println("Please enter the price:");
		double price1 = kb.nextDouble();
		kb.nextLine();
		System.out.println("Please enter the item 2:");
		String item2 = kb.nextLine();		
		System.out.println("Please enter the price:");
		double price2 = kb.nextDouble();
		kb.nextLine();
		System.out.println("Please enter the item 3");
		String item3 = kb.nextLine(); 
		System.out.println("Please enter the price:");
		double price3 = kb.nextDouble();
		kb.nextLine();

		double subtotal_amount = price1 + price2 + price3;
		double tax = (price1 + price2 + price3 )* .075;
		double total = tax + subtotal_amount; 
		Ex_01_Receipt form = new Ex_01_Receipt();
		System.out.println("\t <<<<<<<<<<____RECEIPT____>>>>>>>>>>");
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3); 
		System.out.println("\n");
		form.format("Subtotal:", subtotal_amount);
		form.format("Tax:",tax); 
		form.format("Total:", total);
		System.out.println("\n_____________________________________________");
		System.out.println("        * Thank you for your support! *");
		
	}
	
	public void format(String word, double number) 
	{
		System.out.printf("\n*%15s......  %20.2f", word, number);
	}
}