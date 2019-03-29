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
public class RoomRental extends Rental {

    private boolean couplesAllowed;
    private boolean hasEnsuite;

    public RoomRental() {
        this.couplesAllowed = false;
        this.hasEnsuite = false;
    }

    public RoomRental(boolean couplesAllowed, boolean hasEnsuite) {
        this.couplesAllowed = couplesAllowed;
        this.hasEnsuite = hasEnsuite;
    }

    public RoomRental(String rentalID, Address address, double weeklyPrice, boolean furnished, 
            String description, boolean couplesAllowed, boolean hasEnsuite) {
        super(rentalID, address, weeklyPrice, furnished, description);
        this.couplesAllowed = couplesAllowed;
        this.hasEnsuite = hasEnsuite;
    }
    
    

    
    public boolean areCouplesAllowed() {
        return couplesAllowed;
    }

    public void setCouplesAllowed(boolean couplesAllowed) {
        this.couplesAllowed = couplesAllowed;
    }

    public boolean hasEnsuite() {
        return hasEnsuite;
    }

    public void setHasEnsuite(boolean hasEnsuite) {
        this.hasEnsuite = hasEnsuite;
    }

    @Override
    public String toString() {
        return super.toString() + "RoomRental{" + "couplesAllowed=" + couplesAllowed + ", hasEnsuite=" + hasEnsuite + '}';
    }

    

}
