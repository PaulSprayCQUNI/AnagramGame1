/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cqt;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author s0287181
 */
public class CQT {
    
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            CqtAppFrame frame = new CqtAppFrame();
            frame.setTitle("My Demo GUI");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600,700);
            frame.setVisible(true);
        });
    }
}
