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
public class SalariedEmployee extends Employee {
    
    private double salary;

    public SalariedEmployee() {
        super();
        this.salary = salary;
    }

    public SalariedEmployee(String firstName, String lastName, int taxFileNumber, int hireYear, String department, double salary) {
        super(firstName, lastName, taxFileNumber, hireYear, department);
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

    public double earnings() {
        return this.salary;
    }
    
    @Override
    public String toString() {
        return "SalariedEmployee{" + super.toString() + " salary=" + salary + '}';
    }

    
    
}
