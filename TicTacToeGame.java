import java.awt.*;
import java.awt.event.*;
class dai extends Frame implements ActionListener
{
	Button t1,t2,t3,t4,t5,t6,t7,t8,t9,t;
	dai()
	{
		//this.setLayout(new FlowLayout());
		t1=new Button("");
		t2=new Button("");
		t3=new Button("");
		t4=new Button("");
		t5=new Button("");
		t6=new Button("");
		t7=new Button("");
		t8=new Button("");
		t9=new Button("");
		t=new Button("");
		t1.addActionListener(this);
		t2.addActionListener(this);
		t3.addActionListener(this);
		t4.addActionListener(this);
		t5.addActionListener(this);
		t6.addActionListener(this);
		t7.addActionListener(this);
		t8.addActionListener(this);
		t9.addActionListener(this);
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);
		add(t6);
		add(t7);
		add(t8);
		add(t9);
		add(t);
		this.setBackground(Color.red);
		t1.setBounds(133,123,23,25);
		t2.setBounds(163,123,23,25);
		t3.setBounds(193,123,23,25);
		t4.setBounds(133,153,23,25);
		t5.setBounds(163,153,23,25);
		t6.setBounds(193,153,23,25);
		t7.setBounds(133,183,23,25);
		t8.setBounds(163,183,23,25);
		t9.setBounds(193,183,23,25);
		t.setBounds(222,183,23,25);	
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==t1)
		{
			t1.setLabel("s");
			if((t1.getLabel()=="m"&&t2.getLabel()=="m"&&t3.getLabel()=="m")||(t1.getLabel()=="m"&&t4.getLabel()=="m"&&t7.getLabel()=="m")||(t1.getLabel()=="m"&&t5.getLabel()=="m"&&t9.getLabel()=="m")||(t2.getLabel()=="m"&&t5.getLabel()=="m"&&t8.getLabel()=="m")||(t8.getLabel()=="m"&&t7.getLabel()=="m"&&t9.getLabel()=="m")||(t5.getLabel()=="m"&&t6.getLabel()=="m"&&t4.getLabel()=="m")||(t6.getLabel()=="m"&&t3.getLabel()=="m"&&t9.getLabel()=="m"))
			{
				System.out.print("cmputer win.........");
			}
			if((t1.getLabel()=="s"&&t2.getLabel()=="s"&&t3.getLabel()=="s")||(t1.getLabel()=="s"&&t4.getLabel()=="s"&&t7.getLabel()=="s")||(t1.getLabel()=="s"&&t5.getLabel()=="s"&&t9.getLabel()=="s")||(t2.getLabel()=="s"&&t5.getLabel()=="s"&&t8.getLabel()=="s")||(t8.getLabel()=="s"&&t7.getLabel()=="s"&&t9.getLabel()=="s")||(t5.getLabel()=="s"&&t6.getLabel()=="s"&&t4.getLabel()=="s")||(t6.getLabel()=="s"&&t3.getLabel()=="s"&&t9.getLabel()=="s"))	
			{
				System.out.print("i am win");
			}
			if(t2.getLabel()=="s")
			{
				if(t3.getLabel()=="")
					t3.setLabel("m");
			}
			else if(t3.getLabel()=="s")
			{
				if(t2.getLabel()=="")
					t2.setLabel("m");
			}
			else if(t4.getLabel()=="s")
			{
				if(t7.getLabel()=="")
					t7.setLabel("m");
			}
			else if(t7.getLabel()=="s")
			{
				if(t4.getLabel()=="")
					t4.setLabel("m");
			}
			else if(t5.getLabel()=="s")
			{
				if(t9.getLabel()=="")
					t9.setLabel("m");
			}
			else if(t9.getLabel()=="s")
			{
				if(t5.getLabel()=="")
					t5.setLabel("m");
			}
			else if(t6.getLabel()=="")
				t6.setLabel("m");
			else if(t8.getLabel()=="")
				t8.setLabel("m");			
		}
		if(ae.getSource()==t3)
		{
			t3.setLabel("s");
			if((t1.getLabel()=="m"&&t2.getLabel()=="m"&&t3.getLabel()=="m")||(t1.getLabel()=="m"&&t4.getLabel()=="m"&&t7.getLabel()=="m")||(t1.getLabel()=="m"&&t5.getLabel()=="m"&&t9.getLabel()=="m")||(t2.getLabel()=="m"&&t5.getLabel()=="m"&&t8.getLabel()=="m")||(t8.getLabel()=="m"&&t7.getLabel()=="m"&&t9.getLabel()=="m")||(t5.getLabel()=="m"&&t6.getLabel()=="m"&&t4.getLabel()=="m")||(t6.getLabel()=="m"&&t3.getLabel()=="m"&&t9.getLabel()=="m"))
			{
				System.out.print("cmputer win.........");
			}
			if((t1.getLabel()=="s"&&t2.getLabel()=="s"&&t3.getLabel()=="s")||(t1.getLabel()=="s"&&t4.getLabel()=="s"&&t7.getLabel()=="s")||(t1.getLabel()=="s"&&t5.getLabel()=="s"&&t9.getLabel()=="s")||(t2.getLabel()=="s"&&t5.getLabel()=="s"&&t8.getLabel()=="s")||(t8.getLabel()=="s"&&t7.getLabel()=="s"&&t9.getLabel()=="s")||(t5.getLabel()=="s"&&t6.getLabel()=="s"&&t4.getLabel()=="s")||(t6.getLabel()=="s"&&t3.getLabel()=="s"&&t9.getLabel()=="s"))	
			{
				System.out.print("i am win");
			}
			if(t2.getLabel()=="s")
			{
				if(t1.getLabel()=="")
					t1.setLabel("m");
			}
			else if(t1.getLabel()=="s")
			{
				if(t2.getLabel()=="")
					t2.setLabel("m");
			}
			else if(t5.getLabel()=="s")
			{
				if(t7.getLabel()=="")
					t7.setLabel("m");
			}
			else if(t7.getLabel()=="s")
			{
				if(t5.getLabel()=="")
					t5.setLabel("m");
			}
			else if(t6.getLabel()=="s")
			{
				if(t9.getLabel()=="")
					t9.setLabel("m");
			}
			else if(t9.getLabel()=="s")
			{
				if(t6.getLabel()=="")
					t6.setLabel("m");
			}
			else if(t4.getLabel()=="")
				t4.setLabel("m");
			else if(t8.getLabel()=="")
				t8.setLabel("m");		
		}
		if(ae.getSource()==t4)
		{
			t4.setLabel("s");
			if((t1.getLabel()=="m"&&t2.getLabel()=="m"&&t3.getLabel()=="m")||(t1.getLabel()=="m"&&t4.getLabel()=="m"&&t7.getLabel()=="m")||(t1.getLabel()=="m"&&t5.getLabel()=="m"&&t9.getLabel()=="m")||(t2.getLabel()=="m"&&t5.getLabel()=="m"&&t8.getLabel()=="m")||(t8.getLabel()=="m"&&t7.getLabel()=="m"&&t9.getLabel()=="m")||(t5.getLabel()=="m"&&t6.getLabel()=="m"&&t4.getLabel()=="m")||(t6.getLabel()=="m"&&t3.getLabel()=="m"&&t9.getLabel()=="m"))
			{
				System.out.print("cmputer win.........");
			}
			if((t1.getLabel()=="s"&&t2.getLabel()=="s"&&t3.getLabel()=="s")||(t1.getLabel()=="s"&&t4.getLabel()=="s"&&t7.getLabel()=="s")||(t1.getLabel()=="s"&&t5.getLabel()=="s"&&t9.getLabel()=="s")||(t2.getLabel()=="s"&&t5.getLabel()=="s"&&t8.getLabel()=="s")||(t8.getLabel()=="s"&&t7.getLabel()=="s"&&t9.getLabel()=="s")||(t5.getLabel()=="s"&&t6.getLabel()=="s"&&t4.getLabel()=="s")||(t6.getLabel()=="s"&&t3.getLabel()=="s"&&t9.getLabel()=="s"))	
			{
				System.out.print("i am win");
			}		
			if(t1.getLabel()=="s")
			{
				if(t7.getLabel()=="")
					t7.setLabel("m");
			}
			else if(t5.getLabel()=="s")
			{
				if(t6.getLabel()=="")
					t6.setLabel("m");
			}
			else if(t6.getLabel()=="s")
			{
				if(t5.getLabel()=="")
					t5.setLabel("m");
			}
			else if(t7.getLabel()=="s")
			{
				if(t1.getLabel()=="")
					t1.setLabel("m");
			}
			else if(t2.getLabel()=="")
				t2.setLabel("m");
			else if(t3.getLabel()=="")
				t3.setLabel("m");
			else if(t8.getLabel()=="")
				t8.setLabel("m");
			else if(t9.getLabel()=="")
				t9.setLabel("m");
		}
		if(ae.getSource()==t7)
		{
			t7.setLabel("s");
			if((t1.getLabel()=="m"&&t2.getLabel()=="m"&&t3.getLabel()=="m")||(t1.getLabel()=="m"&&t4.getLabel()=="m"&&t7.getLabel()=="m")||(t1.getLabel()=="m"&&t5.getLabel()=="m"&&t9.getLabel()=="m")||(t2.getLabel()=="m"&&t5.getLabel()=="m"&&t8.getLabel()=="m")||(t8.getLabel()=="m"&&t7.getLabel()=="m"&&t9.getLabel()=="m")||(t5.getLabel()=="m"&&t6.getLabel()=="m"&&t4.getLabel()=="m")||(t6.getLabel()=="m"&&t3.getLabel()=="m"&&t9.getLabel()=="m"))
			{
				System.out.print("cmputer win.........");
			}
			if((t1.getLabel()=="s"&&t2.getLabel()=="s"&&t3.getLabel()=="s")||(t1.getLabel()=="s"&&t4.getLabel()=="s"&&t7.getLabel()=="s")||(t1.getLabel()=="s"&&t5.getLabel()=="s"&&t9.getLabel()=="s")||(t2.getLabel()=="s"&&t5.getLabel()=="s"&&t8.getLabel()=="s")||(t8.getLabel()=="s"&&t7.getLabel()=="s"&&t9.getLabel()=="s")||(t5.getLabel()=="s"&&t6.getLabel()=="s"&&t4.getLabel()=="s")||(t6.getLabel()=="s"&&t3.getLabel()=="s"&&t9.getLabel()=="s"))	
			{
				System.out.print("i am win");
			}
			if(t1.getLabel()=="s")
			{
				if(t4.getLabel()=="")
					t4.setLabel("m");
			}
			else if(t4.getLabel()=="s")
			{
				if(t1.getLabel()=="")
					t1.setLabel("m");
			}
			else if(t5.getLabel()=="s")
			{
				if(t3.getLabel()=="")
					t3.setLabel("m");
			}
			else if(t3.getLabel()=="s")
			{
				if(t5.getLabel()=="")
					t5.setLabel("m");
			}
			else if(t8.getLabel()=="s")
			{
				if(t9.getLabel()=="")
					t9.setLabel("m");
			}
			else if(t9.getLabel()=="s")
			{
				if(t8.getLabel()=="")
					t8.setLabel("m");
			}
			else if(t2.getLabel()=="")
				t2.setLabel("m");
			else if(t6.getLabel()=="")
				t6.setLabel("m");		
		}
		if(ae.getSource()==t9)
		{
			t9.setLabel("s");
			if((t1.getLabel()=="m"&&t2.getLabel()=="m"&&t3.getLabel()=="m")||(t1.getLabel()=="m"&&t4.getLabel()=="m"&&t7.getLabel()=="m")||(t1.getLabel()=="m"&&t5.getLabel()=="m"&&t9.getLabel()=="m")||(t2.getLabel()=="m"&&t5.getLabel()=="m"&&t8.getLabel()=="m")||(t8.getLabel()=="m"&&t7.getLabel()=="m"&&t9.getLabel()=="m")||(t5.getLabel()=="m"&&t6.getLabel()=="m"&&t4.getLabel()=="m")||(t6.getLabel()=="m"&&t3.getLabel()=="m"&&t9.getLabel()=="m"))
			{
				System.out.print("cmputer win.........");
			}
			if((t1.getLabel()=="s"&&t2.getLabel()=="s"&&t3.getLabel()=="s")||(t1.getLabel()=="s"&&t4.getLabel()=="s"&&t7.getLabel()=="s")||(t1.getLabel()=="s"&&t5.getLabel()=="s"&&t9.getLabel()=="s")||(t2.getLabel()=="s"&&t5.getLabel()=="s"&&t8.getLabel()=="s")||(t8.getLabel()=="s"&&t7.getLabel()=="s"&&t9.getLabel()=="s")||(t5.getLabel()=="s"&&t6.getLabel()=="s"&&t4.getLabel()=="s")||(t6.getLabel()=="s"&&t3.getLabel()=="s"&&t9.getLabel()=="s"))	
			{
				System.out.print("i am win");
			}
			if(t1.getLabel()=="s")
			{
				if(t5.getLabel()=="")
					t5.setLabel("m");
			}
			else if(t5.getLabel()=="s")
			{
				if(t1.getLabel()=="")
					t1.setLabel("m");
			}
			else if(t3.getLabel()=="s")
			{
				if(t6.getLabel()=="")
					t6.setLabel("m");
			}
			else if(t6.getLabel()=="s")
			{
				if(t3.getLabel()=="")
					t3.setLabel("m");
			}
			else if(t7.getLabel()=="s")
			{
				if(t8.getLabel()=="")
					t8.setLabel("m");
			}
			else if(t8.getLabel()=="s")
			{
				if(t7.getLabel()=="")
					t7.setLabel("m");
			}
			else if(t4.getLabel()=="")
				t4.setLabel("m");
			else if(t2.getLabel()=="")
				t2.setLabel("m");		
		}
		if(ae.getSource()==t2)
		{
			t2.setLabel("s");
			if((t1.getLabel()=="m"&&t2.getLabel()=="m"&&t3.getLabel()=="m")||(t1.getLabel()=="m"&&t4.getLabel()=="m"&&t7.getLabel()=="m")||(t1.getLabel()=="m"&&t5.getLabel()=="m"&&t9.getLabel()=="m")||(t2.getLabel()=="m"&&t5.getLabel()=="m"&&t8.getLabel()=="m")||(t8.getLabel()=="m"&&t7.getLabel()=="m"&&t9.getLabel()=="m")||(t5.getLabel()=="m"&&t6.getLabel()=="m"&&t4.getLabel()=="m")||(t6.getLabel()=="m"&&t3.getLabel()=="m"&&t9.getLabel()=="m"))
			{
				System.out.print("cmputer win.........");
			}
			if((t1.getLabel()=="s"&&t2.getLabel()=="s"&&t3.getLabel()=="s")||(t1.getLabel()=="s"&&t4.getLabel()=="s"&&t7.getLabel()=="s")||(t1.getLabel()=="s"&&t5.getLabel()=="s"&&t9.getLabel()=="s")||(t2.getLabel()=="s"&&t5.getLabel()=="s"&&t8.getLabel()=="s")||(t8.getLabel()=="s"&&t7.getLabel()=="s"&&t9.getLabel()=="s")||(t5.getLabel()=="s"&&t6.getLabel()=="s"&&t4.getLabel()=="s")||(t6.getLabel()=="s"&&t3.getLabel()=="s"&&t9.getLabel()=="s"))	
			{
				System.out.print("i am win");
			}
			if(t1.getLabel()=="s")
			{
				if(t3.getLabel()=="")
					t3.setLabel("m");
			}
			else if(t3.getLabel()=="s")
			{
				if(t1.getLabel()=="")
					t1.setLabel("m");
			}
			else if(t5.getLabel()=="s")
			{
				if(t8.getLabel()=="")
					t8.setLabel("m");
			}
			else if(t8.getLabel()=="s")
			{
				if(t5.getLabel()=="")
					t5.setLabel("m");
			}
			else if(t4.getLabel()=="")
				t4.setLabel("m");
			else if(t6.getLabel()=="")
				t6.setLabel("m");
			else if(t7.getLabel()=="")
				t7.setLabel("m");
			else if(t9.getLabel()=="s")
				t9.setLabel("m");
		}
		if(ae.getSource()==t6)
		{
			t6.setLabel("s");
			if((t1.getLabel()=="m"&&t2.getLabel()=="m"&&t3.getLabel()=="m")||(t1.getLabel()=="m"&&t4.getLabel()=="m"&&t7.getLabel()=="m")||(t1.getLabel()=="m"&&t5.getLabel()=="m"&&t9.getLabel()=="m")||(t2.getLabel()=="m"&&t5.getLabel()=="m"&&t8.getLabel()=="m")||(t8.getLabel()=="m"&&t7.getLabel()=="m"&&t9.getLabel()=="m")||(t5.getLabel()=="m"&&t6.getLabel()=="m"&&t4.getLabel()=="m")||(t6.getLabel()=="m"&&t3.getLabel()=="m"&&t9.getLabel()=="m"))
			{
				System.out.print("cmputer win.........");
			}
			if((t1.getLabel()=="s"&&t2.getLabel()=="s"&&t3.getLabel()=="s")||(t1.getLabel()=="s"&&t4.getLabel()=="s"&&t7.getLabel()=="s")||(t1.getLabel()=="s"&&t5.getLabel()=="s"&&t9.getLabel()=="s")||(t2.getLabel()=="s"&&t5.getLabel()=="s"&&t8.getLabel()=="s")||(t8.getLabel()=="s"&&t7.getLabel()=="s"&&t9.getLabel()=="s")||(t5.getLabel()=="s"&&t6.getLabel()=="s"&&t4.getLabel()=="s")||(t6.getLabel()=="s"&&t3.getLabel()=="s"&&t9.getLabel()=="s"))	
			{
				System.out.print("i am win");
			}
			if(t3.getLabel()=="s")
			{
				if(t9.getLabel()=="")
					t9.setLabel("m");
			}
			else if(t9.getLabel()=="s")
			{
				if(t3.getLabel()=="")
					t3.setLabel("m");
			}
			else if(t5.getLabel()=="s")
			{
				if(t4.getLabel()=="")
					t4.setLabel("m");
			}
			else if(t4.getLabel()=="s")
			{
				if(t5.getLabel()=="")
					t5.setLabel("m");
			}
			else if(t1.getLabel()=="")
				t1.setLabel("m");
			else if(t2.getLabel()=="")
				t2.setLabel("m");
			else if(t7.getLabel()=="")
				t7.setLabel("m");
			else if(t8.getLabel()=="")
				t8.setLabel("m");
		}
		if(ae.getSource()==t8)
		{
			t8.setLabel("s");
			if((t1.getLabel()=="m"&&t2.getLabel()=="m"&&t3.getLabel()=="m")||(t1.getLabel()=="m"&&t4.getLabel()=="m"&&t7.getLabel()=="m")||(t1.getLabel()=="m"&&t5.getLabel()=="m"&&t9.getLabel()=="m")||(t2.getLabel()=="m"&&t5.getLabel()=="m"&&t8.getLabel()=="m")||(t8.getLabel()=="m"&&t7.getLabel()=="m"&&t9.getLabel()=="m")||(t5.getLabel()=="m"&&t6.getLabel()=="m"&&t4.getLabel()=="m")||(t6.getLabel()=="m"&&t3.getLabel()=="m"&&t9.getLabel()=="m"))
			{
				System.out.print("cmputer win.........");
			}
			if((t1.getLabel()=="s"&&t2.getLabel()=="s"&&t3.getLabel()=="s")||(t1.getLabel()=="s"&&t4.getLabel()=="s"&&t7.getLabel()=="s")||(t1.getLabel()=="s"&&t5.getLabel()=="s"&&t9.getLabel()=="s")||(t2.getLabel()=="s"&&t5.getLabel()=="s"&&t8.getLabel()=="s")||(t8.getLabel()=="s"&&t7.getLabel()=="s"&&t9.getLabel()=="s")||(t5.getLabel()=="s"&&t6.getLabel()=="s"&&t4.getLabel()=="s")||(t6.getLabel()=="s"&&t3.getLabel()=="s"&&t9.getLabel()=="s"))	
			{
				System.out.print("i am win");
			}
			if(t2.getLabel()=="s")
			{
				if(t5.getLabel()=="")
					t5.setLabel("m");
			}
			else if(t5.getLabel()=="s")
			{
				if(t2.getLabel()=="")
					t2.setLabel("m");
			}
			else if(t7.getLabel()=="s")
			{
				if(t9.getLabel()=="")
					t9.setLabel("m");
			}
			else if(t9.getLabel()=="s")
			{
				if(t7.getLabel()=="")
					t7.setLabel("m");
			}
			else if(t1.getLabel()=="")
				t1.setLabel("m");
			else if(t3.getLabel()=="")
				t3.setLabel("m");
			else if(t4.getLabel()=="")
				t4.setLabel("m");
			else if(t6.getLabel()=="")
				t6.setLabel("m");
		}
		if(ae.getSource()==t5)
		{		
			t5.setLabel("s");
			if((t1.getLabel()=="m"&&t2.getLabel()=="m"&&t3.getLabel()=="m")||(t1.getLabel()=="m"&&t4.getLabel()=="m"&&t7.getLabel()=="m")||(t1.getLabel()=="m"&&t5.getLabel()=="m"&&t9.getLabel()=="m")||(t2.getLabel()=="m"&&t5.getLabel()=="m"&&t8.getLabel()=="m")||(t8.getLabel()=="m"&&t7.getLabel()=="m"&&t9.getLabel()=="m")||(t5.getLabel()=="m"&&t6.getLabel()=="m"&&t4.getLabel()=="m")||(t6.getLabel()=="m"&&t3.getLabel()=="m"&&t9.getLabel()=="m"))
			{
				System.out.print("cmputer win.........");
			}
			if((t1.getLabel()=="s"&&t2.getLabel()=="s"&&t3.getLabel()=="s")||(t1.getLabel()=="s"&&t4.getLabel()=="s"&&t7.getLabel()=="s")||(t1.getLabel()=="s"&&t5.getLabel()=="s"&&t9.getLabel()=="s")||(t2.getLabel()=="s"&&t5.getLabel()=="s"&&t8.getLabel()=="s")||(t8.getLabel()=="s"&&t7.getLabel()=="s"&&t9.getLabel()=="s")||(t5.getLabel()=="s"&&t6.getLabel()=="s"&&t4.getLabel()=="s")||(t6.getLabel()=="s"&&t3.getLabel()=="s"&&t9.getLabel()=="s"))	
			{
				System.out.print("i am win");
			}
			if(t1.getLabel()=="s")
			{		
				if(t9.getLabel()=="")
					t9.setLabel("m");
			}	
			else if(t2.getLabel()=="s")
			{	
				if(t8.getLabel()=="")
					t8.setLabel("m");
			}
			else if(t3.getLabel()=="s")
			{
				if(t7.getLabel()=="")
					t7.setLabel("m");
			}
			else if(t4.getLabel()=="s")
			{
				if(t6.getLabel()=="")
					t6.setLabel("m");
			}
			else if(t6.getLabel()=="s")
			{
				if(t4.getLabel()=="")
					t4.setLabel("m");
			}
			else if(t7.getLabel()=="s")
			{
				if(t3.getLabel()=="")
					t3.setLabel("m");
			}
			else if(t8.getLabel()=="s")
			{
				if(t2.getLabel()=="")
					t2.setLabel("m");
			}
			else if(t9.getLabel()=="s")
			{
				if(t1.getLabel()=="")
					t1.setLabel("m");
			}		
		}
			
	}
}	
class TicTacToeGame
{
	public static void main(String aa[])
	{
		dai d=new dai();
		d.setTitle("Dadi");
		d.setVisible(true);
		d.setSize(333,398);
	}		
}			