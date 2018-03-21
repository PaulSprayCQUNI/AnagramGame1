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
public class Truck extends Vehicle
{
    private double loadingCapacity;

    public Truck(String description, int year, int month, double economy, double capacity)
    {
        super(description, year, month, economy);
        this.loadingCapacity = capacity;
    }
    
    Truck()
    {
        super();
        this.loadingCapacity = 10;
                
    }
    
    public double getLoadingCapacity()
    {
        return this.loadingCapacity;
    }
    
    public void setLoadingCapacity(double loading)
    {
        this.loadingCapacity = loading;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + " Loading Capacity: " + this.getLoadingCapacity();
    }
   
    
    
}
