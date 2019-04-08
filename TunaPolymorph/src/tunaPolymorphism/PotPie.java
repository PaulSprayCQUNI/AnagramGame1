/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunaPolymorphism;

/**
 *
 * @author Paul Spray <paul.spray@cqumail.com>
 */
public class PotPie extends Food {

    
     @Override                                      // has to be the @Override if the super class method being called is an abstract method
     public void eat() {
        System.out.println("The PotPie is great!");
    }
    
     
}
