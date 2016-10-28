import java.awt.*;
import java.awt.event.*;
import java.util.*;

@SuppressWarnings("serial")
class sudokuu extends Frame {
	int counter;
	Button t[] = new Button[81];
	int a[][][] = new int[12][12][29];

	sudokuu() {
		this.setLayout(new FlowLayout());
		/*
		 * t1.addActionListener(this); t2.addActionListener(this);
		 * t3.addActionListener(this); t4.addActionListener(this);
		 * t5.addActionListener(this); t6.addActionListener(this);
		 * t7.addActionListener(this); t8.addActionListener(this);
		 * t9.addActionListener(this);
		 */
		for (int j = 1; j <= 16; j++) {
			t[j] = new Button("0");
			add(t[j]);
		}
		this.setBackground(Color.red);

	}

	void randomNumber() {
		int START = 1;
		int END = 4;
		int START1 = 1;
		int END1 = 16;

		Random random = new Random();
		while (true) {
			int count = 11, c = 0;
			for (int g = 1; g <= 16; g++) {
				if (t[g].getLabel() != "0")
					c++;
			}
			if (c < count)
				showRandomInteger(START, END, START1, END1, random);
			else
				break;
		}

	}

	void assign() {
		int temp = 1;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				a[i][j][temp] = Integer.parseInt(t[temp].getLabel());
				System.out.println("ttemp" + t[temp].getLabel() + "         a[i][j]     " + a[i][j][temp]);
				temp++;
			}
		}
	}

	private void showRandomInteger(int aStart, int aEnd, int aStart1, int aEnd1, Random aRandom) {
		if (aStart > aEnd) {
			throw new IllegalArgumentException("Start cannot exceed End.");
		}
		long range = (long) aEnd - (long) aStart + 1;
		long fraction = (long) (range * aRandom.nextDouble());
		int randomNumber = (int) (fraction + aStart);
		if (aStart1 > aEnd1) {
			throw new IllegalArgumentException("Start cannot exceed End.");
		}
		range = (long) aEnd1 - (long) aStart1 + 1;
		fraction = (long) (range * aRandom.nextDouble());
		int randomNumber1 = (int) (fraction + aStart1);

		log(randomNumber, randomNumber1);
	}

	private void log(int aMessage, int aMessage1) {

		int tem = aMessage1;
		/*
		 * while(tem>=1) { if(tem>4) {
		 * if(aMessage==Integer.parseInt(t[tem-4].getLabel())) { counter=2; } }
		 * tem-=4;
		 * 
		 * } if(counter!=2) { while(tem<=16) { if(tem<=12) {
		 * if(aMessage==Integer.parseInt(t[tem+4].getLabel())) { counter=2; }
		 * tem+=4; } } }
		 */
		// System.out.println(tem);

		while (true) {

			if (tem % 4 == 1)
				break;

			if (tem % 4 == 1)
				System.out.println("hi");
			if (tem > 1) {
				if (aMessage == Integer.parseInt(t[tem - 1].getLabel())) {
					counter = 2;
					break;
				}
			}
			tem--;
		}
		if (counter != 2) {
			/*
			 * while(true) { if(tem%4==0) break; if(tem<=15) {
			 * if(aMessage==Integer.parseInt(t[tem+1].getLabel())) { counter=2;
			 * break; } } tem+=1; }
			 */
		}
		if (counter == 2) {
			t[aMessage1].setLabel("0");
		} else {
			t[aMessage1].setLabel("");
			t[aMessage1].setLabel(Integer.toString(aMessage));
		}
	}

}

class Sudoku {
	public static void main(String aa[]) {
		sudokuu s = new sudokuu();
		s.randomNumber();
		s.assign();
		s.setTitle("SUDOKU");
		s.setVisible(true);
		s.setSize(321, 398);
	}
}