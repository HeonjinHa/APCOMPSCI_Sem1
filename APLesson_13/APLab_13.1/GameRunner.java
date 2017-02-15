public class GameRunner
{
	public static void main(String[]args)
	{
		GameSystem object1 = new Xbox();
		Console object2 = new Playstation();
		GameSystem object3 = new PC();
		
		System.out.println(object1);
		System.out.println(object2);
		System.out.println(object3);
	}
	
}
