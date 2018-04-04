/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cqt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author s0287181
 */
public class CqtAppFrame extends JFrame {
    
    private JButton btnTour;
    private JButton btnTourGuide;
    private JButton btnSite;
    private JButton btnActivity;
    private ArrayList<Tour> listTours;
    private ArrayList<TourGuide> listTourGuides;
    private ArrayList<Site> listSites;
    private ArrayList<Activity> listActivities;
    
    
    public CqtAppFrame() {
        super("Panel App Demo");
        initComponents();
        initLists();
    }

    private void initComponents() {
        btnTour = new JButton("Input");
        btnTourGuide = new JButton("Input");
        btnSite = new JButton("Input");
        btnActivity = new JButton("Input");
        
        btnTour.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnTourActionPerformed(e);
            }
        });
        btnTourGuide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnTourActionPerformed(e);
            }
        });
        btnSite.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnTourActionPerformed(e);
            }
        });
        btnActivity.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnTourActionPerformed(e);
            }
        });
        add(btnTour);
        add(btnTourGuide);
        add(btnSite);
        add(btnActivity);
    }
    
    private void initLists() {
        this.listTours = new ArrayList<>();
        this.listTourGuides = new ArrayList<>();
        this.listSites = new ArrayList<>();
        this.listActivities = new ArrayList<>();
    }
    
    private void btnTourActionPerformed(ActionEvent e) {
        AddTourPanel t = new AddTourPanel(this.listTours); 
        JOptionPane.showMessageDialog(this, t, "Enter", JOptionPane.OK_OPTION);
        System.out.println(this.listTours);
    }
    
    private void btnInputActionPerformed(ActionEvent e) {
        AddGuidePanel g = new AddGuidePanel(this.listTourGuides); 
        JOptionPane.showMessageDialog(this, g, "Enter", JOptionPane.OK_OPTION);
        System.out.println(this.listTourGuides);
    }
    
    private void btnInputActionPerformed(ActionEvent e) {
        AddSitePanel s = new AddSitePanel(this.listSites); 
        JOptionPane.showMessageDialog(this, s, "Enter", JOptionPane.OK_OPTION);
        System.out.println(this.listSites);
    }
    
    private void btnInputActionPerformed(ActionEvent e) {
        AddActivityPanel a = new AddActivityPanel(this.listActivities); 
        JOptionPane.showMessageDialog(this, a, "Enter", JOptionPane.OK_OPTION);
        System.out.println(this.listActivities);
    }
}
