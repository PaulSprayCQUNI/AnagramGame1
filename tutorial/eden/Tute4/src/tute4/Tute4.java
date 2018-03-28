/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tute4;


/**
 *
 * @author Eden Thornbury Hemming e.thornburyhemming@cqumail.com
 */
import javax.swing.*;
import java.awt.*;
public class Tute4 extends JFrame {

    
    
    JButton ok = new JButton("OK");
    JButton cancel = new JButton("Cancel");
    JButton setup  = new JButton("Setup...");
    JButton help = new JButton("Help");
    JTextArea frame1 = new JTextArea(15,30);
    JTextArea frame2 = new JTextArea(10,30);
    JTextArea frame3 = new JTextArea(15,30);
    CheckboxGroup cbg = new CheckboxGroup();
    ButtonGroup cbg2 = new ButtonGroup();
    JCheckBox image = new JCheckBox("Image");
    JCheckBox text = new JCheckBox("Text");
    JCheckBox code = new JCheckBox("Code");
    JRadioButton selection = new JRadioButton("Selection");
    JRadioButton all = new JRadioButton("All");
    JRadioButton applet = new JRadioButton("Applet");
    JCheckBox printToFile = new JCheckBox("Print To File");
    JLabel printQuality = new JLabel("Print Quality: ");
    JLabel printer= new JLabel("Printer: MyPrinter");
    JComboBox combo = new JComboBox();
    
    Tute4(){
        
       JFrame jframe1 = new JFrame();
        jframe1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe1.setPreferredSize(new Dimension(500,300));
        jframe1.pack();
        jframe1.setLocationRelativeTo(null);
        
        cancel.addActionListener(event -> System.exit(0));
        
        jframe1.setLayout(new BorderLayout());
        JPanel centre = new JPanel(new BorderLayout());
        JPanel grid = new JPanel(new GridLayout(0,5));
        JPanel grid2 = new JPanel(new GridLayout(4,0));
        JPanel grid3 = new JPanel(new GridLayout(0,3));
       JPanel grid4 = new JPanel(new GridLayout(0,1));
       JPanel grid5 = new JPanel(new GridLayout(3,0));
       JPanel grid6 = new JPanel(new GridLayout(0,1));
       JPanel grid7 = new JPanel(new GridLayout(3,0));
       JPanel grid8 = new JPanel(new GridLayout(1,0));
        
        
        jframe1.add(printer, BorderLayout.NORTH);
        
        grid2.add(ok);
        grid2.add(cancel);
        grid2.add(setup);
        grid2.add(help);
        
        jframe1.add(grid2, BorderLayout.EAST);
        
        grid4.add(frame1);
        
        grid5.add(image, cbg);
        grid5.add(text, cbg);
        grid5.add(code, cbg);
        
        grid6.add(frame2);
               cbg2.add(selection);
               cbg2.add(all);
               cbg2.add(applet);
        grid7.add(selection);
        grid7.add(all);
        grid7.add(applet);
        
        grid8.add(frame3);
        
        grid.add(grid4);
        grid.add(grid5);
        grid.add(grid6);
        grid.add(grid7);
        grid.add(grid8);
        
        centre.add(grid, BorderLayout.CENTER);
        jframe1.add(centre, BorderLayout.CENTER);
        grid3.add(printQuality);
        
        combo.addItem("High");
        combo.addItem("Low");
        grid3.add(combo);
        grid3.add(printToFile);
        centre.add(grid3, BorderLayout.SOUTH);
        jframe1.setVisible(true);
        
        
    }
    public static void main(String[] args) {
        Tute4 test = new Tute4(); 
        
    }
    
}
