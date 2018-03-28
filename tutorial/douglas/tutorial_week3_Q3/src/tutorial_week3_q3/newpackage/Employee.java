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
public abstract class Employee {
    
    

    private String firstName;

    private String lastName;

    private double socialSecurityNumber;
    
    
    public Employee (String firstName, String lastName, double socialSecurityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber; 
    }
    
    public Employee(){
        this.firstName = "Timbo";
        this.lastName = "Jason";
        this.socialSecurityNumber = 1.0; 
    }
   
    public abstract double earnings(); 
      

    /**
     * Get the value of socialSecurityNumber
     *
     * @return the value of socialSecurityNumber
     */
    public double getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * Set the value of socialSecurityNumber
     *
     * @param socialSecurityNumber new value of socialSecurityNumber
     */
    public void setSocialSecurityNumber(double socialSecurityNumber) {
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
