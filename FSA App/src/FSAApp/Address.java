/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FSAApp;

/**
 *
 * @author 12084819
 * class Address created to break-down object of type Address in class Rental
 * into 5 appropriate variables of type String to be entered by the user
 */
public class Address {

    private String streetNumber;
    private String streetName;
    private String cityName;
    private String postCode;
    private String state;

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


    public Address() {
        this.streetNumber = "";
        this.streetName = "";
        this.cityName = "";
        this.postCode = "";
        this.state = "";
    }

    public Address(String streetNumber, String streetName, String cityName, String postCode, String state) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.cityName = cityName;
        this.postCode = postCode;
        this.state = state;
    }

    /**
     * Get the value of postCode
     *
     * @return the value of postCode
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Set the value of postCode
     *
     * @param postCode new value of postCode
     */
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    /**
     * Get the value of cityName
     *
     * @return the value of cityName
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Set the value of cityName
     *
     * @param cityName new value of cityName
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * Get the value of streetName
     *
     * @return the value of streetName
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Set the value of streetName
     *
     * @param streetName new value of streetName
     */
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    /**
     * Get the value of streetNumber
     *
     * @return the value of streetNumber
     */
    public String getStreetNumber() {
        return streetNumber;
    }

    /**
     * Set the value of streetNumber
     *
     * @param streetNumber new value of streetNumber
     */
    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    @Override
    public String toString() {
        return "Address{" + "streetNumber=" + streetNumber + ", streetName=" + streetName + ", cityName=" + cityName + ", postCode=" + postCode + ", state=" + state + '}';
    }

}
