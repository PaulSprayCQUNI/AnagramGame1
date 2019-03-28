/**
 * Supplied GUI code for ass2, coit11222, T2 2018
 * You are going to complete the code for each required method
 *
**/
/*

public static void main(String [] args)
	{
		//carHireArray[currentCustomer] = new CarHire(customerName, licenseNumber, daysHired); 		   //declare CarHire objects -done
		CarHire rental = new CarHire();
		rental.setCustomerName("Paul Spray");
		rental.setLicenseNumber("123 445 689");
		rental.setDaysHired(10);
		double rentalOne = rental.calculateHireRental();


		System.out.printf(String.format("%-23s%-25s%-28s%-26s\n", "Customer name", "License number", "Days hired", "Rental"));

        System.out.printf(String.format("----------------------------------------------------------------------------------------------------\n")); // to be replaced with append methods in main codes
		System.out.print(String.format("%-23s%-25s%-28d", rental.getCustomerName(), rental.getLicenseNumber(), rental.getDaysHired()));
		System.out.printf("$%-26.2f\n", rental.calculateHireRental());

	}
*/


import java.awt.FlowLayout;
import java.awt.Font;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

// class definition
public class CarHireGUI extends JFrame implements ActionListener
{
		final int MAX_NUM = 10;
	 	private int currentCustomer = 0;											//done -- declare current customer number (an integer for indexing)- done
		private CarHire [] carHireArray = new CarHire [MAX_NUM];


        //GUI components building
        private JLabel nameLabel=new JLabel("Customer name");
        private JLabel licenseLabel=new JLabel("License number");
	    private JLabel daysLabel=new JLabel("Hired days");

	    private JTextField nameField=new JTextField(28);
        private JTextField licenseField=new JTextField(14);
        private JTextField daysField=new JTextField(7);

        private JButton enterButton=new JButton("Enter");   //
	    private JButton displayButton=new JButton("Display");
        private JButton searchButton= new JButton("Search");

        private JButton exitButton=new JButton("Exit");
        private JTextArea textArea=new JTextArea(16,38);
        private JScrollPane scrollPane; // scroll pane for the text area

        private static final int FRAME_WIDTH = 490;// window size
        private static final int FRAME_HEIGHT = 430;

        //Constructs
        public CarHireGUI()
        {
           super("  XYZ Car Hire App   ");
           setLayout(new FlowLayout());  //FlowLayout

           add(nameLabel);              //add components to JFrame
           add(nameField);
           add(licenseLabel);
           add(licenseField);
           add(daysLabel);
           add(daysField);

           scrollPane = new JScrollPane(textArea); 	// add text area to the scroll pane
		   scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER); // just need vertical scrolling
	       add(scrollPane);

           add(enterButton);
           add(displayButton);
           add(searchButton);
           add(exitButton);

           add(textArea);
           enterButton.addActionListener(this);  //listen to event
           displayButton.addActionListener(this);
           searchButton.addActionListener(this);
           exitButton.addActionListener(this);
        }

        //event handling method
        public void actionPerformed(ActionEvent e)
        {
			String actionString=e.getActionCommand();
			switch(actionString)
			{
				case "Enter":
					enterData();
					break;
				case "Display":
					displayAll();
					break;
				case "Search":
					search();
					break;
				case "Exit":
					exit();
					break;
				default:
					System.out.println("invalid input");
			}
		}

        // process input data
        public void enterData()
        {
			displayHeading();		           //done-- call displayHeading() method
			//carHireArray[currentCustomer] = new CarHire(customerName, licenseNumber, daysHired); 		   //declare CarHire objects -- done



			/*
			for (currentCustomer=0; currentCustomer < MAX_NUM; currentCustomer++)
			{
			setCustomerName("");
			setLicenseNumber("");
			setDaysHired();
			rental = rental.calculateHireRental();

			}
           //todo-- read in customer name, license number, days hired, and add them as constructor parameters to the CarHire array element
           //todo-- display customer name, license number, days hired and rental to the textArea
           //todo-- clear textfields and return focus
           //todo-- complete error message
           //dodo-- incremental current cusomer number
           */
		}

        // Display all bookings
		public void displayAll()
		{
		   //todo-- call displayHeading() method
           //todo-- display all entries entered so far (need using a loop)
           //todo-- display number of entries, average days hired, total rental
           //todo-- complete error message
		}


        //search a particular customer booking
	    public void search()
	    {
            //todo-- read search key (i.e. customer name) from input dialogue
			//todo-- iterate through array for the search key
			//todo-- display the entry if it exists or error message if it doesn't

	    }//end of method

       // exit the app
	   public void exit()
	   {
         //todo--display exit message (pop up message box)here
         //todo--to exit the system
	   }

       //helper method to display heading
       private void displayHeading()
       {
            textArea.setText(String.format("%-23s%-25s%-28s%-26s\n", "Customer name", "License number", "Days hired", "Rental"));
            textArea.append("----------------------------------------------------------------------------------------------------\n");
	   }

       //main method
       public static void main(String[] args)
       {
		   JFrame frame = new CarHireGUI();
		   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		   frame.setVisible(true);
		   frame.setResizable(false);
	   }

}// end of class definition
