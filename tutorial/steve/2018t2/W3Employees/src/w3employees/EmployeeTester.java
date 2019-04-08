/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3employees;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class EmployeeTester {
    
    public static void main(String[] args) {
       
        /* Testing printing strings */
        System.out.println("Hello");
        System.out.println("Hello" + " " + "Steven");
        String firstName = "Steven";
        System.out.println("Hello" + " " + firstName); 
        
        /* Cannot create an Employee since an abstract class */
//Employee e1 = new Employee("Steven","Gordon",123456,2016,"Engineering");
        //System.out.println(e1);
 
        
        PieceWorker p1 = new PieceWorker("Jamie","Shield",987654,2015,"Accounting",15.0,5);
        System.out.println(p1);
        System.out.println(p1.earnings());
        
        
        SalariedEmployee s1 = new SalariedEmployee("Biplob", "Ray", 120056,2014,"Finance",1000.0);
        System.out.println(s1);
        System.out.println(s1.earnings());

    }
    
}