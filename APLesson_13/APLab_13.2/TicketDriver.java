public class TicketDriver
{
	public static void main(String[]args)
	{
		Ticket walk = new Walkup();
		System.out.println(walk);
		Ticket adv = new Advance(20);
		System.out.println(adv);
		Advance sadv = new StudentAdvance(15);
		System.out.println(sadv);
	}
}