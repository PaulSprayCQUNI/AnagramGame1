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
public class Truck extends Vehicle {
    
        private double loadCapacity;

    /**
     * Get the value of loadCapacity
     *
     * @return the value of loadCapacity
     */
    public double getLoadCapacity() {
        return loadCapacity;
    }

    /**
     * Set the value of loadCapacity
     *
     * @param loadCapacity new value of loadCapacity
     */
    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public Truck(double loadCapacity, String model, String yearMonth, double fuelEconomy) {
        super(model, yearMonth, fuelEconomy);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" + "loadCapacity=" + loadCapacity + '}';
    }

    
}
