/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FSAApp;

/**
 *
 * @author 12084819
 */
public abstract class Rental {

    private String rentalID;
    private Address address;
    private double weeklyPrice;
    private boolean furnished;
    private String description;

    public Rental() {
        this.rentalID = "";
        this.address = new Address();
        this.weeklyPrice = 0;
        this.furnished = false;
        this.description = "";
    }

    public Rental(String rentalID, Address address, double weeklyPrice, boolean furnished, String description) {
        this.rentalID = rentalID;
        this.address = address;
        this.weeklyPrice = weeklyPrice;
        this.furnished = furnished;
        this.description = description;
    }
    
    public Rental(String rentalID, String streetNumber, String streetName, String cityName, String postCode, String state, double weeklyPrice, boolean furnished, String description) {
        this.rentalID = rentalID;
        this.address = new Address();
        this.weeklyPrice = weeklyPrice;
        this.furnished = furnished;
        this.description = description;
    }
    
    

    /**
     * Get the value of description
     *
     * @return the value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the value of description
     *
     * @param description new value of description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get the value of furnished
     *
     * @return the value of furnished
     */
    public boolean isFurnished() {
        return furnished;
    }

    /**
     * Set the value of furnished
     *
     * @param furnished new value of furnished
     */
    public void setFurnished(boolean furnished) {
        this.furnished = furnished;
    }

    /**
     * Get the value of address
     *
     * @return the value of address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Set the value of address
     *
     * @param address new value of address
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * Get the value of rentalID
     *
     * @return the value of rentalID
     */
    public String getRentalID() {
        return rentalID;
    }

    /**
     * Set the value of rentalID
     *
     * @param rentalID new value of rentalID
     */
    public void setRentalID(String rentalID) {
        this.rentalID = rentalID;
    }

    /**
     * Get the value of weeklyPrice
     *
     * @return the value of weeklyPrice
     */
    public double getWeeklyPrice() {
        return weeklyPrice;
    }

    /**
     * Set the value of weeklyPrice
     *
     * @param weeklyPrice new value of weeklyPrice
     */
    public void setWeeklyPrice(double weeklyPrice) {
        this.weeklyPrice = weeklyPrice;
    }

    @Override
    public String toString() {
        return "Rental{" + "rentalID=" + rentalID + ", address=" + address + ", weeklyPrice=" + weeklyPrice + ", furnished=" + furnished + ", description=" + description + '}';
    }

   

}
