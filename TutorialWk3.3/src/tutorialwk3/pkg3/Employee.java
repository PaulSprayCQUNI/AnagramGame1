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
public abstract class Employee {

    private String firstName;
    private String lastName;
    private int socialSecurityNumber;

    public abstract double earnings();

    public Employee() {
        this.firstName = "";
        this.lastName = "";
        this.socialSecurityNumber = 0;
    }

    public Employee(String firstName, String lastName, int socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    /**
     * Get the value of socialSecurityNumber
     *
     * @return the value of socialSecurityNumber
     */
    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * Set the value of socialSecurityNumber
     *
     * @param socialSecurityNumber new value of socialSecurityNumber
     */
    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
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

    @Override
    public String toString() {
        return "Employee{" + "firstName=" + firstName + ", lastName=" + lastName + ", socialSecurityNumber=" + socialSecurityNumber + '}';
    }

}
