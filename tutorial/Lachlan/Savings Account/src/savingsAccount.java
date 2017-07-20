/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LachlanRGaming
 */
public class savingsAccount {
    
    public static void setAnnualInterestRate(double annualInterestRate) {
        savingsAccount.annualInterestRate = annualInterestRate;
    }

    public savingsAccount(double balance) {
        this.balance = balance;
    }
   
    
    private double balance;

    /**
     * Get the value of balance
     *
     * @return the value of balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Set the value of balance
     *
     * @param balance new value of balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

        private static double annualInterestRate;

    /**
     * Get the value of annualInterestRate
     *
     * @return the value of annualInterestRate
     */
    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    @Override
    public String toString() {
        return "savingsAccount{" + "balance=" + balance + '}';
    }

    /**
     * Set the value of annualInterestRate
     *
     * @param annualInterestRate new value of annualInterestRate
     */
    
    

}
