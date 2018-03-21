/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.time.LocalDate;

/**
 *
 * @author s0287181
 */
public class Truck extends Vehicle {
    
    private double loadingCapacity;

    public Truck(String model, LocalDate manufactureDate, double fuelEconomy) {
        super(model, manufactureDate, fuelEconomy);
    }

    public Truck() {
    }

    public Truck(String model, LocalDate manufactureDate, double fuelEconomy, double loadingCapacity) {
        super(model, manufactureDate, fuelEconomy);
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

    @Override
    public String toString() {
        return "Truck{" + "loadingCapacity=" + loadingCapacity + '}';
    }

}
