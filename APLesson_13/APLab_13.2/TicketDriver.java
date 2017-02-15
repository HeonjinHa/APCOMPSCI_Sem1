public class TicketDriver
{
	public static void main(String[]args)
	{
		Ticket walk = new Walkup();
		System.out.println(walk);
		Ticket adv = new Advance();
		System.out.println(adv);
		Advance sadv = new StudentAdvance();
		System.out.println(sadv);
	}
}