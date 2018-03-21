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
public class Truck extends Vehical {
    
    private double loadingCapacity;

    public Truck() {
    }

    public Truck(double loadingCapacity, String Model, String vehicalYear, double fuelEconomy) {
        super(Model, vehicalYear, fuelEconomy);
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
    public String toString(){
        return super.toString() + " loading capacity: " + this.getLoadingCapacity();
    }

}
