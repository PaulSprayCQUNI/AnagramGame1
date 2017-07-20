/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicletest;

/**
 * Vehicle
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class Vehicle {

    private String model;
    private String yearMonth;
    private double economy;

    /**
     * Construct a specific vehicle
     *
     * @param model model description
     * @param yearMonth year and month of manufacture
     * @param economy fuel economy in km per litre
     */
    public Vehicle(String model, String yearMonth, double economy) {
        this.model = model;
        this.yearMonth = yearMonth;
        this.economy = economy;
    }

    /**
     * Get the value of economy
     *
     * @return the value of economy
     */
    public double getEconomy() {
        return economy;
    }

    /**
     * Set the value of economy
     *
     * @param economy new value of economy
     */
    public void setEconomy(double economy) {
        this.economy = economy;
    }

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
        return "Vehicle{" + "model=" + model + ", yearMonth=" + yearMonth + ", economy=" + economy + '}';
    }

}
