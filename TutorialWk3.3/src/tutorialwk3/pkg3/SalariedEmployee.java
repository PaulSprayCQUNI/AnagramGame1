/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialwk3.pkg3;

/**
 *
 * @author 12084819
 */
public class SalariedEmployee extends Employee {

    private double salary;

    @Override
    public double earnings() {
        return salary;
    }

    public SalariedEmployee(double salary) {
        this.salary = salary;
    }

    public SalariedEmployee() {
        this.salary = 0;
    }

    public SalariedEmployee(String firstName, String lastName, int socialSecurityNumber, double salary) {
        super(firstName, lastName, socialSecurityNumber);
        this.salary = salary;
    }

    /**
     * Get the value of salary
     *
     * @return the value of salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Set the value of salary
     *
     * @param salary new value of salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "SalariedEmployee{" + "earnings=" + earnings() + '}';
    }

}
