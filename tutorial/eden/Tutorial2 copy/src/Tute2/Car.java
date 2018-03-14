/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tute2;

/**
 *
 * @author 12056070
 */
public class Car extends Vehical {
    
    private int maxPassenger;

    public Car() {
    }

    public Car(int maxPassenger, String Model, String vehicalYear, double fuelEconomy) {
        super(Model, vehicalYear, fuelEconomy);
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
    public String toString(){
        return super.toString() + " Capacity Passenger: " + this.getMaxPassenger();
                }

}
