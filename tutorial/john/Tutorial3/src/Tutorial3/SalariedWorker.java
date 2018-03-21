/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial3;

/**
 *
 * @author John Barber <john.barber@cqumail.com>
 */
public class SalariedWorker extends Employee
{
    private double salary;
    
    SalariedWorker(String firstName, String lastName, String socSecurity, double salary)
    {
        super(firstName, lastName, socSecurity);
        this.salary = salary;
    }
    
    @Override
    public double getEarnings()
    {
        return salary;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + " salary:" + this.getEarnings();
    }
}
