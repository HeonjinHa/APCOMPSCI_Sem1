public class GameRunner
{
	public static void main(String[]args)
	{
		GameSystem object1 = new Xbox("Some_xbox");
		Console object2 = new Playstation("Playthestation");
		GameSystem object3 = new PC("WindowPC");
		
		System.out.println(object1);
		System.out.println(object2);
		System.out.println(object3);
	}
	
}
