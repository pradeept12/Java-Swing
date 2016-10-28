import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
public class MovingCarExample extends Applet
{
	public void paint(Graphics g)
	{
		Image i=getImage(getDocumentBase(),"rad.jpg");
		Image i1=getImage(getDocumentBase(),"cr1.jpg");
		Image i2=getImage(getDocumentBase(),"cr4.jpg");
		Image i3=getImage(getDocumentBase(),"cr3.jpg");
		g.drawImage(i,11,11,null);
			for(int f=522;f>=122;f--)
			{
				g.drawImage(i,11,55,null);
				g.drawImage(i1,11,f,null);
				try{
					Thread.sleep(11);
				     }
				    	catch(InterruptedException ie){}
			}
			for(int x=11;x<=332;x++)
			{
				g.drawImage(i,11,55,null);
				g.drawImage(i3,x,95,null);
				try{
					Thread.sleep(11);
				    }
				    catch(InterruptedException ie){}
				  
			}
			for(int y=332;y<=532;y++)
			{
				g.drawImage(i,11,55,null);
				g.drawImage(i2,482,y,null);
				try{
					Thread.sleep(11);
				    }
				    catch(InterruptedException ie){}
			}
			for(int d=482;d<=822;d++)
			{
				g.drawImage(i,11,55,null);
				g.drawImage(i3,d,532,null);
				try{
					Thread.sleep(11);
				    }
				    catch(InterruptedException ie){}

			}
			for(int f=622;f>=122;f--)
			{
				g.drawImage(i,11,55,null);
				g.drawImage(i1,962,f,null);
				try{
					Thread.sleep(11);
				    }
				    catch(InterruptedException ie){}

			}

			//repaint();	
	}
}