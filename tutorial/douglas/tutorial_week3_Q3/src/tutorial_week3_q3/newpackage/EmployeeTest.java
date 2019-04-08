/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial_week3_q3.newpackage;

/**
 *
 * @author Douglas Wheatley <douglas.wheatley@cqumail.com>
 */
public class EmployeeTest{
    
    
    public static void main(String[] args) {
        
           Employee [] employeeList = new Employee [3];
           
           employeeList [0] = new PieceWorker("Jimm", "Smith", 1.0, 50000.0, 2.0); 
           employeeList [1] = new PieceWorker("Jacko", "Lay", 1.0, 50000.0, 3.0);
           
           employeeList [2] = new SalariedEmployee ("Timbo", "Slice", 2.0, 800.0); 
           
           
          System.out.println(employeeList[0]);
          System.out.println(employeeList[1]);
          System.out.println(employeeList[2]);
          
          
         for (Employee el: employeeList) {
            System.out.println(el.earnings());
        }
           
           
           
        
        
    }
    
 
     
    
    
    
}
