import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*; //for an ArrayList 

public class Missile
{
	Point pos; 
	
	Missile(int x, int y)
	{
		pos = new Point(x,y);
		
	}
	
	public void move() 
	{
		pos.y -=50;
	}
}