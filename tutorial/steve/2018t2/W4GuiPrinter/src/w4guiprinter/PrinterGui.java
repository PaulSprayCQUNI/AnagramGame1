/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w4guiprinter;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class PrinterGui {
      public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            PrinterGuiFrame frame = new PrinterGuiFrame();
            frame.setTitle("My Printer GUI");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600,300);
            frame.setVisible(true);
        });
}  
}
