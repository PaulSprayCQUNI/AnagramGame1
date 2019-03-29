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
public class WholeRental extends Rental {

    private int numRooms;
    private int numBathrooms;
    private boolean hasGarage;
    private boolean petsOK;

    public WholeRental() {
        this.numRooms = 0;
        this.numBathrooms = 0;
        this.hasGarage = false;
        this.petsOK = false;
    }

    public WholeRental(int numRooms, int numBathrooms, boolean hasGarage, boolean petsOK, String rentalID, Address address, double weeklyPrice, boolean furnished, String description) {
        super(rentalID, address, weeklyPrice, furnished, description);
        this.numRooms = numRooms;
        this.numBathrooms = numBathrooms;
        this.hasGarage = hasGarage;
        this.petsOK = petsOK;
    }

    public WholeRental(int numRooms, int numBathrooms, boolean hasGarage, boolean petsOK) {
        this.numRooms = numRooms;
        this.numBathrooms = numBathrooms;
        this.hasGarage = hasGarage;
        this.petsOK = petsOK;
    }

    /**
     * Get the value of petsOK
     *
     * @return the value of petsOK
     */
    public boolean isPetsOK() {
        return petsOK;
    }

    /**
     * Set the value of petsOK
     *
     * @param petsOK new value of petsOK
     */
    public void setPetsOK(boolean petsOK) {
        this.petsOK = petsOK;
    }

    /**
     * Get the value of hasGarage
     *
     * @return the value of hasGarage
     */
    public boolean isHasGarage() {
        return hasGarage;
    }

    /**
     * Set the value of hasGarage
     *
     * @param hasGarage new value of hasGarage
     */
    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    /**
     * Get the value of numBathrooms
     *
     * @return the value of numBathrooms
     */
    public int getNumBathrooms() {
        return numBathrooms;
    }

    /**
     * Set the value of numBathrooms
     *
     * @param numBathrooms new value of numBathrooms
     */
    public void setNumBathrooms(int numBathrooms) {
        this.numBathrooms = numBathrooms;
    }

    /**
     * Get the value of numRooms
     *
     * @return the value of numRooms
     */
    public int getNumRooms() {
        return numRooms;
    }

    /**
     * Set the value of numRooms
     *
     * @param numRooms new value of numRooms
     */
    public void setNumRooms(int numRooms) {
        this.numRooms = numRooms;
    }

    @Override
    public String toString() {
        return super.toString() + "WholeRental{" + "numRooms=" + numRooms + ", numBathrooms=" + numBathrooms + ", hasGarage=" + hasGarage + ", petsOK=" + petsOK + '}';
    }

}
