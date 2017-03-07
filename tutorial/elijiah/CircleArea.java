import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CircleArea extends JFrame implements ActionListener
{
	private JLabel inputLabel;
	private JLabel outputLabel;
	private JTextField input;
	private JButton calculateButton;

	public CircleArea()
	{
		super("CircleArea");
		setLayout(new FlowLayout());

		inputLabel = new JLabel("Radius");
		outputLabel = new JLabel("");
		calculateButton = new JButton("Calculate");
		input = new JTextField(10);

		add(inputLabel);
		add(input);
		add(calculateButton);
		add(outputLabel);

		calculateButton.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
		String inputString = input.getText();


		if(e.getSource() == calculateButton && inputString != null){
			double inputDouble = Double.parseDouble(inputString);
			double area = Math.pow(inputDouble, 2) * Math.PI;
			outputLabel.setText(Double.toString(area));
		}
	}

   public static void main(String[] args)
   {
		CircleArea g = new CircleArea();
		g.setSize(260,150);
		g.setVisible(true);
   }
	
}
