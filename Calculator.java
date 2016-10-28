import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class calce extends JFrame implements ActionListener
{
	int s,b,a,ba;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,a6,a7,a8,a9,c1,c2,c3;
	JTextArea ta;
	String msg="",fist="",secnd="";
	calce()
	{
		Container cp=getContentPane();
		this.setLayout(new FlowLayout());	
		ta=new JTextArea(5,23);
		JPanel p1=new JPanel();
		ImageIcon i=new ImageIcon("F:/softs/3D.Cartoon.Icons.Pack/ICO./Limewire.ico");
		p1.add(ta);
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("+");
		b7=new JButton("=",i);
		b8=new JButton("*");
		b9=new JButton("AC");
		a6=new JButton("6");
		a7=new JButton("7");
		a8=new JButton("8");
		a9=new JButton("9");
		c1=new JButton("/");
		c2=new JButton(".");
		c3=new JButton("%");	
		p1.setBounds(12,91,45,56);
		cp.add(p1);
		cp.add(b1);
		cp.add(b2);
		cp.add(b3);
		cp.add(b4);
		cp.add(b5);
		cp.add(a6);
		cp.add(a7);
		cp.add(a8);
		cp.add(a9);
		cp.add(b6);
		cp.add(c1);
		cp.add(c2);
		cp.add(c3);
		cp.add(b8);
		cp.add(b9);
		cp.add(b7);		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);	
		a6.addActionListener(this);
		a7.addActionListener(this);
		a8.addActionListener(this);
		a9.addActionListener(this);	
		c1.addActionListener(this);
		c2.addActionListener(this);
		c3.addActionListener(this);
		//this.setBackground(Color.blue);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			msg=msg+"1";
			ta.setText(msg);
		}
		if(ae.getSource()==b2)
		{
			msg=msg+"2";
			ta.setText(msg);
		}
		if(ae.getSource()==b3)
		{
			msg=msg+"3";
			ta.setText(msg);
		}
		if(ae.getSource()==b4)
		{
			msg=msg+"4";
			ta.setText(msg);
		}	
		if(ae.getSource()==b5)
		{
			msg=msg+"5";
			ta.setText(msg);
		}
		if(ae.getSource()==a6)
		{
			msg=msg+"6";
			ta.setText(msg);
		}
		if(ae.getSource()==a7)
		{
			msg=msg+"7";
			ta.setText(msg);
		}
		if(ae.getSource()==a8)
		{
			msg=msg+"8";
			ta.setText(msg);
		}
		if(ae.getSource()==a9)
		{
			msg=msg+"9";
			ta.setText(msg);
		}	
		if(ae.getSource()==b6)
		{
			s=1;
			if(b!=1||ba==1)
			fist=msg;			
			msg="";
			ta.setText(msg);
		}
		if(ae.getSource()==b7)
		{
			if(s==1)
			{
				a=Integer.parseInt(fist)+Integer.parseInt(ta.getText());
				ta.setText(Integer.toString(a));
				fist=Integer.toString(a);
				b=1;
				msg="";
			}
			if(s==2)
			{
				a=Integer.parseInt(fist)*Integer.parseInt(ta.getText());
				ta.setText(Integer.toString(a));
				fist=Integer.toString(a);
			}
			if(s==3)
			{
				a=Integer.parseInt(fist)/Integer.parseInt(ta.getText());
				ta.setText(Integer.toString(a));
				fist=Integer.toString(a);
			}
		}
		if(ae.getSource()==b8)
		{
			s=2;
			fist=msg;
			msg="";
			ta.setText(msg);
		}
		if(ae.getSource()==b9)
		{
						
			fist="";
			msg="";
			ta.setText(msg);
			ba=1;
		}
		if(ae.getSource()==c1)
		{
			s=3;
			fist=msg;
			msg="";
			ta.setText(msg);
		}

	}	
}
class Calculator 
{

	public static void main(String ar[])
	{
		calce c=new calce();
		c.setVisible(true);
		c.setSize(511,511);
		c.setTitle("calcelatr");
	}
}
			