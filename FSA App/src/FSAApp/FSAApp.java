/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FSAApp;

/**
 *
 * @author 12084819
 */

import java.awt.EventQueue;
import javax.swing.JFrame;

   
public class FSAApp {

    public static void main(String[] args) {
        
    EventQueue.invokeLater(() -> {
            FSAAppFrame frame = new FSAAppFrame();
            frame.setTitle("FSA Rental Program - Welcome");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);
            frame.setVisible(true);
            frame.setResizable(false);
        });
}
        
}
