/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card c1 = new Card("Diamond", "9", 9);
        Card c2 = new Card("Diamond", "6", 6);
        Card c3 = new Card("Diamond", "Jack", 4);

        System.out.println(c1.toString());
        System.out.println(c2.matches(c2));
        System.out.println(c3.matches(c3));
    }
}
