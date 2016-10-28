import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class men extends JFrame implements ActionListener {
	JTextField tf;
	JButton b1;
	String str;
	Container c, c1, c2;
	JMenuBar mb;
	JTextArea ta;
	JMenu file, edit, tools, help, view;
	JMenuItem news, open, save, print, exit, cut, copy, paste, time, toolbars, small, size, statusbar, about, adrbar,
			iconbar;
	JCheckBoxMenuItem mode;

	men() {
		c = getContentPane();
		c.setLayout(new BorderLayout());
		mb = new JMenuBar();
		file = new JMenu("File");
		edit = new JMenu("Edit");
		tools = new JMenu("Tools");
		view = new JMenu("View");
		help = new JMenu("Help");
		news = new JMenuItem("New");
		open = new JMenuItem("Open");
		save = new JMenuItem("Save");
		print = new JMenuItem("print");
		exit = new JMenuItem("Exit");
		cut = new JMenuItem("Cut     ctrl+x");
		copy = new JMenuItem("Copy     ctrl+c");
		paste = new JMenuItem("Paste     ctrl+v");
		time = new JMenuItem("Time/Date");
		toolbars = new JMenuItem("Toolbars");
		small = new JMenuItem("Small");
		size = new JMenuItem("Size");
		statusbar = new JMenuItem("Statusbar");
		about = new JMenuItem("About");
		adrbar = new JMenuItem("AddressBar");
		iconbar = new JMenuItem("IconBar");
		c.add("North", mb);
		mb.add(file);
		mb.add(edit);
		mb.add(tools);
		mb.add(view);
		mb.add(help);
		file.add(news);
		file.add(open);
		file.add(save);
		file.add(print);
		file.add(exit);
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		edit.add(time);
		tools.add(toolbars);
		// view.add(small);
		view.add(size);
		view.add(statusbar);
		toolbars.add(adrbar);
		toolbars.add(iconbar);
		help.add(about);
		ta = new JTextArea(123, 123);
		c.add(ta);
		news.addActionListener(this);
		size.addActionListener(this);
		exit.addActionListener(this);
		b1 = new JButton("ok");
		b1.addActionListener(this);
		// about.addActionListener(this);
	}

	class sub extends JFrame {
		sub() {
			c1 = getContentPane();
			tf = new JTextField(15);
			c1.setLayout(new FlowLayout());
			c1.add(tf);
			c1.add(b1);
		}
	}

	/*
	 * public void paint(Graphics g) { g.setColor(Color.blue);
	 * g.drawString(str,33,333); }
	 */
	public void actionPerformed(ActionEvent ae) {
		if (news.isArmed())
			ta.setText("");
		if (size.isArmed()) {
			sub ff = new sub();
			ff.setTitle("Font");
			ff.setSize(222, 222);
			ff.setVisible(true);
		}
		if (ae.getSource() == b1) {
			ta.setFont(new Font("Verdana", Font.BOLD + Font.PLAIN, Integer.parseInt(tf.getText())));
		}
		if (about.isArmed()) {
			str = "this is used for writing purpose only" + "\n" + "It is secured" + "\n" + "Not Transferable";
			/*
			 * sub f1=new sub(); f1.setTitle("Help"); f1.setSize(222,222);
			 * f1.setVisible(true);
			 */
			ta.setText("hhh");
			// repaint();
		}
		if (exit.isArmed())
			System.exit(0);
	}
}

class NotepadGUIExample {
	public static void main(String aa[]) {
		men mm = new men();
		mm.setVisible(true);
		mm.setSize(1276, 766);
	}
}