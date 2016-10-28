import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;

class pat extends Frame implements MouseListener, MouseMotionListener, ActionListener {
	int a[] = new int[22222];
	int ab[] = new int[22222];
	int b11[] = new int[22222];
	int a11[] = new int[22222];
	int bl[] = new int[22222];
	int gr[] = new int[22222];
	int e[] = new int[22222];
	int yv[] = new int[22222];
	int cl[] = new int[22222];
	int cl1[] = new int[22222];
	int x1;
	int x2;
	int y1;
	int y2;
	int i, a1, a2, a3, a4, ch, j, l, m, n, er, y, t, ck, ck1;
	Button b1, b2, b3, b4, b5, b6, b8, b9, b13;
	Button sc;
	Color sacr, clr;
	JPanel c;
	JMenuBar mb;
	JTextArea ta;
	JMenu file, edit, help;
	JMenuItem news, open, exit, save, print, cut, copy, paste, time;

	pat() {
		i = 1;
		j = 1;
		l = 1;
		m = 1;
		n = 1;
		er = 1;
		y = 1;
		ck = 1;
		t = 1;
		ck1 = 1;
		setLayout(new FlowLayout());
		addMouseListener(this);
		addMouseMotionListener(this);
		sc = new Button("select color");
		b1 = new Button("line");
		b2 = new Button("Rect");
		b3 = new Button("ellipse");
		b4 = new Button("blue rect");
		b5 = new Button("green oval");
		b8 = new Button("yellow oval");
		b6 = new Button(" eraser ");
		b9 = new Button("mv");
		b13 = new Button("clicki");
		c = new JPanel();
		c.setLayout(new BorderLayout());
		add(c);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b8);
		add(b9);
		add(b13);
		add(sc);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b13.addActionListener(this);
		sc.addActionListener(this);
		mb = new JMenuBar();
		file = new JMenu("File");
		edit = new JMenu("Edit");
		help = new JMenu("Help");
		news = new JMenuItem("New");
		open = new JMenuItem("Open");
		save = new JMenuItem("Set Background As...");
		print = new JMenuItem("print");
		cut = new JMenuItem("Cut");
		copy = new JMenuItem("Copy");
		paste = new JMenuItem("Paste");
		time = new JMenuItem("Time/Date");
		c.add("North", mb);
		mb.add(file);
		mb.add(edit);
		mb.add(help);
		file.add(news);
		file.add(open);
		file.add(save);
		file.add(print);
		edit.add(cut);
		edit.add(copy);
		// edit.add(paste);
		edit.add(time);
		// help.add(news);
		news.addActionListener(this);
		save.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == b1) {
			ch = 1;
		}
		if (ae.getSource() == b2) {
			ch = 2;
		}
		if (ae.getSource() == b3) {
			ch = 3;
		}
		if (ae.getSource() == b4) {
			ch = 4;
		}
		if (ae.getSource() == b5) {
			ch = 5;
		}
		if (ae.getSource() == b6) {
			ch = 6;
		}
		if (ae.getSource() == b8) {
			ch = 8;
		}
		if (ae.getSource() == b9) {
			ch = 9;
		}
		if (ae.getSource() == b13) {
			ch = 13;
		}
		if (ae.getSource() == sc) {
			Color cc = Color.green;
			sacr = JColorChooser.showDialog(this, "clr is", cc);
		}
		if (news.isArmed()) {
			pat pt = new pat();
			pt.setSize(1234, 999);
			pt.setTitle("drawi");
			pt.setVisible(true);
		}
		if (save.isArmed()) {
			Color cl = new Color(222, 1, 1);
			clr = JColorChooser.showDialog(this, "clr is", cl);
			this.setBackground(clr);
		}
	}

	public void mouseClicked(MouseEvent me) {
		if (ch == 15) {
			x2 = me.getX();
			y2 = me.getY();
			cl[ck] = x2;
			ck++;
			cl[ck] = y2;
			ck++;
			repaint();
		}
	}

	public void mousePressed(MouseEvent me) {
		if (ch == 1) {
			x1 = me.getX();
			y1 = me.getY();
			a[i] = x1;
			i++;
			a[i] = y1;
			i++;
		}
		if (ch == 2) {
			x1 = me.getX();
			y1 = me.getY();
			b11[j] = x1;
			j++;
			b11[j] = y1;
			j++;
		}
		if (ch == 3) {
			x1 = me.getX();
			y1 = me.getY();
			a11[l] = x1;
			l++;
			a11[l] = y1;
			l++;
		}
		if (ch == 4) {
			x1 = me.getX();
			y1 = me.getY();
			bl[m] = x1;
			m++;
			bl[m] = y1;
			m++;
		}
		if (ch == 5) {
			x1 = me.getX();
			y1 = me.getY();
			gr[n] = x1;
			n++;
			gr[n] = y1;
			n++;
		}
		if (ch == 6) {
			x1 = me.getX();
			y1 = me.getY();
			e[er] = x1;
			er++;
			e[er] = y1;
			er++;
		}
		if (ch == 8) {
			x1 = me.getX();
			y1 = me.getY();
			yv[y] = x1;
			y++;
			yv[y] = y1;
			y++;
		}
		if (ch == 13) {
			x1 = me.getX();
			y1 = me.getY();
			cl1[ck1] = x1;
			ck1++;
			cl1[ck1] = y1;
			ck1++;
		}
	}

	public void mouseReleased(MouseEvent me) {
		if (ch == 1) {
			x2 = me.getX();
			y2 = me.getY();
			a[i] = x2;
			i++;
			a[i] = y2;
			i++;
			repaint();
		}
		if (ch == 2) {
			x2 = me.getX();
			y2 = me.getY();
			b11[j] = x2;
			j++;
			b11[j] = y2;
			j++;
			repaint();
		}
		if (ch == 3) {
			x2 = me.getX();
			y2 = me.getY();
			a11[l] = x2;
			l++;
			a11[l] = y2;
			l++;
			repaint();
		}
		if (ch == 4) {
			x2 = me.getX();
			y2 = me.getY();
			bl[m] = x2;
			m++;
			bl[m] = y2;
			m++;
			repaint();
		}
		if (ch == 5) {
			x2 = me.getX();
			y2 = me.getY();
			gr[n] = x2;
			n++;
			gr[n] = y2;
			n++;
			repaint();
		}
		if (ch == 6) {
			x2 = me.getX();
			y2 = me.getY();
			e[er] = x2;
			er++;
			e[er] = y2;
			er++;
			repaint();
		}
		if (ch == 8) {
			x2 = me.getX();
			y2 = me.getY();
			yv[y] = x2;
			y++;
			yv[y] = y2;
			y++;
			repaint();
		}
		if (ch == 13) {
			x2 = me.getX();
			y2 = me.getY();
			cl1[ck1] = x2;
			ck1++;
			cl1[ck1] = y2;
			ck1++;
			repaint();
		}
	}

	public void mouseMoved(MouseEvent me) {
		if (ch == 11) {
			x2 = me.getX();
			y2 = me.getY();
			a[i] = x1;
			i++;
			a[i] = y1;
			i++;
			repaint();
		}
	}

	public void mouseExited(MouseEvent me) {
	}

	public void mouseDragged(MouseEvent me) {
		if (ch == 9) {
			x1 = me.getX();
			y1 = me.getY();
			ab[t] = x1;
			t++;
			ab[t] = y1;
			t++;
			x2 = me.getX();
			y2 = me.getY();
			ab[t] = x2;
			t++;
			ab[t] = y2;
			t++;
			repaint();
		}
	}

	public void mouseEntered(MouseEvent me) {
	}

	public void paint(Graphics g) {
		g.setColor(sacr);
		if (ch == 1 || ch == 2 || ch == 3 || ch == 4 || ch == 5 || ch == 6 || ch == 8 || ch == 11 || ch == 13
				|| ch == 15) {
			int k = 1;
			while (k <= n) {
				g.setColor(Color.green);
				a1 = gr[k];
				a2 = gr[k + 1];
				a3 = gr[k + 2];
				a4 = gr[k + 3];
				g.fillOval(a1, a2, a3 - a1, a4 - a2);
				k = k + 4;
				g.setColor(sacr);
			}
			k = 1;
			while (k <= m) {
				g.setColor(Color.blue);
				a1 = bl[k];
				a2 = bl[k + 1];
				a3 = bl[k + 2];
				a4 = bl[k + 3];
				g.fillRect(a1, a2, a3 - a1, a4 - a2);
				k = k + 4;
				g.setColor(sacr);
			}
			k = 1;
			while (k <= y) {
				g.setColor(Color.yellow);
				a1 = yv[k];
				a2 = yv[k + 1];
				a3 = yv[k + 2];
				a4 = yv[k + 3];
				g.fillOval(a1, a2, a3 - a1, a4 - a2);
				k = k + 4;
				g.setColor(sacr);
			}
			k = 1;
			while (k <= i) {
				a1 = a[k];
				a2 = a[k + 1];
				a3 = a[k + 2];
				a4 = a[k + 3];
				g.drawLine(a1, a2, a3, a4);
				k = k + 4;
			}
			k = 1;
			while (k <= j) {
				a1 = b11[k];
				a2 = b11[k + 1];
				a3 = b11[k + 2];
				a4 = b11[k + 3];
				g.drawRect(a1, a2, a3 - a1, a4 - a2);
				k = k + 4;
			}
			k = 1;
			while (k <= l) {
				a1 = a11[k];
				a2 = a11[k + 1];
				a3 = a11[k + 2];
				a4 = a11[k + 3];
				g.drawOval(a1, a2, a3 - a1, a4 - a2);
				k = k + 4;
			}
			k = 1;
			while (k <= er) {
				g.setColor(clr);
				a1 = e[k];
				a2 = e[k + 1];
				a3 = e[k + 2];
				a4 = e[k + 3];
				g.fillRect(a1, a2, a3 - a1, a4 - a2);
				k = k + 4;
			}
			if (ch == 13) {
				k = 1;
				ch = 15;
				while (k < ck1) {
					a1 = cl1[k];
					a2 = cl1[k + 1];
					a3 = cl1[k + 2];
					a4 = cl1[k + 3];
					g.drawLine(a1, a2, a3, a4);
					k = k + 4;
				}
			}
			k = 1;
			while (k < ck) {
				a1 = a3;
				a2 = a4;
				a3 = cl[k];
				a4 = cl[k + 1];
				g.drawLine(a1, a2, a3, a4);
				k = k + 2;
			}
		}
		if (ch == 9) {
			int k = 1;
			while (k <= t) {
				g.setColor(sacr);
				a1 = ab[k];
				a2 = ab[k + 1];
				a3 = ab[k + 2];
				a4 = ab[k + 3];
				k = k + 4;
				g.drawLine(a1, a2, a3, a4);
			}
		}
	}
}

class MiniMSPaint {
	public static void main(String aa[]) {
		pat p = new pat();
		p.setSize(1234, 999);
		p.setTitle("drawi");
		p.setVisible(true);
	}
}