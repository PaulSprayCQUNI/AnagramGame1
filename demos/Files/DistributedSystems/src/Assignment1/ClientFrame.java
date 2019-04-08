/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*
- How to get selected item from JComboBox?
- How to swap/change GUI with button?
- 
 */
package Assignment1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author brook
 */
public class ClientFrame extends JFrame implements ActionListener {

    String[] locationString = {"", "Sydney", "Melbourne", "Brisbane"};
    String[] inOutString = {"", "Sign In", "Sign Out"};

    private CardLayout client = new CardLayout();
    private JComboBox locationList = new JComboBox(locationString);
    private JComboBox inOutList = new JComboBox(inOutString);
    private JLabel lLocation = new JLabel("Location?");
    private JLabel lBlank = new JLabel("      ");
    private JLabel lMobile = new JLabel("Mobile Number:");
    private JLabel lPin = new JLabel("Pin:");
    private JTextField tMobile = new JTextField(6);
    private JTextField tPin = new JTextField(3);
    private JButton bOK = new JButton("OK");
    private JButton bCancel = new JButton("Cancel");
    private JButton bSend = new JButton("Send");
    private JButton bClear = new JButton("Clear");
    private JPanel pLocation = new JPanel();
    private JPanel pLocSouth = new JPanel();
    private JPanel pLocCenter = new JPanel();
    private JPanel pLogin = new JPanel();
    private JPanel pLogCenter = new JPanel();
    private JPanel pLogSouth = new JPanel();

    private Container con = getContentPane();

    public ClientFrame() {
        con.setLayout(client);
        con.add(pLocation);
        con.add(pLogin);

        pLocation.setLayout(new BorderLayout());
        pLogin.setLayout(new BorderLayout());

        pLocCenter.setLayout(new FlowLayout());
        pLocCenter.add(lLocation);
        pLocCenter.add(lBlank);
        pLocCenter.add(locationList);
        locationList.addActionListener(this);

        pLocSouth.setLayout(new FlowLayout());
        pLocSouth.add(bOK);
        pLocSouth.add(bCancel);
        bOK.addActionListener(this);
        bCancel.addActionListener(this);

        pLogCenter.setLayout(new FlowLayout());
        pLogCenter.add(lMobile);
        pLogCenter.add(tMobile);
        pLogCenter.add(lPin);
        pLogCenter.add(tPin);
        pLogCenter.add(inOutList);
        inOutList.addActionListener(this);

        pLogSouth.setLayout(new FlowLayout());
        pLogSouth.add(bSend);
        pLogSouth.add(bClear);
        bSend.addActionListener(this);
        bClear.addActionListener(this);

        pLocation.add(pLocSouth, BorderLayout.SOUTH);
        pLocation.add(pLocCenter, BorderLayout.CENTER);
        pLogin.add(pLogCenter, BorderLayout.CENTER);
        pLogin.add(pLogSouth, BorderLayout.SOUTH);

    }

    public void actionPerformed(ActionEvent buttons) {
        String command = buttons.getActionCommand();

        if (command.compareTo("Cancel") == 0) {
            cancel();
        } else if (command.compareTo("OK") == 0) {
            ok();
        } else if (command.compareTo("Clear") == 0) {
            clear();
        } else if (command.compareTo("Send") == 0) {
            Send();
        }

    }

    private void cancel() {
        JOptionPane.showMessageDialog(ClientFrame.this, "GoodBye", "Home Hills", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }

    private void ok() {
        setContentPane(pLogin);
    }

    private void clear() {
        inOutList.setSelectedItem(0);
        tMobile.setText("");
        tPin.setText("");
    }

    private void Send() {
        if (tMobile.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(ClientFrame.this, "A mobile number has not been entered", "FNQ Home Care", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (tPin.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(ClientFrame.this, "A pin has not been entered", "FNQ Home Care", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

}
