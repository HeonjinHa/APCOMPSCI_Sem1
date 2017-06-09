import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*; //import for an ArrayList 
import java.awt.image.*; 

//KeyListener for keyevents
//Runnable for threads
public class gameFrametest extends JFrame implements KeyListener,Runnable
{
	int width;
	int height;
	int bx = 0; 
	int x,y;
	int Status = 0; 
	int fireSpeed;
	
	boolean KeyUp = false;
	boolean KeyDown = false;
	boolean KeyLeft = false;
	boolean KeyRight = false;
    boolean KeySpace = false; 
	
	int cnt; 
	Thread th;	
	
	
	Toolkit tk = Toolkit.getDefaultToolkit(); //toolkit for creating an image.
	
	Image[] airplane;
	Image missileImage; 
	Image xplane;
	Image background;
	
	ArrayList MissList = new ArrayList();
	ArrayList EnemyList = new ArrayList(); 
	
	Image buffImage;
	Graphics buffg;
	
	Missile ms; 
	Enemy en;
	
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
	
		width = 800;
		height = 900;
		fireSpeed = 20; 
		missileImage = tk.getImage("Miss.png");
		xplane = tk.getImage("enemy.png");
		
		background = new 
		ImageIcon("Map.png").getImage(); 
		
		airplane = new Image[4];
		for(int i =0; i<airplane.length; i++)
		{
			airplane[i] = new ImageIcon("plane"+i+".png").getImage();
		}

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
				EnemyProcess();
				MissileProcess(); 
				repaint();
				Thread.sleep(20);
				cnt++;
			}
		}
		catch(Exception e)
		{
		}
	}
	
	public void EnemyProcess()
	{

		for(int i =0; i <EnemyList.size(); i++)
		{
			en = (Enemy)(EnemyList.get(i));
			en.move(); 
			if(en.y < -200)
			{
				EnemyList.remove(i);
			}
			if(Crash(x,y,en.x,en.y,airplane[1],xplane))
			{
			 EnemyList.remove(i);
			}
		}
		if( cnt % 200==0)
		{
			en = new Enemy(width -150, -30);
			EnemyList.add(en);
			en = new Enemy(width -300, -50);
			EnemyList.add(en);
			en = new Enemy(width-450, -30);
			EnemyList.add(en);
			en = new Enemy(width-600, -50);
			EnemyList.add(en);
			en = new Enemy(width -750, -30);
			EnemyList.add(en);
		}
		
	}
	public boolean Crash(int x1, int y1, int x2, int y2, Image img1, Image img2)
	{
		boolean check = false; 
		if( Math.abs( ( x1 + img1.getWidth(null) / 3)  
		- ( x2 + img2.getWidth(null) / 3 ))  
		< ( img2.getWidth(null) / 3 + img1.getWidth(null) / 3 )
		&& Math.abs( ( y1 + img1.getHeight(null) / 3 )  
		- ( y2 + img2.getHeight(null) / 3 ))  
		< ( img2.getHeight(null)/3 + img1.getHeight(null)/3 ) )
		{
			check = true; 
		}
		else 
		{
			check = false;
		}
		return check; 
	}
	
	public boolean Crash2(int x1, int y1, int x2, int y2, Image img1, Image img2)
	{
		boolean check = false; 
		if( Math.abs( ( x1 + img1.getWidth(null)+35)  
		- ( x2 + img2.getWidth(null)+35))  
		< ( img2.getWidth(null)+35  + img1.getWidth(null)+35 )
		&& Math.abs( ( y1 + img1.getHeight(null)/2 )  
		- ( y2 + img2.getHeight(null)/2 ))  
		< ( img2.getHeight(null)/2+ img1.getHeight(null)/2 ) )
		{
			check = true; 
		}
		else 
		{
			check = false;
		}
		return check; 
	}
	
	public void MissileProcess()
	{
		if(KeySpace)
		{
			if((cnt % fireSpeed) == 1)
			{
				ms = new Missile(x, y);
				MissList.add(ms);
			}
			//ms = new Missile(x,y);
			//MissList.add(ms);
		}
		for (int i=0; i<MissList.size(); i++)
		{
			ms = (Missile)MissList.get(i);
			ms.move(); 
			if(ms.y > height -20)
			{
				MissList.remove(i); 
			}
			
			for (int j=0; j<EnemyList.size(); j++)
			{
				en =(Enemy)EnemyList.get(j); 
				
				if(Crash2(ms.x, ms.y, en.x, en.y,missileImage,xplane))
				{
					MissList.remove(i); 
					EnemyList.remove(j);
				}
			}
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
		DrawBackground();
		DrawEnemy();
		DrawMissile(); 
		DrawPlayer();
		DrawStatus();
		g.drawImage(buffImage,0,0,this);
	}
	
	public void DrawBackground()//method that draws the background
	{
		//Clears the specified rectangle by filling it with 
		buffg.clearRect(0,0,width,height);
		if (bx>=-1)
		{
			buffg.drawImage(background,0,bx-5800,this);
			bx +=1;	
			
		}
		else 
		{
			bx=0;
		}
		//buffg.drawImage(airplane,x+187,y+670,this); // this = imageobserver = hard to explain.
	}
	
	public void DrawMissile()
	{
		for(int i=0; i < MissList.size(); i++)
		{
			ms=(Missile)(MissList.get(i));
			
			buffg.drawImage(missileImage,ms.x+62, ms.y-20, this);			
			ms.move();
			
			if(ms.x> width)
			{
				MissList.remove(i);
			}
		}
	}
	public void DrawEnemy()
	{
		for( int i=0; i< EnemyList.size(); ++i)
		{
			en = (Enemy)(EnemyList.get(i));
			buffg.drawImage(xplane, en.x, en.y, this);
		}
	}
	
	public void DrawPlayer()
	{
		switch(Status)
		{
			case 0: 
			if((cnt/4 %2)==0)
			{
				buffg.drawImage(airplane[1],x,y,this);
			}
			else
			{
				buffg.drawImage(airplane[2],x,y,this);
			}
			break;
		}
	}
	
	public void DrawStatus() 
	{
		buffg.setFont(new Font("Default", Font.BOLD, 15));
		buffg.drawString("Missile shot: " + MissList.size(),600,640);
		buffg.drawString("Enemy missed: " + EnemyList.size(),600,660);
		
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