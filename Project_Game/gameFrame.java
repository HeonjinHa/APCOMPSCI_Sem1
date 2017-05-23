import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class gameFrame extends JFrame implements Keylistener, Runnable 
{
	Toolkit tk = Toolkit.getDefaultToolkit(); //toolkit for creating an image.
	Image airplane = tk.getImage("plane.png"); //get an image of airplain.
	int f_width = 795;
	int f_height = 1042;
	int x,y; 
	boolean Keyup = false;
	boolean KeyDown = false;
	boolean KeyLeft = false;
	boolean KeyRight = false;
	Thread th; 
	Toolkit tk = Toolkit.getDefaultToolkit(); Image airplane =tk.getImage("plane.png");
	gameFrame()
	{	
		init(); //same as Frame class.
		start(); //same as Frame class.
		setTitle("Shooting Game");
		setSize(f_width,f_height);
		Dimension screen = tk.getScreenSize(); //Gets the size of the screen.
		//To set the frame on the middle of the screen
		
		int fXPos = (int)screen.getWidth() / 2 - f_width / 2;
		int fYPos = (int)screen.getHeight() / 2 - f_height/ 2;
		
		setLocation(fXPos,fYPos);

		//make users not change the size
		setResizable(false);
		setVisible(true);
	}
	
	public void init()
	{	
	   x=100;
	   y=100;
	}
	
	public void start()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addKeyListerner(this); 
		th = new Thread(this); 
		th.start();
		
	}
	
	public void run()
	{
		try
		{
			while(true)
			{
				KeyProcess();
				repaint();
				Thread.sleep(20); 
				
			}
		}catch (Exception e){}
	}
	
	public void paint(Graphics g)
	{
		//Clears the specified rectangle by filling it with 
		//the background color of the current drawing surface.
		g.clearRect(0,0,f_width,f_height);
		
		//Put the image of an airplane on (100,100).
		g.drawImage(airplane,x,y,this); // this = imageobserver = hard to explain.
	}

	public void keyPressed(KeyEvent e)
	{
		switch(e.getKeyCode())
		{
			case KeyEvent.VK_UP:
			KeyUp = true;
			break; 
			case KeyEvent.VK_DOWN:
			KeyDown = true; 
			break; 
			case KeyEvent.VK_LEFT:
			KeyLeft = true;
			break; 
			case KeyEvent.VK_RIGHT:
			KeyRight = true; 
			break;
		}
	}
	public void keyTyped(KeyEvent e){}
	public void KeyProcess()
	{
		if(KeyUp == true) y -=5; 
		if(KeyDown == true) y +=5; 
		if(KeyLeft == true) x -=5;
		if(KeyRight == true) x +=5;
	}
}

//Resources
//   https://docs.oracle.com/javase/7/docs/api/java/awt/Toolkit.html 
//     -->getDefaultToolkit(), getScreenSize()
//   https://docs.oracle.com/javase/7/docs/api/javax/swing/JFrame.html
//     -->setDefaultCloseOperation)(JFrame.EXIT_ON_CLOSE)
//   https://docs.oracle.com/javase/7/docs/api/java/awt/Graphics.html
//     -->Graphics