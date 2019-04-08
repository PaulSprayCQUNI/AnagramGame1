import java.io.*;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.ArrayList;

public class PersonReader {
	private ArrayList<Person> people;
	private static Scanner fileScanner;

	public PersonReader (String fileName) throws MyFormatException {

		// Open the file
		try {
			fileScanner = new Scanner(Paths.get(fileName));
		}
		catch (IOException ioException) {
			System.err.println("Error opening file. Terminating.");
			System.exit(1);
		}

		// Initialise list of people
		people = new ArrayList<Person> ();
	    
		// Read file line-by-line
		while (fileScanner.hasNextLine()) {
			String line = fileScanner.nextLine();

			// Get the current line 
			Scanner lineScanner = new Scanner(line);

			// Set separator to comma
			lineScanner.useDelimiter(",");

			// Create a new person
			Person p = new Person();
			
			// Read the fields from line into person
			try {
				p.setFirstName(lineScanner.next());
				p.setLastName(lineScanner.next());
                                Integer y = Integer.parseInt(lineScanner.next());
                                if (y<0) {
                                    throw new MyFormatException("negative year for " + p.getFirstName() + " ");
                                }
				p.setYearOfBirth(y);
			}
			// Wrong format of fields
			catch (IllegalArgumentException argumentException) {
				System.err.println("Error reading file due to illegal argument. Terminating.");
				System.exit(1);
			} // File formatted incorrectly
			catch (NoSuchElementException elementException) {
				System.err.println("Error read file due to no such element. Terminating.");
				System.exit(1);
			}
	    
			// Add the person to array
			people.add(p);

			// Close the line
			lineScanner.close();
		}
		
		// Close the file
		fileScanner.close();
	}

	// Getter methods
	public ArrayList<Person> getPeople() {
		return people;
	}
}
