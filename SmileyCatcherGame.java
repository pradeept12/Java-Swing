import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class gam extends JFrame implements MouseListener, MouseMotionListener, ActionListener {
	JButton b;
	JLabel lb;
	int x, y, scr;
	JButton sc;
	Container c;
	ImageIcon i1, i2, i3;

	gam() {
		c = getContentPane();
		c.setLayout(null);
		i1 = new ImageIcon("smile.jpg");
		i2 = new ImageIcon("sml.jpg");
		i3 = new ImageIcon("cry.jpg");
		b = new JButton("", i1);
		// b.setForeground(Color.red);
		b.setBackground(Color.green);
		b.setToolTipText("HI");
		c.add(b);
		b.addMouseListener(this);
		b.addMouseMotionListener(this);
		b.setBounds(123, 23, 266, 266);
		lb = new JLabel("Score is  ");
		c.add(lb);
		lb.setBounds(666, 24, 123, 121);
		lb.setFont(new Font("Verdana", Font.BOLD, 16));
		sc = new JButton("select color");
		sc.addActionListener(this);
		c.add(sc);
		sc.setBounds(666, 55, 123, 21);
		c.setBackground(Color.green);
	}

	public void mouseMoved(MouseEvent me) {
		try {
			Thread.sleep(111);
		} catch (InterruptedException ie) {
		}
		;
		b.setIcon(i2);
		x = (int) (555 * Math.random());
		y = (int) (333 * Math.random());
		b.setBounds(x, y, 333, 343);
		b.setIcon(i1);
	}

	public void mouseClicked(MouseEvent me) {
		b.setIcon(i3);
		scr += 111;
		lb.setText("Score is " + scr);
		x = (int) (555 * Math.random());
		y = (int) (333 * Math.random());
		b.setBounds(x, y, 333, 343);
		// b.setBounds(123,21,323,332);
	}

	public void mouseExited(MouseEvent me) {
	}

	public void mousePressed(MouseEvent me) {
	}

	public void mouseReleased(MouseEvent me) {
	}

	public void mouseDragged(MouseEvent me) {
	}

	public void mouseEntered(MouseEvent me) {
	}

	public void actionPerformed(ActionEvent ae) {
		Color cc = Color.blue;
		Color sacr = JColorChooser.showDialog(this, "clr is", cc);
		// if(sacr!=null)
		// cc=sacr;
		// repaint();
		c.setBackground(sacr);
		b.setBackground(sacr);
	}

}

class SmileyCatcherGame {
	public static void main(String aa[]) {
		gam g = new gam();
		g.setSize(1233, 1233);
		g.setVisible(true);
		g.setTitle("GAME");
	}
}