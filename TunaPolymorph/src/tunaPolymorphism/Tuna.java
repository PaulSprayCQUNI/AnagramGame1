/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunaPolymorphism;

/**
 *
 * @author Paul Spray <paul.spray@cqumail.com>
 * package Tuna is all about talking about inheritance and is based on the
 * tutorial at https://www.youtube.com/watch?v=9JpNY-XAseg - the new boston.
 * 
 *  //
 */

public class Tuna extends Food {
    
     @Override
     public void eat(){
        System.out.println("This Tuna is great!");
    }
    
}
