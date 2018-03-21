/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.time.LocalDate;

/**
 *
 * @author s0287181
 */
public class VehiclesTest {
    
    public static void main(String[] args) {
        Vehicle[] vehicleList = new Vehicle [4];
        
        vehicleList[0] = new Vehicle("Ford", LocalDate.of(2016, 6, 7), 23.0);
        vehicleList[1] = new Vehicle("Jeep", LocalDate.of(2015, 5, 6), 40.0);
        vehicleList[2] = new Car("BMW", LocalDate.of(2017, 5, 3), 60.0, 5);
        vehicleList[3] = new Truck("Mack", LocalDate.of(2012, 7, 2), 40.0, 5.0);
        
        for (Vehicle v : vehicleList){
        System.out.println(v);
        }
    }
}
