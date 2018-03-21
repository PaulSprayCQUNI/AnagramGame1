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
public class Truck extends Vehicle {
    
    
        private double loadingCapacity;

    public Truck(String Model, int Year, int Month, double loadingCapacity) {
        super(Model, Year, Month);
        this.loadingCapacity = loadingCapacity;
    }
    
        
        
    public Truck(double loadingCapacity) {
        this.loadingCapacity = loadingCapacity;
    }
        

    /**
     * Get the value of loadingCapacity
     *
     * @return the value of loadingCapacity
     */
    public double getLoadingCapacity() {
        return loadingCapacity;
    }

    /**
     * Set the value of loadingCapacity
     *
     * @param loadingCapacity new value of loadingCapacity
     */
    public void setLoadingCapacity(double loadingCapacity) {
        this.loadingCapacity = loadingCapacity;
    }

    
}
