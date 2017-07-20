/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicletest;

/**
 *
 * @author Steve Barnett
 */
public class Vehicle {
   
    private String model;
    private double economy;    
    private String YearMonth;

    public Vehicle() {
    }

    public Vehicle(String model, double economy, String YearMonth) {
        this.model = model;
        this.economy = economy;
        this.YearMonth = YearMonth;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEconomy() {
        return economy;
    }

    public void setEconomy(double economy) {
        this.economy = economy;
    }

    public String getYearMonth() {
        return YearMonth;
    }

    public void setYearMonth(String YearMonth) {
        this.YearMonth = YearMonth;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "model=" + model + ", economy=" + economy + ", YearMonth=" + YearMonth + '}';
    }
    
    


}
