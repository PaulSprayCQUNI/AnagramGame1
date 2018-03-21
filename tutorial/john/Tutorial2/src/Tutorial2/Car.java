/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial2;

/**
 *
 * @author John Barber (john.barber@cqumail.com)
 */
public class Car extends Vehicle
{
    private byte maxPassengers;
    
    Car(String description, int year, int month, double economy, byte passengers)
    {
        super(description,year,month,economy);
        this.maxPassengers = passengers;
    }
    
    Car()
    {
       super();
       this.maxPassengers = 0;
    }
    
    public byte getMaxPassengers()
    {
        return maxPassengers;
    }
    public void setMaxPassengers(byte max)
    {
        this.maxPassengers = max;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + " Max Passengers: " + this.getMaxPassengers();
    }
    
}
