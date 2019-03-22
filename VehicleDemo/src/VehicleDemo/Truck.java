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
public class Truck extends Vehicle{
    private double loadMax;
    
    public Truck(){
        super();
        loadMax =0.0;
    }

    public Truck(double loadMax) {
        this.loadMax = loadMax;
    }

    public Truck(String model, String buildDate, double fuelEconomy, double loadMax) {
        super(model, buildDate, fuelEconomy);
        this.loadMax = loadMax;
    }

    public double getLoadMax() {
        return loadMax;
    }

    public void setLoadMax(double loadMax) {
        this.loadMax = loadMax;
    }

    @Override
    public String toString() {
        return super.toString() + "Truck{" + "loadMax=" + loadMax + '}';
    }
    
            
}
