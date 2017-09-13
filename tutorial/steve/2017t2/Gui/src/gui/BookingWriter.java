/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.ArrayList;

public class BookingWriter {
	private static Formatter output;

	public BookingWriter(String fileName, ArrayList<Booking> bookingList) {

		// Open the output file
		try {
			output = new Formatter(fileName);
		}
		catch (SecurityException securityException) {
			System.err.println("Write permission denied. Terminating.");
			System.exit(1);
		}
		catch (FileNotFoundException fileNotFoundException) {
			System.err.println("Error opening the file. Terminating.");
			System.exit(1);
		}

		// Write bookingList to file
		for (Booking p : bookingList) {
			output.format("%s,%s,%d%n",p.getFirstName(),p.getLastName(),p.getYearOfBirth());
		}

		// Close the file
		output.close();
	}
}