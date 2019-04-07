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
 * This frame allows adding a new person (the name should probably be changed
 * from Edit to Add, but it could be modified to edit functionality)
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class EditFrame extends JFrame {

    private JButton btnAdd;
    private JButton btnCancel;
    private JPanel pnlButtons;
    private JPanel pnlEntry;
    private JTextField txtFirstName;
    private JTextField txtLastName;
    private JLabel lblFirstName;
    private JLabel lblLastName;

    private ArrayList<Person> people;

    public EditFrame(ArrayList<Person> inPeople) {
        people = inPeople;

        /* Set layout for this frame */
        this.setLayout(new FlowLayout());

        /* Construct panel for data entry */
        pnlEntry = new JPanel();
        pnlEntry.setLayout(new FlowLayout());

        /* Construct first name and last name entry fields */
        lblFirstName = new JLabel("First name:");
        lblLastName = new JLabel("Last name:");
        txtFirstName = new JTextField(20);
        txtLastName = new JTextField(20);

        /* Construct panel for buttons */
        pnlButtons = new JPanel();
        pnlButtons.setLayout(new FlowLayout());

        /* Construct buttons */
        btnAdd = new JButton("Add");
        btnCancel = new JButton("Cancel");

        /* Associate actions with buttons */
        btnAdd.addActionListener(new AddButtonAction());
        btnCancel.addActionListener(new CancelButtonAction());

        /* Add components to panels and panel to frame */
        pnlEntry.add(lblFirstName);
        pnlEntry.add(txtFirstName);
        pnlEntry.add(lblLastName);
        pnlEntry.add(txtLastName);
        this.add(pnlEntry);

        pnlButtons.add(btnAdd);
        pnlButtons.add(btnCancel);
        this.add(pnlButtons);
    }

    /* Action performed when add button pressed */
    private class AddButtonAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            /* Update people */
            /**
             * The idea is that we will get the text fields, then use them to
             * construct a new Person. Then that person is added to our list
             * of people.
             * There should be data validation performed here, e.g. checking 
             * that the text fields contain appropriate values.
             */
            people.add(new Person(txtFirstName.getText(), txtLastName.getText()));
            
            /* Dispose of current frame and set main frame to be visible */
            for (Frame f : Frame.getFrames()) {
                if (f.getTitle() == "Edit Frame") {
                    f.dispose();
                }
                if (f.getTitle() == "Welcome Frame") {
                    f.setVisible(true);
                }
            }
        }
    }

    /* Action performed when Cancel button pressed */
    private class CancelButtonAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            /* Dispose of current frame and set main frame to be visible */
            for (Frame f : Frame.getFrames()) {
                if (f.getTitle() == "Edit Frame") {
                    f.dispose();
                }
                if (f.getTitle() == "Welcome Frame") {
                    f.setVisible(true);
                }
            }
        }
    }

}
