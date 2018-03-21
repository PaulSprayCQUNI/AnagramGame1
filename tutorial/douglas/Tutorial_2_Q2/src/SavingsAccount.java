/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Douglas Wheatley <douglas.wheatley@cqumail.com>
 */
public class SavingsAccount {
   
        private double savingBalance;

    private static double annualInteresRate = 0.04;

    /**
     * Get the value of annualInteresRate
     *
     * @return the value of annualInteresRate
     */
    public static double getAnnualInteresRate() {
        return annualInteresRate;
    }

    /**
     * Set the value of annualInteresRate
     *
     * @param annualInteresRate new value of annualInteresRate
     */
    public static void setAnnualInteresRate(double annualInteresRate) {
        SavingsAccount.annualInteresRate = annualInteresRate;
    }

    /**
     * Get the value of savingBalance
     *
     * @return the value of savingBalance
     */
    public double getSavingBalance() {
        return savingBalance;
    }

    /**
     * Set the value of savingBalance
     *
     * @param savingBalance new value of savingBalance
     */
    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

   public double calculateMonthlyInterest (){
      return savingBalance * annualInteresRate / 12;
   }
    
   public double calculateYearlyInterest(){
      
   }
    
    
    
   
    
    
    
}
