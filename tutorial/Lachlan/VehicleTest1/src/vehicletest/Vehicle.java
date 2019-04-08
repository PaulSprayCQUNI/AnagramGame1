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
public class Vehicle {
    
    private String model;

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

        private String yearMonth;

    /**
     * Get the value of yearMonth
     *
     * @return the value of yearMonth
     */
    public String getYearMonth() {
        return yearMonth;
    }

    /**
     * Set the value of yearMonth
     *
     * @param yearMonth new value of yearMonth
     */
    public void setYearMonth(String yearMonth) {
        this.yearMonth = yearMonth;
    }

        private double fuelEconomy;

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

    public Vehicle(String model, String yearMonth, double fuelEconomy) {
        this.model = model;
        this.yearMonth = yearMonth;
        this.fuelEconomy = fuelEconomy;
    }

    
    
    @Override
    public String toString() {
        return "Vehicle{" + "model=" + model + ", yearMonth=" + yearMonth + ", fuelEconomy=" + fuelEconomy + '}';
    }
    
    

}
