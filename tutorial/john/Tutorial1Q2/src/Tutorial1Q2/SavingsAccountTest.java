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
public class SavingsAccountTest
{
    public static void main(String[] args)
    {
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();
        
        double saver1Money = 0;
        double saver2Money = 0;
        
        saver1.setSavingBalance(2000);
        saver2.setSavingBalance(3000);
        
        SavingsAccount.modifyInterestRate(0.04);
        
        saver1.setSavingBalance(saver1.getSavingBalance() + saver1.calculateMonthlyInterest());
        
        System.out.println("Saver1 " + saver1.getSavingBalance());
        /*for (int i = 0; i < 12; i++)
        {
            saver1.c
        }*/
        }
    }
