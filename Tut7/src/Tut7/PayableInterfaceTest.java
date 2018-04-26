/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tut7;

/**
 *
 * @author John Barber (john.barber@cqumail.com)
 */
public class PayableInterfaceTest
{
    public static void main(String[] args)
    {
        Payable[] payableObjects = new Payable[3];
        
        payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
        payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
        payableObjects[2] = new SalariedEmployee("John", "Barber", "926838543H", 800.00);
        
        System.out.println("Invoices and Employees processed polymorphically");
        
        for (Payable currentPayable: payableObjects)
        {
            System.out.printf("%s\n", currentPayable.toString());
            
            System.out.printf("%s: %.2f\n\n", "payment due", currentPayable.getPayableAmount());
            
        }
    }
    
}
