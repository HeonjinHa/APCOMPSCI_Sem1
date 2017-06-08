import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.awt.image.*;
public class Enemy
{
	int x;
	int y; 
	int speed; 
	
	Enemy(int x, int y, int speed) 
	{
		this.x = x; 
		this.y = y;
		this.speed = speed;
	}
	public void move()
	{
		y+=speed;
	}
}