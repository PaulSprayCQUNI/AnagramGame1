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
public class VehicleTest {

    public static void main(String[] args) {
        Vehicle[] v = new Vehicle[3];

        v[0] = new Truck("Scania", 20.0, "2015-13", 28.3);
        v[1] = new Car("Prado", 10.2, "2009-04", 7);
        v[2] = new Car("Golf", 7.2, "2010-04", 5);

        for (Vehicle x : v) {
            System.out.print(x);

        }
    }

}
