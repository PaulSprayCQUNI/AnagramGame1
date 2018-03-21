package newpackage;

import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s0287181
 */
public class Car extends Vehicle{
    
    private int maxPassenger;

    public Car(String model, LocalDate manufactureDate, double fuelEconomy) {
        super(model, manufactureDate, fuelEconomy);
    }

    public Car() {
    }

    public Car(String model, LocalDate manufactureDate, double fuelEconomy, int maxPassenger) {
        super(model, manufactureDate, fuelEconomy);
        this.maxPassenger = maxPassenger;
    }

    
    /**
     * Get the value of maxPassenger
     *
     * @return the value of maxPassenger
     */
    public int getMaxPassenger() {
        return maxPassenger;
    }

    /**
     * Set the value of maxPassenger
     *
     * @param maxPassenger new value of maxPassenger
     */
    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    @Override
    public String toString() {
        return "Car{" + "maxPassenger=" + maxPassenger + '}';
    }
    

}
