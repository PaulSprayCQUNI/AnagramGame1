/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FSAApp;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author 12084819
 */
public class EnterEditFrame extends JFrame {

    private JButton submitBtn;
    private JButton backBtn;
    private JLabel addressLabel;
    private JTextField addressText;
    private JLabel weeklyPriceLabel;
    private JFormattedTextField weeklyPriceText;
    private JLabel furnishedLabel;
    private JCheckBox furnishedCheckBox;
    private JLabel descriptionLabel;
    private JTextArea descriptionArea;

    private JLabel couplesLabel;
    private JLabel ensuiteLabel;

    private JLabel numRoomsLabel;
    private JLabel numBathsLabel;
    private JLabel garageLabel;
    private JLabel petsLabel;

    private JPanel pnlDetail;
    private JPanel pnlDescription;
    private JPanel pnlESubmit;
    private JPanel pnlEBack;

    private JPanel pnlSouth;

    private JPanel pnlRmOption;
    private JPanel pnlHouseOption;

    private ArrayList<Rental> rentals;
    private String userAction;

    public EnterEditFrame(ArrayList<Rental> rentals, String userAction) {
        this.rentals = rentals;
        this.userAction = userAction;

        this.setLayout(new BorderLayout());         // layout for the EnterEditFrame

        pnlDetail = new JPanel();                  //construct Panel for first section of frame
        pnlDetail.setLayout(new GridLayout(1, 3));  // Grid Layout for 4 labels of first section

        pnlDescription = new JPanel();              // to do - same as above for next three panels
        pnlRmOption = new JPanel();
        pnlHouseOption = new JPanel();

        pnlSouth = new JPanel();
        pnlSouth.setLayout(new FlowLayout());
        pnlESubmit = new JPanel();
        pnlEBack = new JPanel();
        submitBtn = new JButton("Submit");
        submitBtn.addActionListener(new SubmitButtonAction());
        backBtn = new JButton("Back");
        backBtn.addActionListener(new BackButtonAction());
        pnlESubmit.add(submitBtn);
        pnlEBack.add(backBtn);

        pnlSouth.add(pnlESubmit);
        pnlSouth.add(pnlEBack);

        this.add(pnlSouth, BorderLayout.SOUTH);

    }

    private void saveFormDetails() {
// construct new empty Whole or Room Rental
        if (userAction.equals("newRoom")) {
            RoomRental r = new RoomRental();
        } else {
            WholeRental w = new WholeRental();

        }
// read values from form
    }

    private void returnToWelcomeFrame() {
        for (Frame f : Frame.getFrames()) {
            if (f.getTitle().equals("Enter or Update Rental")) {
                f.dispose();
            }
        }
        FSAAppFrame frame = new FSAAppFrame();
        frame.setTitle("FSA Rental Program - Welcome");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setResizable(false);
    }

    private class SubmitButtonAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            saveFormDetails();
            returnToWelcomeFrame();

        }
    }

    private class BackButtonAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            returnToWelcomeFrame();

        }
    }
}
