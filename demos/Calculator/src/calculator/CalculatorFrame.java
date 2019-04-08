/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author sgordon
 */
public class CalculatorFrame extends JFrame {
    private JPanel resultPanel;
    private JPanel buttonPanel;
    private JTextField resultTxt;
    
    private int result;
    private int operand1;
    private int operand2;
    private String running;
    private String lastOperator;
    
    public CalculatorFrame() {
        
        running = "";
        lastOperator = "+";
        result = 0;
        operand1 = 0;
        operand2 = 0;
        
        /* Create results panel and text field */        
        resultPanel = new JPanel();
        resultPanel.setLayout(new BorderLayout());
        resultTxt = new JTextField();
        resultPanel.add(resultTxt, BorderLayout.CENTER);
        
        /* Create buttons */
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4,4));
        String[] buttonLabels = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"}; 
        
        for (String b : buttonLabels) {
            makeButton(b);
        }
        
        /* Add panels and layout */
        setLayout(new BorderLayout());
        add(resultPanel,BorderLayout.NORTH);
        add(buttonPanel,BorderLayout.SOUTH);
        pack();
        
    }
    
    public void makeButton(String name) {
        JButton button = new JButton(name);
        buttonPanel.add(button);
        if (name == "+" || name == "-" || name == "*" || name == "/" || name == "=") {
            OperatorButtonAction action = new OperatorButtonAction(name);
            button.addActionListener(action);
        }
        else {
            NumberButtonAction action = new NumberButtonAction(name);            
            button.addActionListener(action);
        }
    }
    
    private class NumberButtonAction implements ActionListener {
        private String numberStr;
        public NumberButtonAction(String numberStr) {
            this.numberStr = numberStr;
        }
        
        public void actionPerformed(ActionEvent event) {
            running = running + numberStr;
            resultTxt.setText(running);
        }
    } 
    
    private class OperatorButtonAction implements ActionListener {
        private String numberStr;
        public OperatorButtonAction(String numberStr) {
            this.numberStr = numberStr;
        }
        
        public void actionPerformed(ActionEvent event) {
            operand2 = Integer.parseInt(running);
            running = "";
            if (lastOperator == "+") {
                result = result + operand2;
            }
            else if (lastOperator == "-") {
                result = result - operand2;
            }
            else if (lastOperator == "*") {
                result = result * operand2;
            }
            else if (lastOperator == "/") {
                result = result / operand2;
            }
            else if (lastOperator == "=") {
                result = result;
            }
            lastOperator = numberStr;
            
            operand2 = 0;

            resultTxt.setText(Integer.toString(result));
        }
    } 
    
}
