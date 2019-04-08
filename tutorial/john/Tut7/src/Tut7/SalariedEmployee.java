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
public class SalariedEmployee extends Employee
{
    private double weeklySalary;
  
    SalariedEmployee(String firstName, String lastName, String socialSecurity, double weeklySalary)
    {
        super.setFirstName(firstName);
        super.setLastName(lastName);
        super.setSocialSecurityNumber(socialSecurity);
        this.weeklySalary = weeklySalary;
    }
    
    @Override
    public double getPayableAmount()
    {
        return weeklySalary;
    }
    
    @Override
    public String toString()
    {
        return super.getFirstName() + " " + super.getLastName();
    }
}
