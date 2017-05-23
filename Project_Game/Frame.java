import javax.swing.*;
import java .awt.*;

public class Frame extends JFrame
{
	Frame()
	{
		init(); //Component setting method.
		start(); 
		
		setTitle("Plane Shooting"); //Name of the frame.
		setSize(792,1006); //Size of the frame.
	
		//Adjust the size of frame as the size of user's screen
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
	
		//To set the frame on the middle of the screen
		int fXPos = (int)screen.getWidth() / 2 - 792 / 2;
		int fYPos = (int)screen.getHeight() / 2 - 1020 / 2;
		
		setLocation(fXPos,fYPos);
	
		//make users not change the size
		setResizable(false);
		setVisible(true);
	}
	
	public void init()
	{
		
	}
	public void start()
	{
		
	}
}
