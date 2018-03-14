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
public class VehicleTest {
    
    public static void main(String[] args) {
        //Vehicle v1 = new Vehicle("Holden",2005,4);
       // Car c1 = new Car ("Ford",2013,11,5);
        //Truck t1 = new Truck ("Toyota",1998,5,3000.0);
        
        //System.out.println (v1);
        //System.out.println (c1);
        //System.out.println (t1);
        
        Vehicle[] vehicles = new Vehicle [3];
       
        
        vehicles [0] = new Vehicle("Holden",2005,4);
        vehicles [1] = new Car ("Ford",2013,11,5);
        vehicles [2] = new Truck ("Toyota",1998,5,3000.0);
        
        
      //  System.out.println(vehicles[0]);
        //System.out.println(vehicles [1]);
        //System.out.println(vehicles [2]);
        
        for (Vehicle v: vehicles) {
            System.out.println(v);
        }
        
    }
    
    
}
