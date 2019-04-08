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
public class ClientGui {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            ClientFrame frame = new ClientFrame();
            frame.setTitle("Hills School");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 150);
            frame.setVisible(true);
        });
    }
}
