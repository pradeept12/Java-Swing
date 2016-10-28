import java.applet.Applet;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class LineEx extends Applet {
	public void paint(Graphics g) {
		int v = 0, c = 40, d = 10, e = 40, cc = 0;
		String a[] = new String[55];
		String b[] = new String[55];
		a[0] = "a";
		a[1] = "b";
		a[2] = "c";
		a[3] = "d";
		a[4] = "e";
		b[0] = "a";
		b[1] = "v";
		b[2] = "c";
		b[3] = "g";
		b[4] = "e";
		for (int i = 0, j = 0; j <= 4; i++) {
			Graphics2D g2 = (Graphics2D) g;
			Line2D line;
			if (i > 4) {
				if (a[j].compareTo(b[j]) != 0) {
					if (cc == 0) {
						line = new Line2D.Double(c + 16, d, c + 59, e);
						c = c + 51;
						cc++;
					} else {
						line = new Line2D.Double(c, d, c, e);
					}
				} else {
					line = new Line2D.Double(c, d, c, e);
				}

			} else {
				line = new Line2D.Double(c, d, c, e);
			}
			g2.setColor(Color.blue);
			g2.setStroke(new BasicStroke(1));
			g2.draw(line);
			g2.setPaint(new GradientPaint(11, 33, Color.yellow, 445, 11, Color.black, true));
			g2.fillOval(c - 15, e, 31, 31);
			g2.setColor(Color.blue);
			if (i <= 4)
				g2.drawString(a[i], c, e + 18);
			else {
				g2.drawString(b[j], c, e + 18);
				j++;

			}
			d = d + 61;
			e = e + 61;
			if (i == 4) {
				c = 40;
				d = 10;
				e = 40;
			}
		}

	}
}
