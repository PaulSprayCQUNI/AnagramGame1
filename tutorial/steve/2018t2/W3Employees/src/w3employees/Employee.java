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
public abstract class Employee {
    
    private String firstName;
    private String lastName;
    private int taxFileNumber;
    private int hireYear;
    private String department;
    
    public Employee() {
        this.firstName = "";
        this.lastName = "";
        this.taxFileNumber = 0;
        this.hireYear = 2018;
        this.department = "";
    }

    public Employee(String firstName, String lastName, int taxFileNumber, int hireYear, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.taxFileNumber = taxFileNumber;
        this.hireYear = hireYear;
        this.department = department;
    }

    
    /**
     * Get the value of department
     *
     * @return the value of department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Set the value of department
     *
     * @param department new value of department
     */
    public void setDepartment(String department) {
        this.department = department;
    }


    /**
     * Get the value of hireYear
     *
     * @return the value of hireYear
     */
    public int getHireYear() {
        return hireYear;
    }

    /**
     * Set the value of hireYear
     *
     * @param hireYear new value of hireYear
     */
    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }


    /**
     * Get the value of taxFileNumber
     *
     * @return the value of taxFileNumber
     */
    public int getTaxFileNumber() {
        return taxFileNumber;
    }

    /**
     * Set the value of taxFileNumber
     *
     * @param taxFileNumber new value of taxFileNumber
     */
    public void setTaxFileNumber(int taxFileNumber) {
        this.taxFileNumber = taxFileNumber;
    }


    /**
     * Get the value of lastName
     *
     * @return the value of lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set the value of lastName
     *
     * @param lastName new value of lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    /**
     * Get the value of firstName
     *
     * @return the value of firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set the value of firstName
     *
     * @param firstName new value of firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    public abstract double earnings();
    
    @Override
    public String toString() {
        // "Employee is Steven Gordon. SSN = 123456."
        // "Employee is " firstName lastName ". SSN = " ssn
        return "Employee{\n\t" + "firstName=" + firstName + ", lastName=" + lastName + ", taxFileNumber=" + taxFileNumber + ", hireYear=" + hireYear + ", department=" + department + '}';
    }

}
