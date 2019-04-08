/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panelapp;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class PanelAppFrame extends JFrame {

    private JButton btnInput;
    private ArrayList<Person> lstPerson;
    
    
    public PanelAppFrame() {
        super("Panel App Demo");
        initComponents();
        initLists();
    }

    private void initComponents() {
        btnInput = new JButton("Input");
        btnInput.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnInputActionPerformed(e);
            }
        });
        add(btnInput);
    }
    
    private void initLists() {
        this.lstPerson = new ArrayList<>();
    }
    
    private void btnInputActionPerformed(ActionEvent e) {
        DataInput d = new DataInput(this.lstPerson); 
        JOptionPane.showMessageDialog(this, d, "Enter", JOptionPane.OK_OPTION);
        System.out.println(this.lstPerson);
    }
}
