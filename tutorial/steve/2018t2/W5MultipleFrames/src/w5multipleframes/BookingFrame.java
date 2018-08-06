/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w5multipleframes;

import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    private JButton btnExit;

    BookingFrame() {
        this.setLayout(new GridLayout(3, 1));

        lbl1 = new JLabel("BookingFrame");
        
        ButtonAction action;
        btnEdit = new JButton("Edit");
        action = new ButtonAction();
        btnEdit.addActionListener(action);

        btnExit = new JButton("Exit");
        action = new ButtonAction();
        btnExit.addActionListener(action);

        this.add(lbl1);
        this.add(btnEdit);
        this.add(btnExit);

    }

    private class ButtonAction implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            String btnPressed = event.getActionCommand();

            if (btnPressed == "Edit") {
                
                /* Get all frames, and hide the Booking Frame */
                for (Frame f : Frame.getFrames()) {
                    if (f.getTitle() == "Booking Frame") {
                        f.setVisible(false);
                    }
                }

                /* Create a new Edit Frame */
                EditFrame frame = new EditFrame();
                frame.setTitle("Edit Frame");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setSize(600, 300);
                frame.setVisible(true);
            }
            if (btnPressed == "Exit") {
                System.exit(0);
            }

        }
    }
}
