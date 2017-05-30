public class Missile
{
	Point pos; 
	
	Missile(int x, int y)
	{
		pos = new Point(x,y);
		move(int x,int y);
	}
	
	public void move() 
	{
		pos.x +=10;
	}
}