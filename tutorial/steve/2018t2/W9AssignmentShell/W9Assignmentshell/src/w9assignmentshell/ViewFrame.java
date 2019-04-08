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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class ViewFrame extends JFrame {

    /**
     *
     * @author Steven Gordon <s.d.gordon@cqu.edu.au>
     */
    private JLabel lbl1;
    private JButton btn1;
    private JButton btn3;
    private JButton btnSave;
    private JTextArea ta1;
    private ArrayList<Request> listRequests;

    ViewFrame(ArrayList<Request> listRequests) {

        this.listRequests = listRequests;

        this.setLayout(new GridLayout(2, 3));

        lbl1 = new JLabel("View Frame");

        ButtonAction action;
        btn1 = new JButton("Close");
        action = new ButtonAction();
        btn1.addActionListener(action);

        btn3 = new JButton("View");
        action = new ButtonAction();
        btn3.addActionListener(action);

        btnSave = new JButton("Save");
        action = new ButtonAction();
        btnSave.addActionListener(action);

        ta1 = new JTextArea();

        this.add(lbl1);
        this.add(btn1);
        this.add(btn3);
        this.add(btnSave);
        this.add(ta1);
    }

    private class ButtonAction implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            String btnPressed = event.getActionCommand();

            if (btnPressed == "Close") {
                System.out.println("Close");

                /* Get all frames and dispose of the View Frame 
                   while making the Booking Frame visible
                 */
                for (Frame f : Frame.getFrames()) {
                    if (f.getTitle() == "View Frame") {
                        f.dispose();
                    }
                    if (f.getTitle() == "Booking Frame") {
                        f.setVisible(true);
                    }
                }

            }

            if (btnPressed == "View") {
                ta1.setText("All requests\n");
                for (Request r : listRequests) {
                    ta1.append(r.getRequestNumber() + "\n");

                }

            }

            if (btnPressed == "Save") {
                RequestWriter w = new RequestWriter("requests.txt", listRequests);

            }
        }
    }

}
