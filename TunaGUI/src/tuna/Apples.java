/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuna;

/**
 *
 * @author Paul Spray <paul.spray@cqumail.com>
 */

import javax.swing.JFrame;

public class Apples {
    
    public static void main(String[] args) {
        
        Tuna bucky = new Tuna();
        bucky.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);           // one the object is constructed, make sure there is a default close operation
        bucky.setSize(350, 100);
        bucky.setVisible(true);                                         //use false for certain object/method in assigment
        
/*
String firstNumber = JOptionPane.showInputDialog ("Enter first number: ");          // basic JOptionPane two box entry, sum display GUI
        String secondNumber = JOptionPane.showInputDialog ("Enter first number: ");
        
        int num1 = Integer.parseInt(firstNumber);
        int num2 = Integer.parseInt(secondNumber);
        int sum = num1 + num2;
        
        JOptionPane.showMessageDialog(null, "The answer is " +sum, "the title", JOptionPane.PLAIN_MESSAGE);
        
        
*/
    }
    
}
