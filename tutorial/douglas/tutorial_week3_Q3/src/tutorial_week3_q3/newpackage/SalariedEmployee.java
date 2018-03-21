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
public class SalariedEmployee extends Employee {

    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, double socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);

        this.weeklySalary = weeklySalary;

    }

    public double earnings() {
        return weeklySalary;
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

}
