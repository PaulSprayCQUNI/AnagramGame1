/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Douglas Wheatley <douglas.wheatley@cqumail.com>
 */
public class RectangleTest {
    
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        
        r1.setLength(0.0);
        r1.setWidth(1.1);
        
       double l = r1.getLength();
       
       System.out.println(l);
    }
            
}
