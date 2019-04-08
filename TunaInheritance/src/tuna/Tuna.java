/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuna;

/**
 *
 * @author Paul Spray <paul.spray@cqumail.com>
 * package Tuna is all about talking about inheritance and is based on the
 * tutorial at https://www.youtube.com/watch?v=9JpNY-XAseg - the new boston.
 */
public class Tuna extends PotPie {    // the keyword extends is what enables the Tuna class to inherit variables and methods from Food class

    /* public void eat(){
            * There could be many classes of Food like this in a progam, and 
            * and every class could have a method like this one with the output statment below,
            * but what if you suddenly needed to change the text of all the food classes?
            * System.out.println("I am the eat method");
            * Making this change without changing every class uses inheritance.
             * The variables and methods can instead be inherited from a parent class, or super 
             * or super class - like Food
     */
    //per line 20 in Apples - we can recreate the inherited method within a subclass to show how the subclass' method will override - just for Tuna
    
    @Override
    public void eat(){
       
            System.out.println("I am the new eat method, just for Tuna yo!");
    }

}
