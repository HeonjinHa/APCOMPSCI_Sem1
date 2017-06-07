import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.awt.image.*;

//KeyListener for keyevents
//Runnable for threads
public class gameFrame extends JFrame implements KeyListener,Runnable
{
	int width;
	int height;
	
	int x,y;
	
	int[]cx ={0,0,0}; 
	int bx =0; 
	
	boolean KeyUp = false;
	boolean KeyDown = false;
	boolean KeyLeft = false;
	boolean KeyRight = false;
    boolean KeySpace = false; 
	
	int cnt;
	
	int playerSpeed
	int missileSpeed 
	int fireSpeed
	int enemySpeed
	int playerStatus = 0;
	int gameScore;
	int playerHitpoint;
	
	
	Thread th;	
	
	Toolkit tk = Toolkit.getDefaultToolkit(); //toolkit for creating an image.
	
	Image[] background; //animation
	Image[] explosion; //animation
	
	Image airplane;
	Image missileImage; 
	Image xplane;
	
	ArrayList MissList = new ArrayList();
	ArrayList EnemyList = new ArrayList(); 
	ArrayList ExplosionList = new ArrayList();
	
	Image buffImage;
	Graphics buffg;
	
	Missile ms; 
	Enemy en;
	Explosion ex; 
	
	gameFrame()
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
		xplane = tk.getImage("enemy.png");
		
		background = new ImageIcon("Map.png").getImage();
		
		explosion = new Image[4];
		for(int i = 0; i<explosion.length;i++)
		{
			explosion[i] = new ImageIcon("explosion" + i + ".png").getImage();
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
				ExplosionProcess();
				repaint();
				Thread.sleep(20);
				cnt++; 
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
			playerStatus =1; 
			if((cnt%fireSpeed) ==0)
			{
				ms = new Missile(x+187, y+670,missileSpeed);
				MissList.add(ms);
			}
			//ms = new Missile(x,y);
			//MissList.add(ms);
		}
		
		for (int i=0; i< MissList.size();i++)
		{
			ms = (Missile) MissList.get(i);
			ms.move();
			if( ms.x > width -20)
			{
				MissList.remove(i);
			}
			
			for (int j=0; j<EnemyList.size();++j)
			{
				en =(Enemy)EnemyList.get(j);
				if(Crash(ms.x, ms.y, en.x, en.y, missileImage, xplane))
				{
					MissList.remove(i);
					EnemyList.remove(i);
					
					gameScore += 10;
					ex = new Explosion(en.x + xplane.getWidth(null)/2,
					en.y + xplane.getHeight(null)/2, 0);
					ExplosionList.add(ex); 
				}
			}
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
			
			if(Crash(x,y,en.x,en.y,airplane,xplane))
			{
			playerHitpoint--; 
			EnemyList.remove(i);
			gameScore +=10; 
			
			ex = new Explosion(en.x+xplane.getWidth(null)/2,
			en.y+ xplane.getHeight(null)/2,0);
			
			ExplosionList.add(ex);
			ex= new Explosion(x,y,1);
			
			ExplosionList.add(ex);	
			}
		}	
		if( cnt % 350==0) // for every loop counte 300, creates enemy at the given (x,y);
		{
			en = new Enemy(width -150, -150);
			EnemyList.add(en);
			en = new Enemy(width -300, -120);
			EnemyList.add(en);
			en = new Enemy(width-450, -150);
			EnemyList.add(en);
			en = new Enemy(width-600, -120);
			EnemyList.add(en);
			en = new Enemy(width -750, -150);
			EnemyList.add(en);
		}
		
	}
	public void ExplosionProcess()
	{
		for(int i=0; i<ExplosionList.size(); i++)
		{
			ex = (Explosion)ExplosionList.get(i);
			ex.effect(); 
			
		}
	}
	
	public boolean Crash(int x1, int y1, int x2, int y2, Image img1, Image img2)
	{
		boolean check = false; 
		if(Math.abs((x1+img1.getWidth(null)/2)-(x2+ img2.getWidth(null)/2))
			<(img2.getWidth(null)/2 + img1.getWidth(null)/2) &&
		Math.abs((y1 + img1.getHeight(null)/2) - (y2+ img2.getHeight(null)/2))
			<(img2.getHeight(null)/2 + img1.getHeight(null)/2))
		{
			check = true; 
		}
		else
		{
			check = false;
		}
		return check 
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
		DrawChar();
		DrawEnemy();
		DrawMissile(); 
		DrawExplosion();
		DrawStatus(); 
		
		g.drawImage(buffImage,0,0,this);
	}
	
	public void DrawBackground() // replaces DrawChar methods 
	{
		buffg.clearRect(0,0,width,height);
		if( bx > -3500)
		{
			buffg.drawImage(background,bx,0,this); 
			bx -=1; 
		}
		else
		{
			bx=0; 
		}

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
	
	public void DrawEnemy()
	{
		for( int i=0; i< EnemyList.size(); ++i)
		{
			en = (Enemy)(EnemyList.get(i));
			buffg.drawImage(xplane, en.x, en.y, this);
		}
	}
	
	public void DrawExplosion()
	{
		for(int i=0; i<ExplosionList.size(); i++)
		{
			ex = (Explosion)ExplosionList.get(i);
			if(ex.damage ==0)
			{
				
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