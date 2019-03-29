/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangle;

/**
 *
 * @author Paul Spray <paul.spray@cqumail.com>
 */
public class RectangleTest {
    
    public static void main(String[] args) {
        
        Rectangle r1 = new Rectangle(); // construct first, take the answering call and assign to the variable r1
        
        Rectangle r2 = new Rectangle(7.0, 3.0);
        
        r1.setLength(-5.0);
        r1.setWidth(5.0);
        
        System.out.println("Width of r2" + " = " + r2.getWidth());
        System.out.println(r1);
        
        double a1 = r2.calculateArea();
        System.out.println("the area of r2 is: " + a1);
        
    }
    
}
