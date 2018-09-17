/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w9assignmentshell;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class RequestWriter {

    private static Formatter output;

    public RequestWriter(String fileName, ArrayList<Request> listRequests) {

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

        // Write requests to file
        for (Request r : listRequests) {
            // %s means string
            // %d means integer
            // %n means newline
            output.format("%s %s%n", r.getRequestNumber(), r.getRequestId());
        }

        // Close the file
        output.close();
    }
}
