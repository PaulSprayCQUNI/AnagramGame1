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
public abstract class Employee
{
    
    private String socialSecurityNumber;
    private String lastName;
    private String firstName;
    
    Employee(String firstName, String lastName, String socialSecurity)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurity;       
        
    }
    
    public abstract double getEarnings();
    
    /**
     * Get the value of socialSecurityNumber
     *
     * @return the value of socialSecurityNumber
     */
    public String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    }

    /**
     * Set the value of socialSecurityNumber
     *
     * @param socialSecurityNumber new value of socialSecurityNumber
     */
    public void setSocialSecurityNumber(String socialSecurityNumber)
    {
        this.socialSecurityNumber = socialSecurityNumber;
    }


    @Override
    public String toString()
    {
        return this.getFirstName() + " " + this.getLastName() + " " + this.getSocialSecurityNumber();
    }

    /**
     * Get the value of lastName
     *
     * @return the value of lastName
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * Set the value of lastName
     *
     * @param lastName new value of lastName
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }



    /**
     * Get the value of firstName
     *
     * @return the value of firstName
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * Set the value of firstName
     *
     * @param firstName new value of firstName
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    
}
