/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Douglas Wheatley <douglas.wheatley@cqumail.com>
 */
public class savingsAccountTest {

    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount();

        SavingsAccount s2 = new SavingsAccount();

        s1.setSavingBalance(2000);
        s2.setSavingBalance(3000);

        System.out.println(s1.getSavingBalance());
        System.out.println(s2.getSavingBalance());
        
        System.out.println(s1.calculateMonthlyInterest());
        System.out.println(s2.calculateMonthlyInterest());
        
        

    }
}
