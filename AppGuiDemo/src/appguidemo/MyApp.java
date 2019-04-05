/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appguidemo;

/**
 * * Copyright 2019 Steven Gordon <s.d.gordon@cqu.edu.au>.
 * @author 12084819
 */

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class MyApp {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            MyAppFrame frame = new MyAppFrame();
            frame.setTitle("My App Frame");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 300);
            frame.setVisible(true);
        });
    }
    
}
