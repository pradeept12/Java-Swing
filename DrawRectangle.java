import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class DrawRectangle extends Applet implements MouseListener, MouseMotionListener {
	int x1, x2, y1, y2;
	String str = "";

	public void init() {
		this.addMouseListener(this);
	}

	public void mousePressed(MouseEvent me) {
		x1 = me.getX();
		y1 = me.getY();
		str = x1 + "     " + y1 + "\n" + "\n";
	}

	public void mouseReleased(MouseEvent me) {
		x2 = me.getX();
		y2 = me.getY();
		str = str + "      " + x2 + "   " + y2 + " " + "\n";
		repaint();
	}

	public void mouseClicked(MouseEvent me) {
	}

	public void mouseMoved(MouseEvent me) {
	}

	public void mouseExited(MouseEvent me) {
	}

	public void mouseDragged(MouseEvent me) {
	}

	public void mouseEntered(MouseEvent me) {
	}

	public void paint(Graphics g) {
		g.setColor(Color.green);
		g.drawString(str, 123, 323);
		g.drawRect(x1, y1, x2 - x1, y2 - y1);
	}
}