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
package multiframeapp;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class WelcomeFrame extends JFrame {

    private JButton btnEdit;
    private JButton btnDisplay;
    private JButton btnExit;
    private JPanel pnlButtons;
    
    /* List of people */
    private ArrayList<Person> people;

    public WelcomeFrame() {
        /* Initialise people */
        people = new ArrayList<Person>();
        
        /* Set the graphic layout of components on frame */
        this.setLayout(new FlowLayout());

        /* Construct panel for buttons and set layout */
        pnlButtons = new JPanel();
        this.setLayout(new FlowLayout());

        /* Construct buttons */
        btnEdit = new JButton("Edit");
        btnDisplay = new JButton("Display");
        btnExit = new JButton("Exit");

        /* Associate actions with buttons */
        btnEdit.addActionListener(new EditButtonAction());
        btnDisplay.addActionListener(new DisplayButtonAction());
        btnExit.addActionListener(new ExitButtonAction());

        /* Add buttons to panel, and panel to frame */
        pnlButtons.add(btnEdit);
        pnlButtons.add(btnDisplay);
        pnlButtons.add(btnExit);
        this.add(pnlButtons);

    }

    /* Action performed when Edit button pressed */
    private class EditButtonAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            /* Dispose of current frame */
            for (Frame f : Frame.getFrames()) {
                if (f.getTitle().equals("Welcome Frame")) {
                    f.dispose();
                }
            }

            /* Create a new Edit Frame */
            EditFrame frame = new EditFrame(people);
            frame.setTitle("Edit Frame");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setSize(600, 300);
            frame.setVisible(true);
        }
    }

    /* Action performed when Display  button pressed */
    private class DisplayButtonAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            /* Dispose of current frame */
            for (Frame f : Frame.getFrames()) {
                if (f.getTitle().equals("Welcome Frame")) {
                    f.dispose();
                }
            }

            /* Create a new Display Frame */
            DisplayFrame frame = new DisplayFrame(people);
            frame.setTitle("Display Frame");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setSize(600, 300);
            frame.setVisible(true);
        }
    }

    /* Action performed when Exit button pressed */
    private class ExitButtonAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            /* Exit */
            System.exit(0);
        }
    }
}
