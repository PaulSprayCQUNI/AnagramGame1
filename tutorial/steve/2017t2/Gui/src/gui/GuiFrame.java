/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class GuiFrame extends JFrame {

    private JLabel lbl1;
    private JLabel lbl2;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JPanel pnl1;
    private JPanel pnl2;
    private JPanel pnlSouth;

    public GuiFrame() {

        // List of people
        ArrayList<Booking> bookingList = new ArrayList<Booking>();

        // Read list of people from comma separated file
        BookingReader pr = new BookingReader("bookings.txt");
        bookingList = pr.getBookingList();

        // Add a new person to list
        // TODO This goes in "Add booking" button code
        bookingList.add(new Booking("XXX", "YYY", 1900));

        // Display people
        for (Booking p : bookingList) {
            System.out.println(p.toString());
        }

        // Write list of people to file
        // This goes in EXIT button code
        BookingWriter w = new BookingWriter("bookings.txt", bookingList);

        setLayout(new GridLayout(1, 2));

        pnl1 = new JPanel();
        pnl1.setLayout(new BorderLayout());

        pnl2 = new JPanel();

        lbl1 = new JLabel("Hello");
        lbl2 = new JLabel("Everyone");

        btn1 = new JButton("Exit1");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        btn2 = new JButton("Exit2");
        btn2.addActionListener(event -> System.exit(0));

        ButtonAction action;
        btn3 = new JButton("Button 3");
        action = new ButtonAction("three");
        btn3.addActionListener(action);

        btn4 = new JButton("Button 4");
        action = new ButtonAction("four");
        btn4.addActionListener(action);

        btn5 = new JButton("Button 5");
        action = new ButtonAction("five");
        btn5.addActionListener(event
                -> JOptionPane.showMessageDialog(this, "Hello"));

        pnl1.add(lbl1, BorderLayout.NORTH);
        pnl1.add(btn1, BorderLayout.WEST);
        pnl1.add(btn5, BorderLayout.EAST);

        pnlSouth = new JPanel(new FlowLayout());
        pnlSouth.add(btn3);
        pnlSouth.add(btn4);

        pnl1.add(pnlSouth, BorderLayout.SOUTH);

        pnl2.add(lbl2);
        pnl2.add(btn2);

        add(pnl1);
        add(pnl2);

        //pack();
    }

    private class ButtonAction implements ActionListener {

        private String buttonName;

        public ButtonAction(String buttonName) {
            this.buttonName = buttonName;
        }

        public void actionPerformed(ActionEvent event) {
            System.out.println(buttonName);
        }
    }
}
