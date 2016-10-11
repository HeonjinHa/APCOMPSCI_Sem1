import java.util.Scanner;
public class Ex_02
{
	static double subtotal;
	static double tax;
	static double total;
	static double didc;
	public static void main(String[]args)
	{
		//user input
		
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
		System.out.println("Please enter the item 3:");
		String item3 = kb.nextLine(); 
		System.out.println("Please enter the price:");
		double price3 = kb.nextDouble();
		kb.nextLine();
		System.out.println("Please enter the last item:");
		String item4 = kb.nextLine();
		System.out.println("Please enter the price of last item");
		double price4 = kb.nextDouble();
		kb.nextLine();
		
		subtotal = (price1 + price2 + price3 + price4);
		tax = (price1 + price2 + price3 + price4)* .08;
		didc = 0;
		
		if (discount(subtotal)) {
			didc = subtotal * .15; 
		}
		//receipt print 
		Ex_02 form = new Ex_02 ();
		System.out.println("\t <<<<<<<<<<____RECEIPT____>>>>>>>>>>");
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3); 
		form.format(item4, price4);
		System.out.println("\n");
		form.format("Subtotal:", subtotal);
		if (discount(subtotal)){
			format("Discount", didc);
		} else {
			format ("Discount", 0);
		}
		total = tax + subtotal - didc;
		form.format("Tax:",tax); 
		form.format("Total:", total);
		System.out.println("\n_____________________________________________");
		System.out.println("        * Thank you for your support! *");
	
	}
	
	public static void format(String word, double number) 
	{
		System.out.printf("\n*%15s......  %20.2f", word, number);
	}
	
	public static boolean discount(double subtotal)
	{
		if (subtotal >= 2000){
			return true; 
		} else {
			return false; 
		}
		
	}
}