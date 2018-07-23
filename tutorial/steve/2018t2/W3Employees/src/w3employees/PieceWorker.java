/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3employees;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class PieceWorker extends Employee {
    
    private double wage;
    private int pieces;

    public PieceWorker() {
        super();
        this.wage = 0.0;
        this.pieces = 0;
    }

    public PieceWorker(String firstName, String lastName, int taxFileNumber, int hireYear, String department, double wage, int pieces) {
        super(firstName, lastName, taxFileNumber, hireYear, department);
        this.wage = wage;
        this.pieces = pieces;
    }
    
    /**
     * Get the value of pieces
     *
     * @return the value of pieces
     */
    public int getPieces() {
        return pieces;
    }

    /**
     * Set the value of pieces
     *
     * @param pieces new value of pieces
     */
    public void setPieces(int pieces) {
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
        return "PieceWorker{\n\t" + super.toString() + "\n\twage=" + wage + ", pieces=" + pieces + '}';
    }

    
}
