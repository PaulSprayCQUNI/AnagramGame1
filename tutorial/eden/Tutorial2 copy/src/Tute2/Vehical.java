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
public class Vehical {
    
    private String Model;
    
    private String vehicalYear;
    
    private double fuelEconomy;

    public Vehical() {
    }

    public Vehical(String Model, String vehicalYear, double fuelEconomy) {
        this.Model = Model;
        this.vehicalYear = vehicalYear;
        this.fuelEconomy = fuelEconomy;
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
     * Get the value of vehicalYear
     *
     * @return the value of vehicalYear
     */
    public String getVehicalYear() {
        return vehicalYear;
    }

    /**
     * Set the value of vehicalYear
     *
     * @param vehicalYear new value of vehicalYear
     */
    public void setVehicalYear(String vehicalYear) {
        this.vehicalYear = vehicalYear;
    }


    /**
     * Get the value of Model
     *
     * @return the value of Model
     */
    public String getModel() {
        return Model;
    }

    /**
     * Set the value of Model
     *
     * @param Model new value of Model
     */
    public void setModel(String Model) {
        this.Model = Model;
    }
@Override
    public String toString(){
        
        return " make: " + this.getModel() + " year: " + this.getVehicalYear() + " Economy: " + this.getFuelEconomy();
    }
}
