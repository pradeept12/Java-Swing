import java.awt.Font;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Date;

//<applet code="Clock" width="100" height="100"></applet>
public class Clock extends java.applet.Applet implements Runnable {
	private Thread clockThread = null;
	int i = 1;

	public void init() {
		setBackground(Color.white);
	}

	public void start() {
		if (clockThread == null) {
			clockThread = new Thread(this, "Clock");
			clockThread.start();
		}
	}

	public void run() {
		Thread myThread = Thread.currentThread();
		while (clockThread == myThread) {
			repaint();
			try {
				System.out.println(i);
				Thread.sleep(1000);
				i++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void paint(Graphics g) {
		setBackground(Color.CYAN);
		Font f = new Font("serif", Font.BOLD, 25);
		g.setFont(f);
		Date now = new Date();
		g.drawString(now.getHours() + ":" + now.getMinutes() + ":" + now.getSeconds(), 5, 30);
	}

	public void stop() {
		clockThread = null;
	}
}