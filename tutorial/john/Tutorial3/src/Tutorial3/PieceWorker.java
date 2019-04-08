/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial3;

/**
 *
 * @author John Barber <john.barber@cqumail.com>
 */
public class PieceWorker extends Employee
{
    private double wage;
    private int pieces;
    
    PieceWorker(String firstName, String lastName, String socialSecurity, double wage, int pieces)
    {
        super(firstName, lastName, socialSecurity);
        this.wage = wage;
        this.pieces = pieces;
    }
    
    public void setWages(double wages)
    {
        this.wage = wages;
    }
    public double getWages()
    {
        return this.wage;
    }
    
    @Override
    public double getEarnings()
    {
        return (this.wage * this.pieces);
    }
    
    public void setPieces(int pieces)
    {
        this.pieces = pieces;
    }
    
    public int getPieces()
    {
        return pieces;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + " Earnings:" + this.getEarnings();
    }
}
