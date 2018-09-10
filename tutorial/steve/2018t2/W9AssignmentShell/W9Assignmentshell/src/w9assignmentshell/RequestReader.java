/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w9assignmentshell;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class RequestReader {

    private ArrayList<Request> requestList;
    private static Scanner fileScanner;

    public RequestReader(String fileName) {

        // Open the file
        try {
            fileScanner = new Scanner(Paths.get(fileName));
        } catch (IOException ioException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }

        // Initialise list of requests
        requestList = new ArrayList<>();

        // Read file line-by-line
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();

            // Get the current line 
            Scanner lineScanner = new Scanner(line);

            // Set separator to space
            lineScanner.useDelimiter(" ");

            // Read the fields from line into temporary variables
            int requestNumber;
            String requestId;
            Request r = null;
            try {
                requestNumber = Integer.parseInt(lineScanner.next());
                requestId = lineScanner.next();
                r = new StaffRequest(requestNumber, requestId, 1);
                NumberGenerator.increment();

            } // Wrong format of fields
            catch (IllegalArgumentException e) {
                System.err.println("Error reading file due to illegal argument. Terminating.");
                System.exit(1);
            } // File formatted incorrectly
            catch (NoSuchElementException e) {
                System.err.println("Error reading file due to no such element. Terminating.");
                System.exit(1);
            }

            // Add the request to array
            requestList.add(r);

            // Close the line
            lineScanner.close();
        }

        // Close the file
        fileScanner.close();
    }

    // Getter methods
    public ArrayList<Request> getRequestList() {
        return requestList;
    }
}
