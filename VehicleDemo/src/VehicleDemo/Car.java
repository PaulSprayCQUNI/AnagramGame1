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
public class Car extends Vehicle {

    private int maxPax;
    
    public Car(){
        super();
        maxPax = 0;
    }

    public Car(String model, String buildDate, double fuelEconomy, int maxPax) {
        super(model, buildDate, fuelEconomy);
        this.maxPax= maxPax;
        
    }

    public int getMaxPax() {
        return maxPax;
    }

    public void setMaxPax(int maxPax) {
        this.maxPax = maxPax;
    }

    @Override
    public String toString() {
        return super.toString() + "Car{" + "maxPax=" + maxPax + '}';
    }

   

    
    
    

}
