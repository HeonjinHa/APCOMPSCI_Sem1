import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*; //import for an ArrayList 

//KeyListener for keyevents
//Runnable for threads
public class gameFrametest extends JFrame implements KeyListener,Runnable
{
	int width;
	int height;
	int x,y;
	
	boolean KeyUp = false;
	boolean KeyDown = false;
	boolean KeyLeft = false;
	boolean KeyRight = false;
    boolean KeySpace = false; 
	Thread th;	
	
	Toolkit tk = Toolkit.getDefaultToolkit(); //toolkit for creating an image.
	Image airplane;
	Image missileImage; 
	ArrayList MissList = new ArrayList();
	
	Image buffImage;
	Graphics buffg;
	
	Missile ms; 
	
	gameFrametest()
	{		
		init(); //same as Frame class.
		start(); //same as Frame class.
		setTitle("Shooting Game");
		setSize(width,height);
		
		Dimension screen = tk.getScreenSize(); //Gets the size of the screen.
		//To set the frame on the middle of the screen
		
		int fXPos = (int)screen.getWidth() / 2 - width / 2;
		int fYPos = (int)screen.getHeight() / 2 - height / 2;
		
		setLocation(fXPos,fYPos);
	
		//make users not change the size
		setResizable(false);
		setVisible(true);
		
	}
	
	public void init()
	{ 
		x = 100;
		y = 100;
		width = 800;
		height = 900;
		airplane = tk.getImage("plane.png");
		missileImage = tk.getImage("Miss.png");
	
	}
	
	public void start()
	{
		
		//sets the operation that will happen by default when the user initiates a "close" on this frame.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		addKeyListener(this);
		th = new Thread(this);
		th.start();
	}
	
//What is thread?
//   ->an independent path of execution within a program.
//   ->Main thread processes our program only; CPU can process only one program at a time.
//   ->If we put more threads on our program, we can execute multiple processes simultaneously.
//   ->While mutiple threads would be helpful in executing many processes, but it might cause lags.
	
	public void run()
	{
		try
		{
			while(true)
			{
				KeyProcess();
				MissileProcess(); 
				repaint();
				Thread.sleep(20);
			}
		}
		catch(Exception e)
		{
		}
	}
	
	public void MissileProcess()
	{
		if(KeySpace)
		{
			ms = new Missile(x,y);
			MissList.add(ms);
		}
	}
	
	public void paint(Graphics g)
	{
		buffImage = createImage(width,height);
		buffg = buffImage.getGraphics();
		
		update(g);
	}
	
	public void update(Graphics g)
	{
		DrawChar();
		DrawMissile(); 
		
		g.drawImage(buffImage,0,0,this);
	}
	
	public void DrawChar()
	{
		//Clears the specified rectangle by filling it with 
		//the background color of the current drawing surface.
		buffg.clearRect(0,0,width,height);
		
		//Put the image of an airplane on (100,100).
		buffg.drawImage(airplane,x+187,y+670,this); // this = imageobserver = hard to explain.
	}
	
	public void DrawMissile()
	{
		for(int i=0; i < MissList.size(); i++)
		{
			ms=(Missile)(MissList.get(i));
			
			buffg.drawImage(missileImage,ms.pos.x+ 250, ms.pos.y+650, this);			
			ms.move();
			
			if( ms.pos.x> width)
			{
				MissList.remove(i);
			}
		}
	}
	
	//Actions when the user presses control keys
	public void keyPressed(KeyEvent e)
	{
		//switch statement is similar as if statement, but is used when we have a number of 
		//possible excution paths. It works with multiple data types other than boolean.
		switch(e.getKeyCode())
		//getKeyCode method returns the event's keyCode
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
			case KeyEvent.VK_SPACE:
			KeySpace = true;
			break;
		}
	}

	//Actions after the user presses control keys
	public void keyReleased(KeyEvent e)
	{
		switch(e.getKeyCode())
		{
			case KeyEvent.VK_UP:
			KeyUp = false;
			break;
			case KeyEvent.VK_DOWN:
			KeyDown = false;
			break;
			case KeyEvent.VK_LEFT:
			KeyLeft = false;
			break;
			case KeyEvent.VK_RIGHT:
			KeyRight = false;
			break;
			case KeyEvent.VK_SPACE:
			KeySpace = false; 
			break; 
		}
	}
	
	//Executed when the user types something
	public void keyTyped(KeyEvent e)
	{
	}
	
	//Actually moves the airplane as the user presses a key
	public void KeyProcess()
	{
		if(KeyUp == true) y -=10;
		if(KeyDown == true) y +=10;
		if(KeyLeft == true) x -=10;
		if(KeyRight == true) x +=10;
	}
}



//Resources
//   https://docs.oracle.com/javase/7/docs/api/java/awt/Toolkit.html 
//     -->getDefaultToolkit(), getScreenSize()
//   https://docs.oracle.com/javase/7/docs/api/javax/swing/JFrame.html
//     -->setDefaultCloseOperation)(JFrame.EXIT_ON_CLOSE)
//   https://docs.oracle.com/javase/7/docs/api/java/awt/Graphics.html
//     -->Graphics
//   https://docs.oracle.com/javase/7/docs/api/java/awt/event/KeyEvent.html
//     -->KeyEvent
//   https://docs.oracle.com/javase/tutorial/extra/fullscreen/doublebuf.html
//   https://stackoverflow.com/questions/4430356/java-how-to-do-double-buffering-in-swing
//     -->Doublebuffering 