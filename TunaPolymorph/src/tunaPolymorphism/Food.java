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
public abstract class Food {
    
   public abstract void eat();                              // an abstract method in a super class does not need a body in it's method, but the class must be declared abstract too and the scope public
                                                            // an abstract class, can have a non abstract method, as long as it has a body
}
    
    /**
     *
        public void eat(){                                  // if the main method of the superclass can't take any arguments, or return or any values, neither can the child classes
           System.out.println("This food is great!");       // but you can use overloading, which is what that is, in the Fatty class for example
                                                                // the scope can't be changed to private either
       }
               
    
    }
    */
    

