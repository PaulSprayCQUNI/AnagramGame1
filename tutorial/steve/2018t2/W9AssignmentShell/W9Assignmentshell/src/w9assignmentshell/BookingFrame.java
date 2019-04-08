/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w9assignmentshell;

import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class BookingFrame extends JFrame {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            BookingFrame frame = new BookingFrame();
            frame.setTitle("Booking Frame");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 300);
            frame.setVisible(true);
        });
    }

    private JLabel lbl1;
    private JButton btnEdit;
    private JButton btnBook;
    private JButton btnView;
    private JButton btnExit;

    /* This will store all of the requests */
    private ArrayList<Request> listRequests;

    BookingFrame() {
        this.setLayout(new GridLayout(3, 2));

        //listRequests = new ArrayList<>(10);
        // Read list of requests from space separated file
        RequestReader rl = new RequestReader("requests.txt");
        listRequests = rl.getRequestList();

        lbl1 = new JLabel("BookingFrame");

        ButtonAction action;
        btnEdit = new JButton("Edit");
        action = new ButtonAction();
        btnEdit.addActionListener(action);

        btnBook = new JButton("Book");
        action = new ButtonAction();
        btnBook.addActionListener(action);

        btnView = new JButton("View");
        action = new ButtonAction();
        btnView.addActionListener(action);

        btnExit = new JButton("Exit");
        action = new ButtonAction();
        btnExit.addActionListener(action);

        this.add(lbl1);
        this.add(btnEdit);
        this.add(btnBook);
        this.add(btnView);
        this.add(btnExit);

    }

    private class ButtonAction implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            // Get the name of the button
            String btnPressed = event.getActionCommand();

            if (btnPressed == "Edit") {

                /* Get all frames, and hide the Booking Frame */
                for (Frame f : Frame.getFrames()) {
                    if (f.getTitle() == "Booking Frame") {
                        f.setVisible(false);
                    }
                }

                /* Create a new Edit Frame */
                EditFrame frame = new EditFrame(listRequests);
                frame.setTitle("Edit Frame");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setSize(600, 300);
                frame.setVisible(true);
            }
            if (btnPressed == "View") {

                /* Get all frames, and hide the Booking Frame */
                for (Frame f : Frame.getFrames()) {
                    if (f.getTitle() == "Booking Frame") {
                        f.setVisible(false);
                    }
                }

                /* Create a new View Frame */
                ViewFrame frame = new ViewFrame(listRequests);
                frame.setTitle("View Frame");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setSize(600, 300);
                frame.setVisible(true);
            }
            if (btnPressed == "Book") {
                /* First create a single request */
                Request r = new StaffRequest(NumberGenerator.getCounter(), "T1000", 2);
                NumberGenerator.increment();
                /* Now add that single request to my list of requests */
                listRequests.add(r);

            }
            if (btnPressed == "Exit") {
                System.exit(0);
            }

        }
    }
}
