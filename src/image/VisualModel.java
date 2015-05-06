/*
* This section of code is for the creation of a visual aid for the understanding of BCS theory
* It is made to be called by the pressing of the Visual Model button on the main JFrame
* This will loop constantly until the application is closed
*  MADE BY HARRY SMITH
*/

package image;

import javax.swing.*;

import java.awt.*;


public class VisualModel extends JFrame
{
	
	public int x1 = 200;
	public int x2 = 400;
	public int x3 = 600;
	public int x4 = 800;
	public int x5 = 200;
	public int x6 = 400;
	public int x7 = 600;
	public int x8 = 800;
	public int x9 = 50;
	public int x10;
	
	public int y1 = 100;
	public int y2 = 100;
	public int y3 = 100;
	public int y4 = 100;
	public int y5 = 600;
	public int y6 = 600;
	public int y7 = 600;
	public int y8 = 600;
	public int y9 = 380;
	public int y10;
	
	public VisualModel()
	{
		
		setTitle("Visual Model of BCS Theory");
		setSize(1000 , 800);
		setResizable(false);
		
	}
	
	public void paint(Graphics g)
	{
		repaint();
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 1000, 800);
		g.setColor(Color.RED);
		g.fillOval(x1, y1, 100, 100);
	    g.fillOval(x2, y2, 100, 100);
	    g.fillOval(x3, y3, 100, 100);
	    g.fillOval(x4, y4, 100, 100);
	    g.fillOval(x5, y5, 100, 100);
	    g.fillOval(x6, y6, 100, 100);
	    g.fillOval(x7, y7, 100, 100);
	    g.fillOval(x8, y8, 100, 100);
	    g.setColor(Color.BLUE);
	    g.fillOval(x9, y9, 50, 50);
	        

        if(x9 < x1)
        {
        	x9 = x9 + 2;
        }
        if(x1 <= x9 & x9 < x2)
        {
        	x9 = x9 + 2;
        	y1++;
        	y5--;
        }
        
        if(x2 <= x9 & x9 < x3)
        {
        	x9 = x9 + 2;
        	y2++;
        	y6--;
        }
        
        if(x3 <= x9 & x9 < x4)
        {
        	x9 = x9 + 2;
        	y3++;
        	y7--;
        }
        
        if(x4 <= x9 & x9 < 1000)
        {
        	x9 = x9 + 2;
        	y4++;
        	y8--;
        }
        
		if(x9 >= 1000 & x9 < 1100)
		{
			x10 = 50;
			y10 = 380;
			g.setColor(Color.BLUE);
			g.fillOval(x10, y10, 50, 50);
			x9 = x9 + 500;
		}
		
        if(x10 < 1000 & x9 >=1100)
        {
        	x10 = x10 + 10;
			g.setColor(Color.BLUE);
			g.fillOval(x10, y10, 50, 50);
        }
        
        if(x10 >= 1000)
        {
        	x9 = 50;
        	y1 = 100;
        	y2 = 100;
        	y3 = 100;
        	y4 = 100;
        	y5 = 600;
        	y6 = 600;
        	y7 = 600;
        	y8 = 600;
        	x10 = 0;
        }
        
		try
		{
			Thread.sleep(25);
		}
		catch(InterruptedException ie)
		{
			
		}
		
	}
	
	public static void main(String[] args)
	{
		VisualModel VM = new VisualModel();
		VM.paint(null);
	}

}
