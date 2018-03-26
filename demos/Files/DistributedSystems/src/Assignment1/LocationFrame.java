/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author brook
 */
public class LocationFrame extends JFrame implements ActionListener {

    String[] locationString = {"Sydney", "Meblbourne", "Brisbane"};

    private JLabel lLocation = new JLabel("Location?");
    private JLabel lBlank= new JLabel("      ");
    private JComboBox locationList = new JComboBox(locationString);
    private JButton bOK = new JButton("OK");
    private JButton bClear = new JButton("Clear");
    private JPanel pButtons = new JPanel();
    private JPanel pCenter = new JPanel();

    public LocationFrame() {
        setLayout(new BorderLayout());
        add(lLocation, BorderLayout.CENTER);
        
        pButtons.setLayout(new FlowLayout());
        pButtons.add(bOK, BorderLayout.SOUTH);
        pButtons.add(bClear, BorderLayout.SOUTH);
        
        pCenter.setLayout(new FlowLayout());
        pCenter.add(lLocation);
        pCenter.add(lBlank);
        pCenter.add(locationList);
        add(pButtons, BorderLayout.SOUTH);
        add(pCenter, BorderLayout.CENTER);
    }
    
    @Override
    public void actionPerformed(ActionEvent buttons) {
        String command = buttons.getActionCommand();

        if (command.compareTo("Clear") == 0) {
            clear();
        } else if (command.compareTo("OK") == 0) {
            ok();
        }

    }

    private void clear() {

    }

    private void ok() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
