/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangleTest;

/**
 *
 * @author sgordon
 */
public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setLength(15.0);
        r1.setWidth(10.0);
        System.out.println("Area is " + r1.getArea() + " and perimeter is " + r1.getPerimeter());
        
        
        
    }
}
