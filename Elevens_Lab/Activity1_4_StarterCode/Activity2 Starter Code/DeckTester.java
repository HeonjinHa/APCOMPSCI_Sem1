/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	 public static void main(String[] args) 
	 {
        String[] ranks = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] suits = {"Hearts","Clubs","Diamonds","Spades"};
		int[] value = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		Deck object = new Deck(ranks, suits, value);
		System.out.println(object);
    }
}
