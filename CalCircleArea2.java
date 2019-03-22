/**
Solution of Q3 -Week 1 tute, alternative program

Programming exercise
*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class CalCircleArea2 extends JFrame implements ActionListener
{
  private JLabel label1,displayLabel;
  private JTextField field1;
  private JButton calButton;

  public CalCircleArea2()
  {

     super("Calculate circle area");
     setLayout(new FlowLayout());

     label1=new JLabel("Radius");
     displayLabel=new JLabel();

     calButton=new JButton("Calculate");

     field1=new JTextField(10);

     add(label1);
     add(field1);
     add(calButton);
     add(displayLabel);

     calButton.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e)
  {
     String radiusStr=field1.getText();
     double radius=Double.parseDouble(radiusStr);
     double area=circleArea(radius);// calculating area
	 String strArea = String.format("%.2f",area);
    String arg=e.getActionCommand();

    if(e.getSource()==calButton)
     displayLabel.setText("The area is "+strArea);


  }


   public double circleArea(double radius)
   {
		return Math.PI * radius * radius;

   }

   //main method
   public static void main(String[] args)
   {
        CalCircleArea2 area=new CalCircleArea2();
        area.setSize(260,150);
        area.setVisible(true);
   }

}
