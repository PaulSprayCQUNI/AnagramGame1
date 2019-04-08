/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicletest;

/**
 * Truck class
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class Truck extends Vehicle {
    
    private double capacity;

    /**
     * Construct a truck with parameters
     * @param model
     * @param yearMonth
     * @param economy
     * @param capacity 
     */
    public Truck(String model, String yearMonth, double economy, double capacity) {
        super(model, yearMonth, economy);
        this.capacity = capacity;
    }
    
    

    /**
     * Get the value of capacity
     *
     * @return the value of capacity
     */
    public double getCapacity() {
        return capacity;
    }

    /**
     * Set the value of capacity
     *
     * @param capacity new value of capacity
     */
    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    
}
