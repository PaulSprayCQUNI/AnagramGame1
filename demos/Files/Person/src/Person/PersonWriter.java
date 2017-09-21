package Person;

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.ArrayList;

public class PersonWriter {
	private static Formatter output;

	public PersonWriter(String fileName, ArrayList<Person> people) {

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

		// Write people to file
		for (Person p : people) {
			output.format("%s,%s,%d%n",p.getFirstName(),p.getLastName(),p.getYearOfBirth());
		}

		// Close the file
		output.close();
	}
}
