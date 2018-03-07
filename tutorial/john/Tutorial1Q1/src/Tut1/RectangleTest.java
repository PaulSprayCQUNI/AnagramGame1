/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tut1;

/**
 *
 * @author John Barber <john.barber@cqumail.com>
 */
public class RectangleTest
{
    public static void main(String[] args)
    {
        Rectangle wrekt = new Rectangle();
        
        System.out.println("Wrekt's default length " + wrekt.getLength());
        System.out.println("Wrekt's default width " + wrekt.getWidth());
        
        wrekt.setLength(10);
        wrekt.setWidth(6);
        
        System.out.println("Wrekt length " + wrekt.getLength());
        System.out.println("Wrekt width " + wrekt.getWidth());
        
        System.out.println("Wrekt's Area " + wrekt.calculateArea());
        System.out.println("Wrekt Perimeter " + wrekt.calculatePerimeter());
        
    }
            
}
