/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VehicleDemo;

/**
 *
 * @author 12084819
 */
public class Vehicle {

private String model;
private String buildDate;
private double fuelEconomy;

    public Vehicle() {
        this.model = "";
        this.buildDate = "";
        this.fuelEconomy = 0.0;
    }


    public Vehicle(String model, String buildDate, double fuelEconomy) {
        this.model = model;
        this.buildDate = buildDate;
        this.fuelEconomy = fuelEconomy;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBuildDate() {
        return buildDate;
    }

    public void setBuildDate(String buildDate) {
        this.buildDate = buildDate;
    }

    public double getFuelEconomy() {
        return fuelEconomy;
    }

    public void setFuelEconomy(double fuelEconomy) {
        this.fuelEconomy = fuelEconomy;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "model=" + model + ", buildDate=" + buildDate + ", fuelEconomy=" + fuelEconomy + '}';
    }

    

}
