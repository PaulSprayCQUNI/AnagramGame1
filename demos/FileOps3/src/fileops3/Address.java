/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileops3;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class Address {
    
    private String street;
    private String city;
    private Integer postCode;
    private String state;

    public Address() {
        this.street = "";
        this.city = "";
        this.postCode = 0;
        this.state = "";
    }

    public Address(String street, String city, Integer postCode, String state) {
        this.street = street;
        this.city = city;
        this.postCode = postCode;
        this.state = state;
    }
    

    /**
     * Get the value of state
     *
     * @return the value of state
     */
    public String getState() {
        return state;
    }

    /**
     * Set the value of state
     *
     * @param state new value of state
     */
    public void setState(String state) {
        this.state = state;
    }


    /**
     * Get the value of postCode
     *
     * @return the value of postCode
     */
    public Integer getPostCode() {
        return postCode;
    }

    /**
     * Set the value of postCode
     *
     * @param postCode new value of postCode
     */
    public void setPostCode(Integer postCode) {
        this.postCode = postCode;
    }


    /**
     * Get the value of city
     *
     * @return the value of city
     */
    public String getCity() {
        return city;
    }

    /**
     * Set the value of city
     *
     * @param city new value of city
     */
    public void setCity(String city) {
        this.city = city;
    }


    /**
     * Get the value of street
     *
     * @return the value of street
     */
    public String getStreet() {
        return street;
    }

    /**
     * Set the value of street
     *
     * @param street new value of Street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" + "street=" + street + ", city=" + city + ", postCode=" + postCode + ", state=" + state + '}';
    }

    
}
