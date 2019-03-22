/**
Solution of Q3 -Week 1 tut

Programming exercise
*/

import javax.swing.JOptionPane;


public class CalCircleArea
{


   public static void main(String[] args)
   {
         String inputRadius;

			// prompt for reading the circle's radius
         inputRadius = JOptionPane.showInputDialog("Radius in cm");

         double radius=Double.parseDouble(inputRadius);

         	// calculate the area of circle
         double area=circleArea(radius);
         String areaOfCircle = String.format("%.2f",area);

         JOptionPane.showMessageDialog(null,"The area of the circle is "+areaOfCircle +"sq.cm","Calculate circle area",JOptionPane.PLAIN_MESSAGE);


   }

   public static double circleArea(double radius)
   {
		return Math.PI * radius * radius;
   }


}
