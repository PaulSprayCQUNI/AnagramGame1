/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial_week2.newpackage;

/**
 *
 * @author Douglas Wheatley <douglas.wheatley@cqumail.com>
 */
public class Vehicle {

    private String Model;
    private int Year;
    private int Month;
    private double fuelEconomy;

    public Vehicle(String Model, int Year, int Month) {
        this.Model = Model;
        this.Year = Year;
        this.Month = Month;
    }

    public Vehicle() {
        this.Model = "Toyota";
        this.Year = 1996;
        this.Month = 11;
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
     * Get the value of Month
     *
     * @return the value of Month
     */
    public int getMonth() {
        return Month;
    }

    /**
     * Set the value of Month
     *
     * @param Month new value of Month
     */
    public void setMonth(int Month) {
        this.Month = Month;
    }

    /**
     * Get the value of Year
     *
     * @return the value of Year
     */
    public int getYear() {
        return Year;
    }

    /**
     * Set the value of Year
     *
     * @param Year new value of Year
     */
    public void setYear(int Year) {
        this.Year = Year;
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
    public String toString() {
        return "Vehicle{" + "Model=" + Model + ", Year=" + Year + ", Month=" + Month + ", fuelEconomy=" + fuelEconomy + '}';
    }

}
