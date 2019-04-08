/*
 * The MIT License
 *
 * Copyright 2018 Steven Gordon <s.d.gordon@cqu.edu.au>.
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
package borderlayoutdemo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class BorderLayoutDemoFrame extends JFrame {

    private JPanel pnlLeft;
    private JPanel pnlRight;
    private JLabel lblFirstName;
    private JLabel lblLastName;
    private JLabel lblAge;
    private JTextField txtFirstName;
    private JTextField txtLastName;
    private JTextField txtAge;
    private JButton btnOk;
    private JButton btnClear;
    private JButton btnExit;
    private JPanel pnlRightTop;
    private JPanel pnlRightBottom;
    private JLabel lblResults;
    private JTextArea taResults;
    private JPanel pnlResults;

    BorderLayoutDemoFrame() {

        // Set the layout of the main frame
        setLayout(new BorderLayout());

        // Setup the left panel
        pnlLeft = new JPanel();
        pnlLeft.setLayout(new GridLayout(3, 2));

        lblFirstName = new JLabel("First name:");
        lblLastName = new JLabel("Last name:");
        lblAge = new JLabel("Age:");
        txtFirstName = new JTextField();
        txtLastName = new JTextField();
        txtAge = new JTextField();

        pnlLeft.add(lblFirstName);
        pnlLeft.add(txtFirstName);
        pnlLeft.add(lblLastName);
        pnlLeft.add(txtLastName);
        pnlLeft.add(lblAge);
        pnlLeft.add(txtAge);

        // Right panel
        pnlRight = new JPanel();
        pnlRight.setLayout(new GridLayout(2, 1));

        pnlRightTop = new JPanel();
        pnlRightTop.setLayout(new FlowLayout());
        pnlRightBottom = new JPanel();
        pnlRightBottom.setLayout(new FlowLayout());

        ButtonAction action;

        btnOk = new JButton("Ok");
        //btnOk.addActionListener(event
        //        -> JOptionPane.showMessageDialog(this, "Ok"));
        action = new ButtonAction("Ok");
        btnOk.addActionListener(action);

        btnClear = new JButton("Clear");
        action = new ButtonAction("Clear");
        btnClear.addActionListener(action);

        btnExit = new JButton("Exit");
        action = new ButtonAction("Exit");
        btnExit.addActionListener(action);

        pnlRightTop.add(btnOk);
        pnlRightBottom.add(btnClear);
        pnlRightBottom.add(btnExit);

        pnlRight.add(pnlRightTop);
        pnlRight.add(pnlRightBottom);

        // Results panel
        pnlResults = new JPanel();
        lblResults = new JLabel("Results:");
        taResults = new JTextArea(5, 20);
        pnlResults.add(lblResults);
        pnlResults.add(taResults);
        

        add(pnlLeft, BorderLayout.NORTH);
        add(pnlResults, BorderLayout.CENTER);
        add(pnlRight, BorderLayout.SOUTH);

    }

    private class ButtonAction implements ActionListener {

        private String buttonName;

        public ButtonAction(String buttonName) {
            this.buttonName = buttonName;
        }

        public void actionPerformed(ActionEvent event) {
            //System.out.println(buttonName);

            if (this.buttonName == "Clear") {
                txtFirstName.setText("");
                txtLastName.setText("");
                txtAge.setText("");
            }
            if (this.buttonName == "Exit") {
                System.exit(0);
            }
            if (this.buttonName == "Ok") {
                txtAge.setText("100");
            }
        }
    }

}
