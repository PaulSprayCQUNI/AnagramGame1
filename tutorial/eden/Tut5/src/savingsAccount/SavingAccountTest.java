/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savingsAccount;

/**
 *
 * @author Eden
 */
public class SavingAccountTest {
    public static void main(String[] args) {
        savingsAccount Saver1 = new savingsAccount();
        savingsAccount Saver2 = new savingsAccount();
        
        savingsAccount.modifyInterestRate(0.04);
        System.out.println(savingsAccount.getAnnualInterestRate());
        
        Saver1.setSavingBalance(2000);
        Saver2.setSavingBalance(3000);
        
        Saver1.calculateMonthlyInterest();
        Saver2.calculateMonthlyInterest();
        System.out.println("saver 1 " + Saver1.getSavingBalance());
        System.out.println("saver 2 " + Saver2.getSavingBalance());
        
               
    }
}
