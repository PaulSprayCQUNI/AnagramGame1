/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s0287181
 */
public class SalariedEmployee extends Employee{
    
    private double weeklySalary;

    public SalariedEmployee(double weeklySalary, String firstName, String lastName, int socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }
        
    /**
     * Get the value of weeklySalary
     *
     * @return the value of weeklySalary
     */
    public double getWeeklySalary() {
        return weeklySalary;
    }

    /**
     * Set the value of weeklySalary
     *
     * @param weeklySalary new value of weeklySalary
     */
    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
    
    @Override
    public double earnings (){
        return weeklySalary;
    }
    
    @Override
    public String toString() {
        return "SalariedEmployee{" + "weeklySalary=" + weeklySalary + '}';
    }
    
}
