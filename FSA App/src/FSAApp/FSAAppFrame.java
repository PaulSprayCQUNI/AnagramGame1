/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FSAApp;

/**
 *
 * @author 12084819
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class FSAAppFrame extends JFrame {
    
    private JButton enterRentalBtn;
    private JButton editRentalBtn;
    private JButton displayRentalBtn;
    private JTextField textId;
    private JPanel pnlMainBtns;
    private JPanel pnlMainEdit;

                                    // to do - add an array[] to store details for Rental class, not an array list (assignment 2 only?)
                                    // to do - intialise the array within constructor below     
    
    public FSAAppFrame(){
        
        // add components for FSAAppFrame - frame and layout
        
        pnlMainBtns = new JPanel();
        pnlMainEdit = new JPanel();
        this.setLayout(new BorderLayout());
        //construct buttons and text field                            
        enterRentalBtn = new JButton("Enter");      
        editRentalBtn = new JButton("Edit");
        displayRentalBtn = new JButton("Display");
        textId = new JTextField("Enter Rental Id of Rental to Edit");
        
        // add buttons to panel pnlMainBtns, JTextField text Id to  pnlIdText, and pnlMainBts + pnlIdText to frame
        pnlMainBtns.add(enterRentalBtn);
        pnlMainBtns.add(displayRentalBtn);
        pnlMainEdit.add(editRentalBtn);
        pnlMainEdit.add(textId);
        //pnlMainBtns.setLayout(new GridLayout(3,1));
        //pnlMainEdit.setLayout(new GridLayout(0,1)); 
        
              
        this.add(pnlMainBtns, BorderLayout.NORTH);
        this.add(pnlMainEdit);//,BorderLayout.CENTER);
        //this.add(BorderLayout.NORTH);
        //this.add(BorderLayout.WEST);
        //this.add(BorderLayout.SOUTH);
        
    }

    }
    
    

