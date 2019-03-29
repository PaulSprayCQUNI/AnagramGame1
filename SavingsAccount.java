/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SavingsAccount;


/**
 *
 * @author 12084819
 */
public class SavingsAccount {

    private double savingBalance;
    private static double annualInterestRate;

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }
    
    
            
    /**
     *
     * @return
     */
         
public double calculateMonthlyInterest(){
        double monthlyInterest;
        monthlyInterest = (savingBalance * annualInterestRate) / 12;
        return monthlyInterest;
    }

}    
