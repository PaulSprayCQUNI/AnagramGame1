/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorial1Q2;

/**
 *
 * @author John Barber <john.barber@cqumail.com>
 */
public class SavingsAccount
{
    
    private double savingBalance = 0;
    private static double annualInterestRate;
    
    public SavingsAccount(double savings)
    {
        this.savingBalance = savings;
        
    }
    public SavingsAccount()
    {
    }
    public double calculateMonthlyInterest()
    {
        return ( savingBalance * annualInterestRate / 12);
    }
    public void updateSavingsMonthly()
    {
        savin
    }
    public static void modifyInterestRate(double newRateAsDecimal)
    {
        if (newRateAsDecimal > 0.0 && newRateAsDecimal < 1.0f)
            annualInterestRate = newRateAsDecimal;
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
        this.savingBalance = savingBalance;
    }

}
