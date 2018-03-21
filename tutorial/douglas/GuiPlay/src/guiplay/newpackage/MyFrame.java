/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiplay.newpackage;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
    
    private JPanel JP1;
    private JPanel JP2; 
    
    public MyFrame(){
        JL1 = new JLabel ("Good Day,");
        JL2 = new JLabel ("How's it going mate");
        
        JB1 = new JButton ("Click this");
        JB2 = new JButton ("Don't click this");
        JB3 = new JButton ("No seriously, don't click this one");
        
        JP1 = new JPanel (); 
        JP2 = new JPanel (); 
        
        setLayout (new GridLayout(2,1));
        JP1.setLayout(new BorderLayout());
        
        
      
       //this.add(JL1,BorderLayout.NORTH); 
        //this.add(JL2, BorderLayout.SOUTH); 
        
        //this.add(JB1, BorderLayout.WEST);
        //this.add(JB2, BorderLayout.CENTER);
        //this.add(JB3, BorderLayout.EAST);
        
        JP1.add(JL1, BorderLayout.CENTER);
        JP1.add(JL2,BorderLayout.NORTH);
        JP1.add(JB1,BorderLayout.SOUTH);
        this.add(JP1);
        
        
        
        
       
         
        
        
        
        pack();
        
    }
    
    
    
    
    
    
    
}
