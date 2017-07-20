/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicletest;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class Car extends Vehicle {
    
    private int passengers;

    /**
     * Construct a car with all parameters
     * @param model
     * @param yearMonth
     * @param economy
     * @param passengers 
     */
    public Car(String model, String yearMonth, double economy, int passengers) {
        super(model, yearMonth, economy);
        this.passengers = passengers;
    }
    
    

    /**
     * Get the value of passengers
     *
     * @return the value of passengers
     */
    public int getPassengers() {
        return passengers;
    }

    /**
     * Set the value of passengers
     *
     * @param passengers new value of passengers
     */
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Car{" + super.toString() + ", passengers=" + passengers + '}';
    }

    
}
