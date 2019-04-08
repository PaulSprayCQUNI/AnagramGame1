/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panelapp;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class DataInput extends JPanel {

    private JButton btnAdd;
    private JButton btnCancel;
    private JLabel lblName;
    private JTextField txtName;
    private ArrayList<Person> lstPerson;
    private Person newPerson;

    public DataInput() {
        initComponents();
    }

    public DataInput(ArrayList<Person> lstPerson) {
        initComponents();

        this.lstPerson = lstPerson;
    }

    private void initComponents() {
        lblName = new JLabel("Name:");
        txtName = new JTextField();
        btnAdd = new JButton("Add");
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnAddActionPerformed(e);
            }
        });

        btnCancel = new JButton("Cancel");

        this.setLayout(new GridLayout(4, 1));
        add(lblName);
        add(txtName);
        add(btnAdd);
        add(btnCancel);
    }

    private void btnAddActionPerformed(ActionEvent e) {
        newPerson = new Person(this.txtName.getText());
        this.lstPerson.add(newPerson);
        System.out.println(newPerson);

    }

}
