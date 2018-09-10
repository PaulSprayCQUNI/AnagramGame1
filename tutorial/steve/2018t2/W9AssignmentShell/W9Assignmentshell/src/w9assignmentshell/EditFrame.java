/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w9assignmentshell;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class EditFrame extends JFrame {

    private JLabel lbl1;
    private JButton btn1;
    private JButton btn2;
    private JTextArea ta1;
    private ArrayList<Request> listRequests;

    EditFrame(ArrayList<Request> listRequests) {

        this.listRequests = listRequests;

        this.setLayout(new GridLayout(2, 3));

        lbl1 = new JLabel("EditFrame");

        ButtonAction action;
        btn1 = new JButton("Close");
        action = new ButtonAction();
        btn1.addActionListener(action);

        btn2 = new JButton("Date");
        action = new ButtonAction();
        btn2.addActionListener(action);

        ta1 = new JTextArea();

        this.add(lbl1);
        this.add(btn1);
        this.add(btn2);
        this.add(ta1);
    }

    private class ButtonAction implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            String btnPressed = event.getActionCommand();

            if (btnPressed == "Close") {
                System.out.println("Close");

                /* Get all frames and dispose of the Edit Frame 
                   while making the Booking Frame visible
                 */
                for (Frame f : Frame.getFrames()) {
                    if (f.getTitle() == "Edit Frame") {
                        f.dispose();
                    }
                    if (f.getTitle() == "Booking Frame") {
                        f.setVisible(true);
                    }
                }

            }
            if (btnPressed == "Date") {
                Date testDate;
                SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yy:HH:mm");
                ta1.append(DATE_FORMAT.format(new Date()) + "\n");
            }

        }
    }
}

