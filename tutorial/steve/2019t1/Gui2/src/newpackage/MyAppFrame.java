/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class MyAppFrame extends JFrame {

    private JLabel lblFirstName;
    private JLabel lblLastName;
    private JLabel lblTitle;
    private JTextField txtFirstName;
    private JTextField txtLastName;
    private JButton btnExit;
    private JButton btnCancel;
    private JButton btnOk;
    private JButton btnDisplay;
    private JPanel pnlButtons;
    private JPanel pnlCentre;
    private JPanel pnlName;
    private JPanel pnlDetails;
    private JTextArea taDetails;
    private ArrayList<Person> people;

    public MyAppFrame() {
        people = new ArrayList<Person>();
        
        this.setLayout(new BorderLayout());

        lblTitle = new JLabel("My App");
        this.add(lblTitle, BorderLayout.NORTH);

        pnlButtons = new JPanel();
        pnlButtons.setLayout(new FlowLayout());
        
        ButtonAction action;

        btnOk = new JButton("Add");
        action = new ButtonAction();
        btnOk.addActionListener(action);        

        btnCancel = new JButton("Clear");
        action = new ButtonAction();
        btnCancel.addActionListener(action);

        btnDisplay = new JButton("Display");
        action = new ButtonAction();
        btnDisplay.addActionListener(action);         
        
        btnExit = new JButton("Exit");
        action = new ButtonAction();
        btnExit.addActionListener(action);        
        
        pnlButtons.add(btnOk);
        pnlButtons.add(btnCancel);
        pnlButtons.add(btnDisplay);
        pnlButtons.add(btnExit);
        this.add(pnlButtons, BorderLayout.SOUTH);

        pnlCentre = new JPanel();
        pnlCentre.setLayout(new GridLayout(1, 2));

        pnlName = new JPanel();
        pnlName.setLayout(new GridLayout(2, 2));
        lblFirstName = new JLabel("First");
        lblLastName = new JLabel("Last");
        txtFirstName = new JTextField("Enter your first name ...");
        txtLastName = new JTextField("Enter your last name ...");
        pnlName.add(lblFirstName);
        pnlName.add(txtFirstName);
        pnlName.add(lblLastName);
        pnlName.add(txtLastName);
        pnlCentre.add(pnlName);

        pnlDetails = new JPanel();
        pnlDetails.setLayout(new FlowLayout());
        taDetails = new JTextArea(5, 10);
        pnlDetails.add(taDetails);
        pnlCentre.add(pnlDetails);

        this.add(pnlCentre, BorderLayout.CENTER);

    }

    private class ButtonAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            // Get the name of the button
            String btnPressed = event.getActionCommand();

            if (btnPressed.equals("Add")) {
                // Do all the things that ok should do
                Person p1 = new Person(txtFirstName.getText(), txtLastName.getText());
                people.add(p1);
                System.out.println(p1);
            }
            else if (btnPressed.equals("Clear")) {
                txtFirstName.setText("");
                txtLastName.setText("");
            }
            else if (btnPressed.equals("Display")) {
                String strDetails = "";
                for (Person p : people) {
                    strDetails = strDetails + p.toString();
                }
                taDetails.setText(strDetails);
                
            }           
            else {
                System.out.println("The button was:" + btnPressed);
                for (Person p : people) {
                    System.out.println(p);
                }
                System.exit(0);
            }
        }
    }

}
