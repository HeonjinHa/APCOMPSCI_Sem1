import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*; //for an ArrayList 

public class Missile
{
	int x;
	int y;
	
	Missile(int x, int y)
	{
		this.x= x; 
		this.y= y; 
		
	}
	
	public void move() 
	{
		y -=50;
	}
}