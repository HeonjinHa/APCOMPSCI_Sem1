import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import javax.imageio.*;
import java.awt.image.*;  
public class Enemy
{
	int x;
	int y; 
	
	Enemy(int x, int y) 
	{
		this.x = x; 
		this.y = y;
		
	}
	public void move()
	{
		y+=3;
	}
}