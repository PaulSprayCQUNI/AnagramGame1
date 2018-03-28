/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author brook
 */
public class ServerFrame extends JFrame implements ActionListener {

    private JButton bClear = new JButton("Clear");
    private JTextArea aLogs = new JTextArea();
    private JPanel pCenter = new JPanel();
    
    public ServerFrame() {
        setLayout(new BorderLayout());
        
        pCenter.setLayout(new FlowLayout());
        pCenter.add(aLogs);
        
        add(bClear, BorderLayout.NORTH);
        add(pCenter, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent buttons) {
        String command = buttons.getActionCommand();
    }
}
