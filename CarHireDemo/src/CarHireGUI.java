/**
 * Supplied GUI code for ass2, coit11222, T2 2018
 * You are going to complete the code for each required method
 *
 // Programmer: Paul Spray S1208419
 // File: CarHireGUI.java
 // Date: October 01 2018
 // Purpose: COIT11222 assignment two T2-18
// Step Two of Assignment
**/



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
		final int MAX_NUM = 10;														//done -- CONSTANT for maximum of 10 entries
	 	private int currentCustomer = 0;											//done -- declare current customer number (an integer for indexing)- done
		private CarHire [] carHireArray = new CarHire [MAX_NUM];					//done -- array carHireArray declared for maximum 10 entries of CarHire objects

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
		if (nameField.getText().compareTo("") == 0)												// three data validation if statements, ensuring each required field has an entry
				{
					JOptionPane.showMessageDialog(null, "You must enter a customer name",
					"XYZ Car Hire App", JOptionPane.ERROR_MESSAGE);
					nameField.requestFocus();
					return;
				}

		if (licenseField.getText().compareTo("") == 0)
				{
					JOptionPane.showMessageDialog(null, "You must enter a license number",
					"XYZ Car Hire App", JOptionPane.ERROR_MESSAGE);
					licenseField.requestFocus();
					return;
				}

		if (daysField.getText().compareTo("") == 0)
				{
					JOptionPane.showMessageDialog(null, "You must enter days Hired",
					"XYZ Car Hire App", JOptionPane.ERROR_MESSAGE);
					daysField.requestFocus();
					return;
				}																				//done-- complete error message

		String customerName = nameField.getText();												//done --read in customer name,
		String licenseNumber = licenseField.getText();											//done -- read in license number
		int daysHired = Integer.parseInt(daysField.getText()); 									//done-- read in days hired, and add them as constructor parameters to the CarHire array element

	    carHireArray[currentCustomer] = new CarHire(customerName, licenseNumber, daysHired); 	// done - declare CarHire objects

		displayHeading();		           														//done-- call displayHeading() method

				textArea.append(String.format("%s\t%23s\t%s\t$%5.2f\n",							// final formatting for display to textArea - decided on after search of forum recommended combined tab use.
						carHireArray[currentCustomer].getCustomerName(),   						// done -- display customer name,
						carHireArray[currentCustomer].getLicenseNumber(),						// done-- display license number,
						carHireArray[currentCustomer].getDaysHired(),							// done-- display days hired
						carHireArray[currentCustomer].calculateHireRental()));					// done - display rental value returned from call to calculateHireRental() method in CarHire class backend code

		nameField.setText("");																	// done -- clear textfields and return focus
		licenseField.setText("");																// "
		daysField.setText("");																	// "
		nameField.requestFocus();																// return the cursor focus to the nameField box for the next customer entry

        currentCustomer++; 																		//done -- increment current customer number

		if (currentCustomer == MAX_NUM)
			{
			nameField.setText("");																// I decided to display a message once 10 entries maximum is reached
			licenseField.setText("");
			daysField.setText("");
			nameField.requestFocus();
			JOptionPane.showMessageDialog(null, "Maximum Entries. You may: Display/Search/Exit",
				"XYZ Car Hire App", JOptionPane.ERROR_MESSAGE);
				nameField.requestFocus();
			return;
			}
		}

        // Display all bookings
		public void displayAll()
		{
		int totalDaysHired = 0;																	// integer variable declared to add to the total days as the for loop below iterates
		double totalRental = 0;																	// double variable declared to add to the total rental as the the for loop iterates
		double averageDaysHired = 0.00;															// double variable declared be used after for loop to calculate average of totalDaysHired

		displayHeading();		         														// done-- call displayHeading() method

		for(int i = 0; i < currentCustomer; i++)												// done-- display all entries entered so far (need using a loop)
			{
				textArea.append(String.format("%s\t%23s\t%s\t$%5.2f\n",
						carHireArray[i].getCustomerName(),										// introduction of for loop index i to compare against the counting variable currentCustomer,
						carHireArray[i].getLicenseNumber(),										// means that [i] subscript of the carHireArray must be used to return a line with
						carHireArray[i].getDaysHired(),											// all values for each customer entered so far (when the for loop ends because i equals
						carHireArray[i].calculateHireRental()));								// the value of the counting variable.

				totalDaysHired = totalDaysHired + carHireArray[i].getDaysHired();				// inclusion of a statement similar to assignment 1 to output the  sum of days when the loop finishes iterating
				totalRental = totalRental + carHireArray[i].calculateHireRental();				// statement as above for totalling rental amount

		}

		averageDaysHired = (double)totalDaysHired / currentCustomer;							// as with assignment one, this average calcluation was included outside of the for loop
																								// calculation takes integer division of days hired and the currentCustomer count variable and conerts to a double
																								// extra textArea.append() line of dashes inserted below to separate displayed entries and statistics

		textArea.append("----------------------------------------------------------------------------------------------------\n");
		textArea.append(String.format(currentCustomer + " entries\n"));							// done -- display number of entries,
		textArea.append(String.format("Average days hired: %.2f\n", averageDaysHired));			// done -- display average days hired,
		textArea.append(String.format("Total rental received: $%.2f\n", totalRental));			// done -- display total rental


		if (currentCustomer == 0)																// done -- complete error message
					{
						JOptionPane.showMessageDialog(null, "No customer entered",
						"XYZ Car Hire App", JOptionPane.ERROR_MESSAGE);
						nameField.requestFocus();												// without any data entry, the cursor should go back to the name field for entry
						return;
					}

		}


        //search a particular customer booking
	    public void search()
	    {
			String inputName = JOptionPane.showInputDialog(null,
									"Enter a Customer Name to Search", "Search",
									JOptionPane.OK_CANCEL_OPTION);            					 //done - read search key (i.e. inputName) from input dialogue

			boolean found = false;																// boolean variable found declared as false preceeding loop

			for(int i = 0; i < currentCustomer; i++)											// done-- iterate through array for the search key
			{
				if(inputName.equalsIgnoreCase(carHireArray[i].getCustomerName()))				// search key is the inputName string and tested with a equalsIgnoreCase() method --
					{																			// -- against the CustomerName value for the 1st, 2nd, 3rd etc index position
					found = true;																// assignment for the boolean when the if statement is tested true
					textArea.setText("");														// I decided to clear the text area each time a search entry was used

					displayHeading();															// output of entry details from array index matched by testing inputName against carHireArray[i].getCustomerName
					textArea.append(String.format("%s\t%23s\t%s\t$%5.2f\n",
							carHireArray[i].getCustomerName(),
							carHireArray[i].getLicenseNumber(),
							carHireArray[i].getDaysHired(),
							carHireArray[i].calculateHireRental()));

					}

			}

				if (found != true)																// if the for loop does not assign true to the boolean, this if statment executes an error message
					{
						JOptionPane.showMessageDialog(null, "No such customer found!",			// done --  display the entry if it exists or error message if it doesn't
						"XYZ Car Hire App", JOptionPane.ERROR_MESSAGE);
					}

	    }	    //end of method

       	// exit the app
	   public void exit()

		{
			JOptionPane.showMessageDialog(null, "Thank you for using the XYZ Car Hire App");	 // done -- display exit message (pop up message box)here
			this.dispose();																		//done --to exit the system
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
