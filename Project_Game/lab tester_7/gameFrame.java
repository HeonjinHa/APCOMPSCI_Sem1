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
	
	int[] cx= {0,0,0};
	int bx = 0; 
	
	boolean KeyUp = false;
	boolean KeyDown = false;
	boolean KeyLeft = false;
	boolean KeyRight = false;
    boolean KeySpace = false; 
	
	int cnt;
	
	int playerSpeed;
	int missileSpeed;
	int fireSpeed;
	int enemySpeed;
	int Status = 0; 
	int gameScore; 
	int Hitpoint;
	
	
	Thread th;	
	
	Toolkit tk = Toolkit.getDefaultToolkit(); //toolkit for creating an image.
	
	Image[] airplane;
	Image background;
	Image[] explo; 
	
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
		missileImage = tk.getImage("Miss.png");
		xplane = tk.getImage("enemy.png");
	
		airplane = new Image[4];
		for(int i =0; i<airplane.length; i++)
		{
			airplane[i] = new ImageIcon("plane"+i+".png").getImage();
		}
		
		background = new 
		ImageIcon("Map.png").getImage(); 
		
		explo = new Image[3]; 
		for(int i = 0; i<explo.length;i++)
		{
			explo[i] = new ImageIcon("explosion"+i+".png").getImage();
		}
		gameScore =0;
		Hitpoint = 3; 
		playerSpeed =5; 
	    missileSpeed =11;
		fireSpeed = 15; 
		enemySpeed = 7; 
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
			Status = 1; //if player shoots missle, change to status 1 
			if((cnt% fireSpeed) ==0)
			{
				ms = new Missile(x+150, y+30,missileSpeed);
				MissList.add(ms);
			}
		}
		
		for (int i=0; i<MissList.size(); i++)
		{
			ms = (Missile)MissList.get(i);
			ms.move(); 
			if(ms.y > height -20)
			{
				MissList.remove(i); 
			}
			for (int j=0; j<EnemyList.size(); i++)
			{
				en =(Enemy)EnemyList.get(j); 
				
				if(Crash(ms.x, ms.y, en.x, en.y,missileImage,xplane))
				{
					MissList.remove(i); 
					EnemyList.remove(j);
					
					gameScore +=10; 
					ex = new Explosion(en.x + xplane.getWidth(null)/2, 
									   en.y + xplane.getHeight(null)/2,0);
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
			if(Crash(x,y,en.x,en.y,airplane[0],xplane))
			{
			Hitpoint --; 
			EnemyList.remove(i);
			gameScore += 10; 
			
			ex = new Explosion(en.x + xplane.getWidth(null)/2, en.y + xplane.getHeight(null)/2,0);
			ExplosionList.add(ex);
			
			ex = new Explosion(x,y,1);
			ExplosionList.add(ex);
			}
		}
		if( cnt % 250==0) // for every loop counte 300, creates enemy at the given (x,y);
		{
			en = new Enemy(width -150, -150, enemySpeed);
			EnemyList.add(en);
			en = new Enemy(width -300, -120, enemySpeed);
			EnemyList.add(en);
			en = new Enemy(width-450, -150, enemySpeed);
			EnemyList.add(en);
			en = new Enemy(width-600, -120, enemySpeed);
			EnemyList.add(en);
			en = new Enemy(width -750, -150, enemySpeed);
			EnemyList.add(en);
		}
	}
	
	public void ExplosionProcess()
	{
		for(int i=0; i<ExplosionList.size();i++)
		{
			ex = (Explosion)ExplosionList.get(i); 
			ex.effect();
		}
	}
	
	public boolean Crash(int x1, int y1, int x2, int y2, Image img1, Image img2)
	{
		boolean check = false; 
		if( Math.abs( ( x1 + img1.getWidth(null) / 2 )  
		- ( x2 + img2.getWidth(null) / 2 ))  
		< ( img2.getWidth(null) / 2 + img1.getWidth(null) / 2 )
		&& Math.abs( ( y1 + img1.getHeight(null) / 2 )  
		- ( y2 + img2.getHeight(null) / 2 ))  
		< ( img2.getHeight(null)/2 + img1.getHeight(null)/2 ) )
		{
			check = true; 
		}
		else 
		{
			check = false;
		}
		return check; 
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
		DrawPlayer();
		//DrawChar(); <- replace with DrawBackground();
		DrawEnemy();
		DrawMissile();
		DrawExplosion();
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
			
			case 1: 
			if((cnt/4%2 )==0)
			{
				buffg.drawImage(airplane[3],x,y,this);
			}
			else
			{
				buffg.drawImage(airplane[4],x,y,this);
			}
			Status = 0;
			break; 
			
			case 2: //collapse
			break; 
		}
	}
	
	public void DrawMissile()
	{
		for(int i=0; i < MissList.size(); i++)
		{
			ms=(Missile)(MissList.get(i));	////////////////
			ms.move();
			
			if( ms.x> width)
			{
				MissList.remove(i);
			}
		}
	}
	
	public void DrawEnemy()
	{
		for( int i=0; i< EnemyList.size(); i++)
		{
			en = (Enemy)(EnemyList.get(i));
			buffg.drawImage(xplane, en.x, en.y, this);
		}
	}
	
	public void DrawExplosion()
	{
		for(int i = 0; i<ExplosionList.size(); i++)
		{
			ex = (Explosion)ExplosionList.get(i);
			if (ex.damage == 0)
			{
				if ( ex.ex_cnt < 7  ) 
				{
					buffg.drawImage( explo[0], ex.x - 
					explo[0].getWidth(null) / 2, ex.y - 
					explo[0].getHeight(null) / 2, this);
				}
				else if ( ex.ex_cnt < 14 ) 
				{
					buffg.drawImage(explo[1], ex.x - 
					explo[1].getWidth(null) / 2, ex.y - 
					explo[1].getHeight(null) / 2, this);
				}
				else if ( ex.ex_cnt < 21 ) 
				{
					buffg.drawImage(explo[2], ex.x - 
					explo[2].getWidth(null) / 2, ex.y -
					explo[2].getHeight(null) / 2, this);
				}
				else if( ex.ex_cnt > 21 ) 
				{
					ExplosionList.remove(i);
					ex.ex_cnt = 0;
				}
			}
			else 
			{
				if ( ex.ex_cnt < 7  ) 
				{
					buffg.drawImage(explo[0], ex.x + 120,
					ex.y + 15, this);
				}
				else if ( ex.ex_cnt < 14 ) 
				{
					buffg.drawImage(explo[1], ex.x + 60, 
					ex.y + 5, this);
				}
				else if ( ex.ex_cnt < 21 ) 
				{
					buffg.drawImage(explo[0], ex.x + 5,
					ex.y + 10, this);
				}
				else if( ex.ex_cnt > 21 ) 
				{
				ExplosionList.remove(i);
				ex.ex_cnt = 0;
				}
			}
		}
	}

	public void DrawStatus() 
	{
		buffg.setFont(new Font("Default", Font.BOLD, 15));
		buffg.drawString("SCORE: " + gameScore,600,600);
		buffg.drawString("Missile Count: " + MissList.size(),600,640);
		buffg.drawString("Enemy Count: " + EnemyList.size(),600,660);
		
	}
	
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
	
	public void KeyProcess()
	{
		if(KeyUp == true) y -=10;
		if(KeyDown == true) y +=10;
		if(KeyLeft == true) x -=10;
		if(KeyRight == true) x +=10;
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