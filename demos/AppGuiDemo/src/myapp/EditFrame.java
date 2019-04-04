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
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class EditFrame extends JFrame {

    /* Instance variables */
    /* These are poor names, only created for this quick demo */
    private JLabel lbl1;
    private JButton btn1;
    private JButton btn2;

    /* Constructor */
    public EditFrame() {
        this.setLayout(new GridLayout(1, 3));

        lbl1 = new JLabel("EditFrame");

        ButtonAction action;
        btn1 = new JButton("Close");
        action = new ButtonAction();
        btn1.addActionListener(action);

        btn2 = new JButton("Date");
        action = new ButtonAction();
        btn2.addActionListener(action);

        this.add(lbl1);
        this.add(btn1);
        this.add(btn2);
    }

    /* Handles actions for all buttons */
    private class ButtonAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            String btnPressed = event.getActionCommand();

            if (btnPressed.equals("Close")) {
                System.out.println("Close");

                /* Get all frames and dispose of the Edit Frame 
                   while making the Booking Frame visible
                 */
                for (Frame f : Frame.getFrames()) {
                    if (f.getTitle().equals("Edit Frame")) {
                        f.dispose();
                    }
                    if (f.getTitle().equals("My App Frame")) {
                        f.setVisible(true);
                    }
                }

            }
            if (btnPressed.equals("Date")) {
                Date testDate;
                SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yy:HH:mm");
                System.out.printf("%s\n", DATE_FORMAT.format(new Date()));
            }

        }
    }
}
