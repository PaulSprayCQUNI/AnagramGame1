import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui1 extends JFrame implements ActionListener
{
	private JLabel label1;
	private JTextField field1;
	private JButton button1, button2;

	public Gui1()
	{
		super("Gui1");
		setLayout(new FlowLayout());

		label1 = new JLabel("Label 1");
		button1 = new JButton("Button 1");
		button2 = new JButton("Button 2");
		field1 = new JTextField(10);

		add(label1);
		add(field1);
		add(button1);
		add(button2);

		button1.addActionListener(this);
		button2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
		String field1Str = field1.getText();

		if(e.getSource() == button1)
			field1.setText("Button 1 was pressed");
		else if(e.getSource() == button2)
			field1.setText("Button 2 was pressed");
	}

   public static void main(String[] args)
   {
		Gui1 g = new Gui1();
		g.setSize(260,150);
		g.setVisible(true);
   }
	
}
