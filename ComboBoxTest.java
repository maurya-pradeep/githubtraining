//ComboBoxTest.java
import javax.swing.*;
import java.awt.event.*;
class ComboBoxTest implements ActionListener
{
	JFrame fr;
	JComboBox cb1,cb2;
	DefaultComboBoxModel model1,model2,model3;
	ComboBoxTest()
	{
		fr=new JFrame();
		fr.setLayout(null);
		String city[]={"Noida","Agra","Kanpur"};
		model1=new DefaultComboBoxModel(city);
		model2=new DefaultComboBoxModel();
		model2.addElement("Bhopal");
		model2.addElement("Jabalpur");
		model2.addElement("Indore");
		model3=new DefaultComboBoxModel();
		model3.addElement("Jaipur");
		model3.addElement("Ajmer");
		model3.addElement("Udaypur");
		String state[]={"UP" , "MP" , "Raj"};
		cb1=new JComboBox(state);
		cb2=new JComboBox();
		cb1.setBounds(50,50,100,30);
		cb2.setBounds(180,50,100,30);
		fr.add(cb1);fr.add(cb2);
		cb1.addActionListener(this);
		fr.setSize(300,300);
		fr.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==cb1)
		{
			String st=(String)cb1.getSelectedItem();
			if(st.equals("UP"))
				cb2.setModel(model1);
			if(st.equals("MP"))
				cb2.setModel(model2);
			if(st.equals("Raj"))
				cb2.setModel(model3);
		}
	}	
	public static void main(String s[])
	{
		new ComboBoxTest();
	}
}
