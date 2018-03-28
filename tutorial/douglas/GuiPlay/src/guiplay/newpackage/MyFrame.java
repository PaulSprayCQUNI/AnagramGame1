/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiplay.newpackage;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Douglas Wheatley <douglas.wheatley@cqumail.com>
 */
public class MyFrame extends JFrame {
    
    private JLabel JL1; 
    private JLabel JL2;
    
    private JButton JB1;
    private JButton JB2;
    private JButton JB3;
    private JButton JB4; 
   
    
    private JPanel JP1;
    private JPanel JP2; 
    private JPanel JP3;
    private JPanel JP4; 
    private JPanel JP5;
    
    private JComboBox JComBox;
    private JCheckBox JCheckBox1; 
    private JCheckBox JCheckBox2;
    private JCheckBox JCheckBox3;
    private JCheckBox JCheckBox4;
    
    private JRadioButton JRadioButton1; 
    private JRadioButton JRadioButton2; 
    private JRadioButton JRadioButton3; 
    
    private ButtonGroup ButtonGroup1; 
    
    public MyFrame(){
        
        
        
        JL1 = new JLabel ("Print: My Printer");
        JL2 = new JLabel ("Printer Quality");
        
        JB1 = new JButton ("OK");
        JB2 = new JButton ("Cancel");
        JB3 = new JButton ("Setup...");
        JB4 = new JButton("Help"); 
        
        JP1 = new JPanel (); 
        JP2 = new JPanel (); 
        JP3 = new JPanel ();
        JP4 = new JPanel ();
        JP5 = new JPanel (); 
        
        JComBox = new JComboBox();
        JCheckBox1 = new JCheckBox("Image"); 
        JCheckBox2 = new JCheckBox("Text"); 
        JCheckBox3 = new JCheckBox("Code"); 
        JCheckBox4 = new JCheckBox("Print to file"); 
        
        JRadioButton1 = new JRadioButton("Selection"); 
        JRadioButton2 = new JRadioButton("All"); 
        JRadioButton3 = new JRadioButton("Applet"); 
        
        ButtonGroup1 = new ButtonGroup (); 
        
        
        
        setLayout (new BorderLayout());
        
        
        
        JP2.setLayout (new GridLayout(4,1)); //EAST 
        JP1.setLayout (new BorderLayout()); //CENTER
        
        JP1.add(JP3, BorderLayout.NORTH); //NORTH WITHIN JP1
        JP1.add(JP4, BorderLayout.CENTER);//CENTER WITHIN JP1
        JP1.add(JP5, BorderLayout.SOUTH);//SOUTH WITHIN JP1
        
        JP2.add(JB1); //GRID LAYOUT - Button "OK"
        JP2.add(JB2); //GRID LAYOUT - Button "Cancel"
        JP2.add(JB3);//GRID LAYOUT - Button "Setup.."
        JP2.add(JB4); //GRID LAYOUT - Button "Help"
        
        JP3.add(JL1);//NORTH WITHIN JP1 -Label "Print: My Printer";
        JP5.add(JL2);////SOUTH WITHIN JP1 - "Printer Quality"
        
        JComBox.addItem("High"); 
        JComBox.addItem("Low"); 
        JP5.add(JComBox); 
        
        JP4.add(JCheckBox1); 
        JP4.add(JCheckBox2); 
        JP4.add(JCheckBox3); 
        JP5.add(JCheckBox4); 
        
        
        ButtonGroup1.add(JRadioButton1); 
        ButtonGroup1.add(JRadioButton2);
        ButtonGroup1.add(JRadioButton3); 
        
        
        
        JP4.add(JRadioButton1); 
        JP4.add(JRadioButton2);
        JP4.add(JRadioButton3); 
        
        
        add(JP1,BorderLayout.CENTER); 
        add(JP2,BorderLayout.EAST); 
        
        
        
        
        
        
         
                
        
        
       //JP1.add(JB1, BorderLayout.EAST);
        //JP1.add(JL1, BorderLayout.CENTER); 
        
        
       
      
       
        
       

        
        
        
        
       
         
        
        
        
        pack();
        
    }
    
    
    
    
    
    
    
}
