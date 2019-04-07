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
 * This frame displays the list of people.
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class DisplayFrame extends JFrame {

    private JButton btnClose;
    private JPanel pnlButtons;
    private JPanel pnlDisplay;
    private JTextArea taDisplay;
    
    private ArrayList<Person> people;

    /* Constructor for DisplayFrame, taking people as argument */
    public DisplayFrame(ArrayList<Person> inPeople) {
        people = inPeople;
        
        /* Set layout for this frame */
        this.setLayout(new FlowLayout());

        /* Construct panel for displaying information */
        pnlDisplay = new JPanel();
        pnlDisplay.setLayout(new FlowLayout());

        /* Construct text area for display */
        taDisplay = new JTextArea(10, 20);
        updateDisplayText();

        /* Construct panel for buttons */
        pnlButtons = new JPanel();
        pnlButtons.setLayout(new FlowLayout());

        /* Construct buttons */
        btnClose = new JButton("Close");

        /* Associate actions with buttons */
        btnClose.addActionListener(new CloseButtonAction());

        /* Add components to panels and panel to frame */
        pnlDisplay.add(taDisplay);
        this.add(pnlDisplay);
        pnlButtons.add(btnClose);
        this.add(pnlButtons);
    }

    /* Update display text area */
    private void updateDisplayText() {
        String strDetails = "";
        if (people.isEmpty()) {
            taDisplay.setText("Currently no people.");
        } else {
            for (Person p : people) {
                strDetails = strDetails + "\n" + p.toString();
            }
            taDisplay.setText(strDetails);
        }
    }

    /* Action performed when Close button pressed */
    private class CloseButtonAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            /* Dispose of current frame and set main frame to be visible */
            for (Frame f : Frame.getFrames()) {
                if (f.getTitle() == "Display Frame") {
                    f.dispose();
                }
                if (f.getTitle() == "Welcome Frame") {
                    f.setVisible(true);
                }
            }
        }
    }

}
