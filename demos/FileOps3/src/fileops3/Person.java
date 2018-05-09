/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileops3;

import java.util.ArrayList;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class Person {

    private String firstName;
    private String lastName;
    private Integer yearOfBirth;   
    private ArrayList<Address> addressList;


    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.yearOfBirth = 0;
        this.addressList = new ArrayList<>();
    }

    public Person(String firstName, String lastName, Integer yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.addressList = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    
        /**
     * Get the value of addressList
     *
     * @return the value of addressList
     */
    public ArrayList<Address> getAddressList() {
        return addressList;
    }

    /**
     * Set the value of addressList
     *
     * @param addressList new value of addressList
     */
    public void setHome(ArrayList<Address> addressList) {
        this.addressList = addressList;
    }

    public void addAddress(Address a) {
        this.addressList.add(a);
    }
    
    @Override
    public String toString() {
        return firstName + " " + lastName + " " + yearOfBirth + " " + addressList;
    }
}
