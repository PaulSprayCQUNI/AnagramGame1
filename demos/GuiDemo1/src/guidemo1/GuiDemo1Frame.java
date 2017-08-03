/*
 * The MIT License
 *
 * Copyright 2017 Steven Gordon <s.d.gordon@cqu.edu.au>.
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
package guidemo1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class GuiDemo1Frame extends JFrame {

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

    public GuiDemo1Frame() {

        setLayout(new GridLayout(1, 2));

        pnl1 = new JPanel();
        pnl1.setLayout(new BorderLayout());

        pnl2 = new JPanel();

        lbl1 = new JLabel("Hello");
        lbl2 = new JLabel("Everyone");
        
        btn1 = new JButton("Exit1");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e) {
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
        btn5.addActionListener(action);

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
