/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial_week2.newpackage;

/**
 *
 * @author Douglas Wheatley <douglas.wheatley@cqumail.com>
 */
public class Car extends Vehicle{
    
          private int maxPassenger;

    public Car(String Model, int Year, int Month, int maxPassenger) {
        super(Model, Year, Month);
        this.maxPassenger = maxPassenger;
    }

    public Car(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }
    
   
          
    

    /**
     * Get the value of maxPassenger
     *
     * @return the value of maxPassenger
     */
    public int getMaxPassenger() {
        return maxPassenger;
    }

    /**
     * Set the value of maxPassenger
     *
     * @param maxPassenger new value of maxPassenger
     */
    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    @Override
    public String toString() {
        return "Car:" + "maxPassenger=" + maxPassenger + super.toString();
        
        
        
    }

    
    
    
    
}
