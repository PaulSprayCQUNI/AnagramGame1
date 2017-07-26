/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savingsaccounttest;

/**
 *
 * @author Steve Barnett
 */
public class SavingsAccount
{

    private double savingBalance;
    private static double annualInterestRate;

    public SavingsAccount(double savingBalance)
    {
        this.savingBalance = savingBalance;
    }

    /**
     * Get the value of annualInterestRate
     *
     * @return the value of annualInterestRate
     */
    public static double getAnnualInterestRate()
    {
        return annualInterestRate;
    }

    /**
     * Set the value of annualInterestRate
     *
     * @param annualInterestRate new value of annualInterestRate
     */
    public static void setAnnualInterestRate(double annualInterestRate)
    {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    /**
     * Get the value of savingBalance
     *
     * @return the value of savingBalance
     */
    public double getSavingBalance()
    {
        return savingBalance;
    }

    /**
     * Set the value of savingBalance
     *
     * @param savingBalance new value of savingBalance
     */
    public void setSavingBalance(double savingBalance)
    {
        this.savingBalance = savingBalance + calculateMonthlyInterest();
    }

    public double calculateMonthlyInterest()
    {
        savingBalance += savingBalance * (annualInterestRate / 12);
        return savingBalance;
    }

    public static void modifyInterestRate(double newRate)
    {
        annualInterestRate = newRate;
    }

    @Override
    public String toString()
    {
        return "SavingsAccount{" + "savingBalance=" + savingBalance + '}';
    }

}
