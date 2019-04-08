/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuna;

/**
 *
 * @author Paul Spray <paul.spray@cqumail.com>
 */
public class Apples {
    
    public static void main(String[] args) {
        
        Tuna tunaObject = new Tuna();           // objects of the two subclasses of food
        PotPie potPieObject = new PotPie();     // can now be created in a class with a main method
                                                // and can be used to call the inherited method eat() from the Food clas
        tunaObject.eat();                       //  as in line 19 and 20
        potPieObject.eat();                     // we can also look at override methods in relation to inheritance, in the Tuna class
        
    }
    
}
