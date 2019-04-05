/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuna;

/**
 *
 * @author Paul Spray <paul.spray@cqumail.com>
 * package Tuna is all about talking about inheritance and is based on the
 * tutorial at https://www.youtube.com/watch?v=9JpNY-XAseg - the new boston.
 * 
 *  //event handling - tutorial 52 and 53
 */
import java.awt.FlowLayout;         // default layout management
import java.awt.event.ActionListener;          // basic window
import java.awt.event.ActionEvent;          //  add a line of text
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class Tuna extends JFrame {    // Tuna inherits all the attributes and methods from JFrame

    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    private JPasswordField passwordField;
    
    public Tuna (){         // anything here in the method is what will define the window of the GUI
        
        super("The title bar for this Amazing GUI");
        setLayout(new FlowLayout());               // setLayout method, with FlowLayout method within
        
        item1 = new JTextField(10);            // length of 10 for TextField
        add(item1);                        // don't forget to add it
        
        item2 = new JTextField("enter text here");
        add(item2);
        
        item3 = new JTextField("uneditable", 20);
        item3.setEditable(false);                   //  use this for graying out, non-editable fields
        add(item3);
        
        passwordField = new JPasswordField("mypass");
        add(passwordField);
        
                                                    // Tutorial 53 - build a listener object here to do something in connection to another class that it is listening to
                                                    
        theHandler handler = new theHandler();      // the event handler needs to take an object as an argument
        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);
        passwordField.addActionListener(handler);
        
    }
    
    private class theHandler implements ActionListener{         //enables handling of events that are listened for
        
        @Override
        public void actionPerformed(ActionEvent event){         //actionPeformed is a built in method to react to events occuring
            
            String string = "";
            
            if (event.getSource()==item1)       // enter is clicked on JTextField item1 - it will do what we have told it, base on nested if, else if conditions
                string = String.format("field 1: %s", event.getActionCommand());
            else if (event.getSource()==item2)       
                string = String.format("field 2: %s", event.getActionCommand());
            else if (event.getSource()==item3)       
                string = String.format("field 3: %s", event.getActionCommand());
            else if(event.getSource()==passwordField)
                    string = String.format("password field is: %s", event.getActionCommand());
                                                                      
            JOptionPane.showMessageDialog(null, string);
        }                                   
               
              
        
    }
    
   
    /*    
    private JLabel item1;            //  a variable of type JLabel - tutorial 51
            
    public Tuna(){
        super("The title bar");
        setLayout(new FlowLayout());
        
        item1 = new JLabel("this is a sentence");
        item1.setToolTipText("This is going to show up on hover");      // hover is neat to do
        add (item1);
    }        
    
     */

 /* public void eat(){
            * There could be many classes of Food like this in a progam, and 
            * and every class could have a method like this one with the output statment below,
            * but what if you suddenly needed to change the text of all the food classes?
            * System.out.println("I am the eat method");
            * Making this change without changing every class uses inheritance.
             * The variables and methods can instead be inherited from a parent class, or super 
             * or super class - like Food
     */
    //per line 20 in Apples - we can recreate the inherited method within a subclass to show how the subclass' method will override - just for Tuna
    /*
    @Override
    public void eat(){
       
            System.out.println("I am the new eat method, just for Tuna yo!");
    }
     */
}
