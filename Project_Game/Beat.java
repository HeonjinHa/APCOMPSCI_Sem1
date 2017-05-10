package Project_Game; 

import javax.swing.*;
import java.awt.*;

public class Beat extends JFrame 
{
	int f_width = 800; 
	int f_height = 600; 
	
	public Beat() 
	{
		setTitle("Beat");
		setSize(f_width, f_height);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);		
	}
}