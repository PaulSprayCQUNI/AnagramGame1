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
public class Car extends Vehicle{
    
    private int maxPass;

    public Car(String model, double economy, String YearMonth, int maxPass) {
        super(model, economy, YearMonth);
        this.maxPass = maxPass;
    }




    /**
     * Get the value of MaxPass
     *
     * @return the value of MaxPass
     */
    public int getMaxPass() {
        return maxPass;
    }

    /**
     * Set the value of MaxPass
     *
     * @param MaxPass new value of MaxPass
     */
    public void setMaxPass(int MaxPass) {
        this.maxPass = maxPass;
    }

    @Override
    public String toString() {
        return "Car{" + "Maximum Passengers=" + maxPass + '}' + super.toString();
    }

}
