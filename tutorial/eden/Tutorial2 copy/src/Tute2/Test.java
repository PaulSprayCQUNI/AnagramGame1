/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tute2;

/**
 *
 * @author 12056070
 */
public class Test {
    public static void main(String[] args) {
       //Vehical.Vehical[1] = new Car();
       
       
       Vehical[] vec = new Vehical[3];
       
       vec[0] = new Car(5, " Volvo", "2005", 7); 
       vec[1] = new Truck(10, " Greatwall", "2010", 15);
       vec[2] = new Car (7, " Nissan", "2015", 11.5);
        
       for (Vehical v: vec){
           System.out.println(v.toString());
       }
    }
}
