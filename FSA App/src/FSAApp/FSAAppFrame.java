/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FSAApp;

/**
 *
 * @author 12084819
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class FSAAppFrame extends JFrame {

    private JLabel newEntryLabel;
    private JButton enterRoomBtn;
    private JButton enterWholeBtn;
    private JButton editRentalBtn;
    private JButton displayRentalBtn;
    private JButton exitBtn;
    private JTextField textId;
    private JPanel pnlMainBtns;
    private JPanel pnlMainEdit;
    private JPanel pnlMainExit;
    private JPanel pnlMainDisp;
    private JPanel pnlCentre;
    
    private ArrayList<Rental> rentals; 

    // to do - add an array[] to store details for Rental class, not an array list (assignment 2 only?)
    // to do - intialise the array within constructor below     
    public FSAAppFrame() {

        rentals = new ArrayList<Rental>();
        
    
// add components for FSAAppFrame - frame and layout
            
        pnlMainBtns = new JPanel();
        pnlMainDisp = new JPanel();
        pnlMainEdit = new JPanel();
        pnlMainExit = new JPanel();
        pnlCentre = new JPanel();
        pnlCentre.setLayout(new GridLayout(3, 1));

        this.setLayout(new BorderLayout());
        //construct buttons and text field         
        enterRoomBtn = new JButton("Room Rental");
        enterRoomBtn.addActionListener(new EnterRoomBtnAction());

        enterWholeBtn = new JButton("Whole Rental");
        enterWholeBtn.addActionListener(new EnterWholeBtnAction());

        editRentalBtn = new JButton("Edit");
        editRentalBtn.addActionListener(new EditBtnAction());

        displayRentalBtn = new JButton("Display");
        displayRentalBtn.addActionListener(new DisplayBtnAction());

        exitBtn = new JButton("Exit");
        exitBtn.addActionListener(new ExitBtnAction());
        textId = new JTextField("Rental Id");

        // add buttons to panel pnlMainBtns, JTextField text Id to  pnlMainEdit, and pnlMainBtns + pnlMainEdit to frame
        //pnlMainBtns.add(newEntryLabel);
        pnlMainBtns.add(enterRoomBtn);
        pnlMainBtns.add(enterWholeBtn);
        pnlMainDisp.add(displayRentalBtn);
        pnlMainEdit.add(editRentalBtn);
        pnlMainEdit.add(textId);
        pnlMainExit.add(exitBtn);

        pnlCentre.add(pnlMainBtns);
        pnlCentre.add(pnlMainDisp);
        pnlCentre.add(pnlMainEdit);
        this.add(pnlCentre, BorderLayout.CENTER);
        this.add(pnlMainExit, BorderLayout.SOUTH);

    }

    private class ExitBtnAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            /* Exit */
            System.exit(0);
        }
    }

    private void goToEnterEditFrame(String userAction) {
        
        for (Frame f : Frame.getFrames()) {
            if (f.getTitle().equals("FSA Rental Program - Welcome")) {
                f.dispose();
            }
        }
        /* Create a NewEdit Frame */
        EnterEditFrame frame = new EnterEditFrame(rentals, userAction);
        frame.setTitle("Enter or Update Rental");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 300);
        frame.setVisible(true);
    }

    private class EnterRoomBtnAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            goToEnterEditFrame("newRoom");
        }
    }

    private class EnterWholeBtnAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            goToEnterEditFrame("newWhole");
        }
    }
    
    private class EditBtnAction implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            goToEnterEditFrame("edit");
        }
    }

    private class DisplayBtnAction implements ActionListener {

        public void actionPerformed(ActionEvent event) {
           // goToDisplayFrame();
        }
    }
}
