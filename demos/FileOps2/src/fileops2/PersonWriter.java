/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileops2;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
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
        } catch (SecurityException securityException) {
            System.err.println("Write permission denied. Terminating.");
            System.exit(1);
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening the file. Terminating.");
            System.exit(1);
        }

        // Write people to file
        for (Person p : people) {
            output.format("%s,%s,%d%n", p.getFirstName(), p.getLastName(), p.getYearOfBirth());
        }

        // Close the file
        output.close();
    }
}
