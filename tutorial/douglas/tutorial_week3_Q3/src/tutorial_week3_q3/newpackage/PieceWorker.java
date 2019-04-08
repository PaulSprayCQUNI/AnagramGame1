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
public class PieceWorker extends Employee {

    private double wage;

    private double pieces;

    public PieceWorker(String firstName, String lastName, double socialSecurityNumber, double wage, double pieces) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.pieces = pieces;
    }
    
    
    
    public PieceWorker(double wage, double pieces){
        this.wage = wage;
        this.pieces = pieces; 
    }

    public double earnings (){
        return wage * pieces; 
    } 
    
    /**
     * Get the value of pieces
     *
     * @return the value of pieces
     */
    public double getPieces() {
        return pieces;
    }

    /**
     * Set the value of pieces
     *
     * @param pieces new value of pieces
     */
    public void setPieces(double pieces) {
        this.pieces = pieces;
    }

    /**
     * Get the value of wage
     *
     * @return the value of wage
     */
    public double getWage() {
        return wage;
    }

    /**
     * Set the value of wage
     *
     * @param wage new value of wage
     */
    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "PieceWorker{" + "wage=" + wage + ", pieces=" + pieces + '}';
    }
    
    
    

}
