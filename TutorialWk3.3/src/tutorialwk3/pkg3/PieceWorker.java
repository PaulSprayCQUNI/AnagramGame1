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
public class PieceWorker extends Employee {

    private double wage;
    private double pieces;

    @Override
    public double earnings() {
        double earnings = wage * pieces;
        return earnings;
    }

    public PieceWorker() {
        this.wage = 0;
        this.pieces = 0;
    }

    public PieceWorker(String firstName, String lastName, int socialSecurityNumber, double wage, double pieces) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.pieces = pieces;
    }

    public PieceWorker(double wage, double pieces) {
        this.wage = wage;
        this.pieces = pieces;
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
        return super.toString() + "PieceWorker{" + "wage=" + wage + ", pieces=" + pieces + ", earnings=" + earnings() + '}';
    }

}
