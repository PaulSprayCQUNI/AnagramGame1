/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class Gui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            GuiFrame frame = new GuiFrame();
            frame.setTitle("My Demo GUI");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 700);
            frame.setVisible(true);
        });
    }

}
