/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicletest;

/**
 *
 * @author LachlanRGaming
 */
public class Car extends Vehicle {

    public Car(String model, String yearMonth, double fuelEconomy, int passengers) {
        super(model, yearMonth, fuelEconomy);
        this.passengers = passengers;
    }

    
    
    private int passengers;

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
        return "Car{" + "passengers=" + passengers + '}';
    }
    
}
