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
public class Vehicle {
    
    private String model;
    
    private LocalDate manufactureDate;
    
    private double fuelEconomy;

    public Vehicle(String model, LocalDate manufactureDate, double fuelEconomy) {
        this.model = model;
        this.manufactureDate = manufactureDate;
        this.fuelEconomy = fuelEconomy;
    }

    public Vehicle() {
        this.model = "";
        this.manufactureDate = LocalDate.of(0, 0, 0);
        this.fuelEconomy = 00.0;
    }
    

    /**
     * Get the value of fuelEconomy
     *
     * @return the value of fuelEconomy
     */
    public double getFuelEconomy() {
        return fuelEconomy;
    }

    /**
     * Set the value of fuelEconomy
     *
     * @param fuelEconomy new value of fuelEconomy
     */
    public void setFuelEconomy(double fuelEconomy) {
        this.fuelEconomy = fuelEconomy;
    }


    /**
     * Get the value of manufactureDate
     *
     * @return the value of manufactureDate
     */
    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    /**
     * Set the value of manufactureDate
     *
     * @param manufactureDate new value of manufactureDate
     */
    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }


    /**
     * Get the value of model
     *
     * @return the value of model
     */
    public String getModel() {
        return model;
    }

    /**
     * Set the value of model
     *
     * @param model new value of model
     */
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "model=" + model + ", manufactureDate=" + manufactureDate + ", fuelEconomy=" + fuelEconomy + '}';
    }
    
    
}
