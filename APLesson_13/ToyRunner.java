public class ToyRunner
{
	public static void main (String[]args)
	{
		String toy = "Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF";
		ToyStore dankmeme = new ToyStore(toy);
		System.out.println(dankmeme);
		System.out.println(dankmeme.getMostFrequentToy());
		System.out.println(dankmeme.getMostFrequentType()); 
	}
}