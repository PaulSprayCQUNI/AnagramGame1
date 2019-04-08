/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedemo1;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class EmployeeTester {
    public static void main(String[] args) {
        Employee[] elist = new Employee[2];

        elist[0] = new Employee();
        //System.out.println(elist[0]);
        
        elist[1] = new Manager("Jamie", "Shield", 200000.0, 50000.0);
        //System.out.println(elist[1]);
        
        for (Employee e: elist) {
            System.out.println(e.getSalary());
            
        }
        
        
    }
    
}
