/*
 * The MIT License
 *
 * Copyright 2019 Steven Gordon <s.d.gordon@cqu.edu.au>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package myapp;

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
