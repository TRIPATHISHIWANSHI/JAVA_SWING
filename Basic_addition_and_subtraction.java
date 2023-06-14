import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fifth 
{
	fifth()
	{
		JFrame frame=new JFrame();
		JLabel l=new JLabel("ENTER NUMBER 1:");
		l.setBounds(25,25,120,30);
		
		JTextField f1=new JTextField();
		f1.setBounds(160,25,120,30);
		
		JLabel l2=new JLabel("ENTER NUMBER 2:");
		l2.setBounds(25,75,120,30);
		
		JTextField f2=new JTextField();
		f2.setBounds(160,75,120,30);
		
		JLabel label=new JLabel();
		label.setBounds(25,135,120,30);
		
		JButton b1=new JButton("ADD");
		b1.setBounds(20,200,60,25);
		
		JButton b2=new JButton("SUB");
		b2.setBounds(100,200,60,25);
		
		
		frame.add(l);
		frame.add(f1);
		frame.add(l2);
		frame.add(f2);
		frame.add(label);
		frame.add(b1);
		frame.add(b2);
		
		frame.setLayout(null);
		frame.setSize(600,600);
		frame.setDefaultCloseOperation(1);
		frame.setVisible(true);
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String s1=f1.getText();
				String s2=f2.getText();
				int n1=Integer.parseInt(s1);
				int n2=Integer.parseInt(s2);
				int result=n1+n2;
				label.setText("ANSWER="+String.valueOf(result));
			}
	});
		
		b2.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						int n1=Integer.parseInt(f1.getText());
						int n2=Integer.parseInt(f2.getText());
						//label.setText(String.(n1+n2)));
						int res=n1-n2;
						String result=String.valueOf(res);
						label.setText("ANSWER="+result);
					}
			
				}
	);
	}
	public static void main(String[] args) 
	{
		fifth f=new fifth();
	}


}
