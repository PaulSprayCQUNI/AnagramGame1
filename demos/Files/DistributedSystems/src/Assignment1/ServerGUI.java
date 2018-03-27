/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author brook
 */
public class ServerGUI {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            ServerFrame frame = new ServerFrame();
            frame.setTitle("Server Running...");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 350);
            frame.setVisible(true);
        });
    }
}
