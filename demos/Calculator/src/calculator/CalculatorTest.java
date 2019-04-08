/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author sgordon
 */
public class CalculatorTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    EventQueue.invokeLater(() -> {
         CalculatorFrame frame = new CalculatorFrame();
         frame.setTitle("Calculator");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });

    }    
}
