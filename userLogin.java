package actionListener;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class a4 
{
	JFrame f1,f2,f3;
	JButton b1,b2,b3,b4;
	JLabel l1,l2,l3,l4;
	JTextField tf1,tf2,tf3,tf4;
	String data[];
	a4()
	{
		f1=new JFrame("FORM");
		
		b1=new JButton("SIGN IN");
		b1.setBounds(30,50,100,30);
		
		b2=new JButton("SIGN UP");
		b2.setBounds(30,150,100,30);
		
		f1.add(b1);
		f1.add(b2);
		f1.setSize(400,400);
		f1.setLayout(null);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(1);
		
		b1.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) 
					{
						f2=new JFrame("SIGN UP");
						l1=new JLabel("NAME");
						l2=new JLabel("ID");
						b3=new JButton("SUBMIT");
						b3.setBounds(50,100,100,30);
						l1.setBounds(20,20,100,30);
						l2.setBounds(20,60,100,30);
						tf1=new JTextField();
						tf2=new JTextField();
						tf1.setBounds(180,20,100,30);
						tf2.setBounds(180,60,100,30);
						f2.add(tf1);
						f2.add(tf2);
						f2.add(l1);
						f2.add(l2);
						f2.add(b3);
						f2.setSize(400,400);
						f2.setLayout(null);
						f2.setDefaultCloseOperation(1);
						f2.setVisible(true);
						b3.addActionListener(new ActionListener()
						{
					public void actionPerformed(ActionEvent e)
					{
						JOptionPane.showMessageDialog(f3,"SUBMITTED");
					}
					
						});
					}
				});
				
		b2.addActionListener(new ActionListener()
				{
			@Override
			public void actionPerformed(ActionEvent e) 
			{	
				f3=new JFrame("LOG IN");
				l1=new JLabel("USERNAME");
				l2=new JLabel("PASSWORD");
				b4=new JButton("SUBMIT");
				b4.setBounds(50,200,60,30);
				l1.setBounds(20,30,100,30);
				l2.setBounds(60,100,100,30);
				tf3=new JTextField();
				tf3.setBounds(180,30,100,30);
				tf4=new JTextField();
				tf4.setBounds(180,100,100,30);
				f3.add(tf3);
				f3.add(tf4);
				f3.add(l1);
				f3.add(l2);
				f3.add(b4);
				f3.setSize(400,400);
				f3.setDefaultCloseOperation(1);
				f3.setLayout(null);
				f3.setVisible(true);
				b4.addActionListener(new ActionListener()
						{
					public void actionPerformed(ActionEvent e)
					{
						JOptionPane.showMessageDialog(f3,"SUBMITTED");
					}
					
						});
				
				
			}
				});
	}
	public static void main(String[] args) 
	{
		a4 a=new a4();
	}

}
