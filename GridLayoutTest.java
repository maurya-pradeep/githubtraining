//GridLayoutTest.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class GridLayoutTest implements ActionListener
{
	JFrame fr;
	JPanel p1,p2;
	JButton b[]=new JButton[16];
	JButton b1,b2;
	int count=0;
	GridLayoutTest()
	{
		fr=new JFrame();
		p1=new JPanel();
		p2=new JPanel();
		p1.setLayout(new GridLayout(4,4));
		fr.setLayout(new FlowLayout());
			for(int i=0 ; i<16 ; i++)
		{
			b[i]=new JButton(""+(i+1));
			b[i].setVisible(false);
			p1.add(b[i]);
		}
		b1=new JButton("Get");
		b2=new JButton("Reset");
		b1.addActionListener(this);
		b2.addActionListener(this);
		p2.add(b1); 
		p2.add(b2);
		p1.setPreferredSize(new Dimension(300,100));
		p2.setPreferredSize(new Dimension(100,100));
		fr.add(p1);
		fr.add(p2);
		fr.setSize(400,400);
		fr.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			while(count<16)
			{
			int x=(int)(Math.random()*16);
			System.out.println(x);
			if(b[x].isVisible())
				continue;
				b[x].setVisible(true);
				count++;
			break;
			}
		}
		if(e.getSource()==b2)
		{
			for(int i=0 ; i<16 ; i++)
				b[i].setVisible(false);
			count=0;
		}
	}
	public static void main(String s[])
	{
		new GridLayoutTest();
	}
}
