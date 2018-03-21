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
public class Tutorial2Main
{
    public static void main(String[] args)
    {
        Vehicle[] veh = new Vehicle[3];
        
        veh[0] = new Car("Holden", 2011, 9,6, (byte)5 );
        veh[1] = new Truck("Isazu", 2011, 9, 6, 20);
        veh[2] = new Car();
        
        veh[2].setDescription("Toyota Corolla");
        veh[2].setFuelEconomy(6);
        veh[2].setMonthOfMake(10);
        
        
        for (Vehicle v: veh)
        {
            System.out.println(v.toString());
        }
        
    }
}
