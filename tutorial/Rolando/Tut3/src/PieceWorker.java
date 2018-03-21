/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s0287181
 */
public class PieceWorker extends Employee {
    
    private double wage;
    private int pieces;

    public PieceWorker(double wage, int pieces, String firstName, String lastName, int socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.pieces = pieces;
    }

    @Override
    public double earnings() {
        
        return wage*pieces;
    }

    @Override
    public String toString() {
        return "PieceWorker{" + "wage=" + wage + ", pieces=" + pieces + '}';
    }

}
