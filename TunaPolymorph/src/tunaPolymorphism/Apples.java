/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunaPolymorphism;

/**
 *
 * @author Paul Spray <paul.spray@cqumail.com>
 */


public class Apples {
    
    public static void main(String[] args) {
        
       Fatty bucky = new Fatty();
       Food po = new PotPie();
       Food to = new Tuna();
       
       
       bucky.digest(po);
       bucky.digest(to);
        }
        
        
    }
