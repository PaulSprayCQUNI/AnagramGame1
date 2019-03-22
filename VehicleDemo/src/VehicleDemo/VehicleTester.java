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
public class VehicleTester extends Vehicle {
    
    public static void main(String[] args) {
        
        Car c1;
        c1 = new Car ("Toyota", "Jan2019", 6.0, 5);
        //System.out.println(c1);
        
        Truck t1;
        t1 = new Truck ("Hino", "Mar2018", 10.0, 4.0);
        //System.out.println(t1);
        
        Vehicle [] fleet = new Vehicle [3];
        
        fleet[0] = new Truck ("Hino", "Mar2018", 10.0, 4.0);
        fleet [1] = new Truck ("BigT", "Feb2017", 8.0, 6.7);
        fleet [2] = new Car ("Toyota", "Jan2019", 6.0, 5);
        
        for (Vehicle f : fleet)
        {
            System.out.println(f);        }
    }
    
}
