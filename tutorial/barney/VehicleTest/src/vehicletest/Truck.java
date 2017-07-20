/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicletest;

/**
 *
 * @author Steve Barnett
 */
public class Truck extends Vehicle{
    
    private double capacity;

    public Truck(String model, double economy, String YearMonth, double capacity) {
        super(model, economy, YearMonth);
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

    @Override
    public String toString() {
        return "Truck{" + "capacity=" + capacity + '}' + super.toString();
    }

}
