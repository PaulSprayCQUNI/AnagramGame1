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

public class FSAAppFrame extends JFrame {
    
    private JButton enterRentalBtn;
    private JButton editRentalBtn;
    private JButton displayRentalBtn;
    private JTextField textId;
    private JPanel pnlMainBtns;
    private JPanel pnlIdText;

    
    
    public FSAAppFrame(){
        
        this.setLayout(new BorderLayout());
        
        enterRentalBtn = new JButton("Enter");
        editRentalBtn = new JButton("Edit");
        displayRentalBtn = new JButton("Display");
        textId = new JTextField("Enter Rental Id");
        pnlIdText = new JPanel();
        pnlMainBtns = new JPanel();
        
        pnlMainBtns.add(enterRentalBtn);
        pnlMainBtns.add(editRentalBtn);
        pnlMainBtns.add(displayRentalBtn);
        pnlIdText.add(textId);
        pnlMainBtns.setLayout(new GridLayout(3,1));
        pnlIdText.setLayout(new GridLayout(0,1)); 
                
        this.add(pnlMainBtns, BorderLayout.CENTER);
        this.add(pnlIdText,BorderLayout.EAST);
        //this.add(BorderLayout.NORTH);
        //this.add(BorderLayout.WEST);
        //this.add(BorderLayout.SOUTH);
        
    }

    }
    
    

