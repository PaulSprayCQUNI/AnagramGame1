/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appguidemo;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Create the main frame for MyApp Demo
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class MyAppFrame extends JFrame {

    /* Instance variables */
    /* 
    I'm using a naming scheme where the GUI component type is included
    in the variable name, e.g.
    lbl for JLabel
    btn for JButton
    txt for JTextField
    This helps when there are multiple GUI components for similar purpose, e.g.
    a text field and button for Name will be txtName and lblName.
     */
    private JLabel lblDemo;
    private JButton btnEdit;
    private JButton btnExit;

    /* Constructor */
    public MyAppFrame() {

        /* Set a default layout for the entire frame */
        this.setLayout(new GridLayout(3, 1));

        /* Construct a new JLabel and refer to it with instance variable lblDemo */
        lblDemo = new JLabel("MyAppFrame");

        /* Construct buttons */
        /* 
        Buttons normally have actions associated with them when they are pressed.
        In this case we will define a private class ButtonAction to handle actions
        for all buttons.
         */
        ButtonAction action; /* Define a local variable for button actions */
        btnEdit = new JButton("Edit"); /* Construct the Edit buttom */
        action = new ButtonAction(); /* Construct a new ButtonAction object */
        
        /* The button listens for events, e.g. clicks. When an event occurs the
        associated action is called.
        */
        btnEdit.addActionListener(action); 

        /* Exit button */
        btnExit = new JButton("Exit");
        action = new ButtonAction();
        btnExit.addActionListener(action);

        /* Now add the GUI components to the frame */
        this.add(lblDemo);
        this.add(btnEdit);
        this.add(btnExit);

    }

    private class ButtonAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            // Get the name of the button
            String btnPressed = event.getActionCommand();

            if (btnPressed.equals("Edit")) {

                /* Get all frames, and hide the My App Frame */
                for (Frame f : Frame.getFrames()) {
                    if (f.getTitle().equals("My App Frame")) {
                        f.setVisible(false);
                    }
                }

                /* Create a new Edit Frame */
                EditFrame frame = new EditFrame();
                frame.setTitle("Edit Frame");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setSize(600, 300);
                frame.setVisible(true);
            }
            if (btnPressed.equals("Exit")) {
                System.exit(0);
            }

        }
    }
}




