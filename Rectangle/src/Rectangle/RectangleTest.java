/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangle;

/**
 *
 * @author Paul Spray <paul.spray@cqumail.com>
 * Class created to test the set, get, and public calculate methods in class Rectangle.java
 */
public class RectangleTest {
    //main method to access methods of class Rectangle.java
        public static void main(String[] args) {
        
    // construct first a new object of the class Rectangle to right of assignment operator, the returned value to the call will be assigned to the declare variable r1 of type Rectangle
        Rectangle r1 = new Rectangle(); 
        
        Rectangle r2 = new Rectangle(7.0, 3.0);
        
        r1.setLength(-5.0);
        r1.setWidth(5.0);
        
        System.out.println("Width of r2" + " = " + r2.getWidth());
        System.out.println(r1);
        
        double a2 = r2.calculateArea();
        System.out.println("The area of r2 is: " + a2);
        
        double p2 = r2.calculatePerimeter();
        System.out.println("The perimter of r2 is: " + p2);
    }
    
}
