/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panelapp;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class PanelApp {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            PanelAppFrame frame = new PanelAppFrame();
            frame.setTitle("My Demo GUI");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600,700);
            frame.setVisible(true);
        });
        
    }
          
    
}
